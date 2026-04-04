import java.security.MessageDigest;
import java.util.Base64;
import java.util.Scanner;

class ChainOfResponsibilityDemo {

    static RequestHandler wrapInTransactionTag = req ->
            new Request(String.format("<transaction>%s</transaction>", req.getData()));

    static RequestHandler createDigest = req -> {
        String digest = "";
        try {
            final MessageDigest md5 = MessageDigest.getInstance("MD5");
            final byte[] digestBytes = md5.digest(req.getData().getBytes("UTF-8"));
            digest = new String(Base64.getEncoder().encode(digestBytes));
        } catch (Exception ignored) {
            System.out.println("An error occurred");
        }
        return new Request(req.getData() + String.format("<digest>%s</digest>", digest));
    };

    static RequestHandler wrapInRequestTag = req ->
            new Request(String.format("<request>%s</request>", req.getData()));

    /**
     * Chain of handlers:
     * 1) wrapInTransactionTag
     * 2) createDigest
     * 3) wrapInRequestTag
     */
    static RequestHandler commonRequestHandler =
            wrapInTransactionTag
                    .setSuccessor(createDigest)
                    .setSuccessor(wrapInRequestTag);

    @FunctionalInterface
    interface RequestHandler {

        Request handle(Request request);

        default RequestHandler setSuccessor(RequestHandler next) {
            return request -> next.handle(this.handle(request));
        }
    }

    static class Request {
        private final String data;

        public Request(String requestData) {
            this.data = requestData;
        }

        public String getData() {
            return data;
        }
    }

    public static void main(String[] args) throws Exception {

        final Scanner scanner = new Scanner(System.in);

        final String requestData = scanner.nextLine();

        final Request notCompletedRequest = new Request(requestData);

        System.out.println(commonRequestHandler.handle(notCompletedRequest).getData());
    }
}