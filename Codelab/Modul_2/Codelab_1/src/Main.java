import java.util.Scanner;

class Animal {
    String name;
    String type;
    String sound;


    Animal(String name, String type, String sound) {
        this.name = name;
        this.type = type;
        this.sound = sound;
    }


    void displayInfo() {
        System.out.println("\n=== Animal Info ===");
        System.out.println("Name  : " + name);
        System.out.println("Type  : " + type);
        System.out.println("Sound : " + sound);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter first animal details:");
        System.out.print("Name  : ");
        String name1 = scanner.nextLine();
        System.out.print("Type  : ");
        String type1 = scanner.nextLine();
        System.out.print("Sound : ");
        String sound1 = scanner.nextLine();


        System.out.println("\nEnter second animal details:");
        System.out.print("Name  : ");
        String name2 = scanner.nextLine();
        System.out.print("Type  : ");
        String type2 = scanner.nextLine();
        System.out.print("Sound : ");
        String sound2 = scanner.nextLine();


        Animal animal1 = new Animal(name1, type1, sound1);
        Animal animal2 = new Animal(name2, type2, sound2);

        
        animal1.displayInfo();
        animal2.displayInfo();

        scanner.close();
    }
}
