import java.util.ArrayList;
import java.util.Scanner;

public class DataEntryProgram {

    private ArrayList<Person> persons;

    public DataEntryProgram() {
        persons = new ArrayList<>();
    }

    // Method to add a new person
    public void addPerson(String name, int age) {
        Person person = new Person(name, age);
        persons.add(person);
        System.out.println("Person added successfully.");
    }

    // Method to view all persons
    public void viewPersons() {
        if (persons.isEmpty()) {
            System.out.println("No persons in the list.");
        } else {
            for (Person person : persons) {
                System.out.println(person);
            }
        }
    }

    // Method to run the program
    public void run() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1. Add Person");
            System.out.println("2. View Persons");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter age: ");
                    int age = scanner.nextInt();
                    addPerson(name, age);
                    break;
                case 2:
                    viewPersons();
                    break;
                case 3:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    public static void main(String[] args) {
        DataEntryProgram program = new DataEntryProgram();
        program.run();
    }
}

class Person {
    private String name;
    private int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // toString method to display the person's information
    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age;
    }
}