import java.util.ArrayList;
import java.util.Scanner;

public class BirdCollection {
    private ArrayList<Bird> collection;

    public BirdCollection() {
        collection = new ArrayList<>();
    }

    public void addBird(Scanner scanner) {
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("Latin name: ");
        String latinName = scanner.nextLine();
        collection.add(new Bird(name, latinName));
    }

    public void observedBird(Scanner scanner) {
        System.out.print("What was observed:? ");
        String name = scanner.nextLine();
        for (Bird bird : collection) {
            if (bird.getName().equalsIgnoreCase(name)) {
                bird.observed();
                return;
            }
        }
        System.out.println("Is not a bird!");
    }

    public void allStatistics() {
        for (Bird bird : collection) {
            System.out.println(bird.toString());
        }
    }

    public void birdStatistics(Scanner scanner) {
        System.out.print("What? ");
        String name = scanner.nextLine();
        for (Bird bird : collection) {
            if (bird.getName().equalsIgnoreCase(name)) {
                System.out.println(bird.toString());
                return;
            }
        }
        System.out.println("Is not a bird!");
    }
}
