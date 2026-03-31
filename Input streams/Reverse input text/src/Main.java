import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder input = new StringBuilder();
        int ch;

        while ((ch = reader.read()) != -1) {
            input.append((char) ch);
        }

        input.reverse();
        System.out.print(input.toString());

        reader.close();
    }
}