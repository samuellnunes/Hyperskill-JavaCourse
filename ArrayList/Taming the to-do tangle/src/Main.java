import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> taskList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextLine()) {
            String operation = scanner.nextLine();

            if (operation.equals("add")) {
                String task = scanner.nextLine();
                taskList.add(task);

            } else if (operation.equals("remove")) {
                int index = Integer.parseInt(scanner.nextLine());
                if (index >= 0 && index < taskList.size()) {
                    taskList.remove(index);
                }

            } else if (operation.equals("display")) {
                System.out.println(taskList);
            }
        }

        scanner.close();
    }
}