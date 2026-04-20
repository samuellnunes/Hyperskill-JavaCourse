import java.util.concurrent.*;

class FutureUtils {

    public static int determineCallableDepth(Callable callable) throws Exception {
        int depth = 0;
        Object result = callable;

        while (result instanceof Callable) {
            depth++;
            result = ((Callable) result).call();
        }

        return depth;
    }
}