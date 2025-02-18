import Model.Charakter;
import Model.Produkt;
import Repository.Repository;
import Repository.InMemoryRepository;

import java.util.List;
import java.util.Scanner;

public class ConsoleView {
    public static void main(String[] args) {
        Repository<Charakter> CharakterRepo=new InMemoryRepository<Charakter>();
        Repository<Produkt>ProduktRepo=new InMemoryRepository<Produkt>();
        Controller controller=new Controller(CharakterRepo,ProduktRepo);
        ConsoleView console=new ConsoleView(controller);
        console.start();
    }

    private final Controller controller;
    private final Scanner scanner;

    /**
     * Constructs a new ConsoleView with the specified controller.
     *
     * @param controller the controller handling CRUD operations for Charakter and Produkt
     */
    public ConsoleView(Controller controller) {
        this.controller = controller;
        this.scanner = new Scanner(System.in);
    }

    /**
     * Starts the console interface and displays the main menu until the user exits.
     */
    public void start() {
        boolean exit = false;
        while (!exit) {
            printMenu();
            String option = scanner.nextLine();
            switch (option) {
                // --- CRUD operations for Charakter ---
                case "1":
                    createCharakter();
                    break;
                case "2":
                    getCharakter();
                    break;
                case "3":
                    updateCharakter();
                    break;
                case "4":
                    deleteCharakter();
                    break;
                case "5":
                    listAllCharakter();
                    break;
                // --- CRUD operations for Produkt ---
                case "6":
                    createProdukt();
                    break;
                case "7":
                    getProdukt();
                    break;
                case "8":
                    updateProdukt();
                    break;
                case "9":
                    deleteProdukt();
                    break;
                case "10":
                    listAllProdukt();
                    break;
                case "0":
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
        System.out.println("Exiting application.");
    }

    /**
     * Prints the main menu.
     */
    private void printMenu() {
        System.out.println("\n=== Console Menu ===");
        System.out.println("Charakter Operations:");
        System.out.println("  1. Create Charakter");
        System.out.println("  2. Get Charakter by ID");
        System.out.println("  3. Update Charakter");
        System.out.println("  4. Delete Charakter");
        System.out.println("  5. List all Charakter");
        System.out.println("Produkt Operations:");
        System.out.println("  6. Create Produkt");
        System.out.println("  7. Get Produkt by ID");
        System.out.println("  8. Update Produkt");
        System.out.println("  9. Delete Produkt");
        System.out.println(" 10. List all Produkt");
        System.out.println("  0. Exit");
        System.out.print("Enter your option: ");
    }

    // --- CRUD methods for Charakter ---

    /**
     * Prompts the user to create a new Charakter entity.
     * <p>
     * **Note:** This is a placeholder. Refactor this method to create a concrete Charakter entity.
     * </p>
     */
    private void createCharakter() {
        System.out.println("\n[Create Charakter]");
        System.out.print("Enter ID for Charakter: ");
        int id = Integer.parseInt(scanner.nextLine());
        // TODO: Replace the following with actual prompts for Charakter properties and instantiation.
        Charakter entity = null;
        System.out.println("Refactor createCharakter() to instantiate a concrete Charakter entity.");
        // Once instantiated, call the controller:
        // controller.createCharakter(entity);
    }

    /**
     * Prompts the user to retrieve an Charakter entity by ID.
     */
    private void getCharakter() {
        System.out.println("\n[Get Charakter]");
        System.out.print("Enter ID for Charakter: ");
        int id = Integer.parseInt(scanner.nextLine());
        Charakter entity = controller.getCharakter(id);
        if (entity != null) {
            System.out.println("Found: " + entity.toString());
        } else {
            System.out.println("Charakter with ID " + id + " not found.");
        }
    }

    /**
     * Prompts the user to update an existing Charakter entity.
     * <p>
     * **Note:** This is a placeholder. Refactor this method to modify a concrete Charakter entity.
     * </p>
     */
    private void updateCharakter() {
        System.out.println("\n[Update Charakter]");
        System.out.print("Enter ID for Charakter to update: ");
        int id = Integer.parseInt(scanner.nextLine());
        Charakter entity = controller.getCharakter(id);
        if (entity == null) {
            System.out.println("Charakter with ID " + id + " not found.");
            return;
        }
        // TODO: Update the properties of the retrieved entity.
        System.out.println("Refactor updateCharakter() to modify the concrete Charakter entity.");
        // After modification, call:
        // controller.updateCharakter(entity);
    }

    /**
     * Prompts the user to delete an Charakter entity by ID.
     */
    private void deleteCharakter() {
        System.out.println("\n[Delete Charakter]");
        System.out.print("Enter ID for Charakter to delete: ");
        int id = Integer.parseInt(scanner.nextLine());
        controller.deleteCharakter(id);
        System.out.println("Charakter with ID " + id + " deleted (if it existed).");
    }

    /**
     * Lists all Charakter entities.
     */
    private void listAllCharakter() {
        System.out.println("\n[List All Charakter]");
        List<Charakter> list = controller.getAllCharakter();
        if (list.isEmpty()) {
            System.out.println("No Charakter entities found.");
        } else {
            list.forEach(entity -> System.out.println(entity.toString()));
        }
    }

    // --- CRUD methods for Produkt ---

    /**
     * Prompts the user to create a new Produkt entity.
     * <p>
     * **Note:** This is a placeholder. Refactor this method to create a concrete Produkt entity.
     * </p>
     */
    private void createProdukt() {
        System.out.println("\n[Create Produkt]");
        System.out.print("Enter ID for Produkt: ");
        int id = Integer.parseInt(scanner.nextLine());
        // TODO: Replace with prompts for Produkt properties and instantiation.
        Produkt entity = null;
        System.out.println("Refactor createProdukt() to instantiate a concrete Produkt entity.");
        // Once instantiated, call:
        // controller.createProdukt(entity);
    }

    /**
     * Prompts the user to retrieve an Produkt entity by ID.
     */
    private void getProdukt() {
        System.out.println("\n[Get Produkt]");
        System.out.print("Enter ID for Produkt: ");
        int id = Integer.parseInt(scanner.nextLine());
        Produkt entity = controller.getProdukt(id);
        if (entity != null) {
            System.out.println("Found: " + entity.toString());
        } else {
            System.out.println("Produkt with ID " + id + " not found.");
        }
    }

    /**
     * Prompts the user to update an existing Produkt entity.
     * <p>
     * **Note:** This is a placeholder. Refactor this method to modify a concrete Produkt entity.
     * </p>
     */
    private void updateProdukt() {
        System.out.println("\n[Update Produkt]");
        System.out.print("Enter ID for Produkt to update: ");
        int id = Integer.parseInt(scanner.nextLine());
        Produkt entity = controller.getProdukt(id);
        if (entity == null) {
            System.out.println("Produkt with ID " + id + " not found.");
            return;
        }
        // TODO: Update the properties of the retrieved entity.
        System.out.println("Refactor updateProdukt() to modify the concrete Produkt entity.");
        // After modification, call:
        // controller.updateProdukt(entity);
    }

    /**
     * Prompts the user to delete an Produkt entity by ID.
     */
    private void deleteProdukt() {
        System.out.println("\n[Delete Produkt]");
        System.out.print("Enter ID for Produkt to delete: ");
        int id = Integer.parseInt(scanner.nextLine());
        controller.deleteProdukt(id);
        System.out.println("Produkt with ID " + id + " deleted (if it existed).");
    }

    /**
     * Lists all Produkt entities.
     */
    private void listAllProdukt() {
        System.out.println("\n[List All Produkt]");
        List<Produkt> list = controller.getAllProdukt();
        if (list.isEmpty()) {
            System.out.println("No Produkt entities found.");
        } else {
            list.forEach(entity -> System.out.println(entity.toString()));
        }
    }
















}
