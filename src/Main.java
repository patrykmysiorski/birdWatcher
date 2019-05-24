import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BirdCollection list = new BirdCollection();
        String command = "";
        while (!command.equals("Quit")) {
            System.out.print("? ");
            command = scanner.nextLine();

            if (command.equals("Add")) {
                list.addBird(scanner);
            } else if (command.equals("Observation")) {
                list.observedBird(scanner);
            } else if (command.equals("Statistics")) {
                list.allStatistics();
            } else if (command.equals("Show")) {
                list.birdStatistics(scanner);
            }
        }
    }
}
