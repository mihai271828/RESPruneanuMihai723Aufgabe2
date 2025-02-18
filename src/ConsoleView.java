import Model.Charakter;
import Model.Produkt;
import Repository.Repository;
import Repository.InMemoryRepository;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ConsoleView {
    public static void main(String[] args) {
        Repository<Charakter> CharakterRepo=new InMemoryRepository<Charakter>();
        Repository<Produkt>ProduktRepo=new InMemoryRepository<Produkt>();
        Controller controller=new Controller(CharakterRepo,ProduktRepo);
        ConsoleView console=new ConsoleView(controller);
        console.start();



        List<Produkt> produkte = new ArrayList<>();
        produkte.add(new Produkt(1,"Kunai", 50.0, "Konoha"));
        produkte.add(new Produkt(2,"Shuriken", 30.0, "Konoha"));
        produkte.add(new Produkt(3,"Schwert", 200.0, "Kirigakure"));
        produkte.add(new Produkt(4,"Heiltrank", 100.0, "Sunagakure"));
        produkte.add(new Produkt(5,"Sprengsiegel", 75.0, "Iwagakure"));
        produkte.add(new Produkt(6,"Riesenfächer", 300.0, "Sunagakure"));
        produkte.add(new Produkt(7,"Giftklinge", 150.0, "Kirigakure"));
        produkte.add(new Produkt(8,"Explosionskugel", 250.0, "Iwagakure"));
        produkte.add(new Produkt(9,"Schattendolch", 180.0, "Konoha"));
        produkte.add(new Produkt(10,"Wasserperle", 90.0, "Kirigakure"));

        // Initialisierung der Charaktere
        List<Charakter> charaktere = new ArrayList<>();

        Charakter c1 = new Charakter(1, "Naruto Uzumaki", "Konoha",new ArrayList<>());
        c1.add(produkte.get(0)); // Kunai
        c1.add(produkte.get(3)); // Heiltrank
        c1.add(produkte.get(8)); // Schattendolch
        c1.add(produkte.get(5)); // Riesenfächer

        Charakter c2 = new Charakter(2, "Gaara", "Sunagakure",new ArrayList<>());
        c2.add(produkte.get(2)); // Schwert
        c2.add(produkte.get(4)); // Sprengsiegel
        c2.add(produkte.get(6)); // Giftklinge
        c2.add(produkte.get(1)); // Shuriken

        Charakter c3 = new Charakter(3, "Kisame Hoshigaki", "Kirigakure",new ArrayList<>());
        c3.add(produkte.get(1)); // Shuriken
        c3.add(produkte.get(2)); // Schwert
        c3.add(produkte.get(3)); // Heiltrank
        c3.add(produkte.get(7)); // Explosionskugel
        c3.add(produkte.get(9)); // Wasserperle

        Charakter c4 = new Charakter(4, "Deidara", "Iwagakure",new ArrayList<>());
        c4.add(produkte.get(0)); // Kunai
        c4.add(produkte.get(4)); // Sprengsiegel
        c4.add(produkte.get(7)); // Explosionskugel
        c4.add(produkte.get(9)); // Wasserperle

        Charakter c5 = new Charakter(5, "Itachi Uchiha", "Konoha",new ArrayList<>());
        c5.add(produkte.get(8)); // Schattendolch
        c5.add(produkte.get(6)); // Giftklinge
        c5.add(produkte.get(2)); // Schwert
        c5.add(produkte.get(7)); // Explosionskugel

        charaktere.add(c1);
        charaktere.add(c2);
        charaktere.add(c3);
        charaktere.add(c4);
        charaktere.add(c5);




































































































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
                case "11":
                    filterCharakter();
                    break;
                    case "12":
                        sortProductsForCharakter();
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
        System.out.println("  11. Filter Charakter");
        System.out.println("  12.Sort Products for Charakter");
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
        System.out.print("Enter Name for Charakter: ");
        String name = scanner.nextLine();
        System.out.print("Enter Herkunftsdorf for Charakter: ");
        String herkunftsdorf = scanner.nextLine();
        List<Produkt> products=new ArrayList<>();
        while(true){
            System.out.println("Would you like to add a product? (Y/N)");
            String answer = scanner.nextLine();
            if (answer.equals("Y")) {
                System.out.print("Enter Name for Product to add: ");
                String nameofSpieler = scanner.nextLine();
                for (Produkt sp : controller.getAllProdukt()) {
                    if (sp.getName().equals(nameofSpieler)) {
                        products.add(sp);
                    }
                }

            }else break;
        }
        Charakter car=new Charakter(id, name, herkunftsdorf, products);
        controller.createCharakter(car);

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
        System.out.print("Enter new Name for Charakter to update: ");
        String name = scanner.nextLine();
        entity.setName(name);
        System.out.println("Enter new Herkunftsdorf for Charakter to update: ");
        String herkunftsdorf = scanner.nextLine();
        entity.setHerkunftsdorf(herkunftsdorf);

        List<Produkt> spielerList = entity.getGekaufteprod();

        // Adding Spieler
        while (true) {
            System.out.println("Would you like to add a Produkt? (Y/N)");
            String option = scanner.nextLine();
            if (option.equalsIgnoreCase("Y")) {
                System.out.print("Enter Produkt Name to add: ");
                String spielerName = scanner.nextLine();
                Produkt spielerToAdd = null;

                // Find the Spieler by name from your repository/controller
                for (Produkt sp : controller.getAllProdukt()) {
                    if (sp.getName().equalsIgnoreCase(spielerName)) {
                        spielerToAdd = sp;
                        break;
                    }
                }

                if (spielerToAdd != null) {
                    if (!spielerList.contains(spielerToAdd)) {
                        spielerList.add(spielerToAdd);
                        System.out.println("Spieler " + spielerName + " added.");
                    } else {
                        System.out.println("Spieler " + spielerName + " is already in the list.");
                    }
                } else {
                    System.out.println("Spieler " + spielerName + " not found.");
                }
            } else {
                break;
            }
        }

        // Removing Spieler
        while (true) {
            System.out.print("Would you like to remove a Produkt? (Y/N) ");
            String option = scanner.nextLine();
            if (option.equalsIgnoreCase("Y")) {
                System.out.print("Enter Produkt Name to remove: ");
                String spielerNameToRemove = scanner.nextLine();
                boolean removed = false;

                // Using an iterator to safely remove elements
                Iterator<Produkt> iterator = spielerList.iterator();
                while (iterator.hasNext()) {
                    Produkt sp = iterator.next();
                    if (sp.getName().equalsIgnoreCase(spielerNameToRemove)) {
                        iterator.remove();
                        removed = true;
                        System.out.println("Produkt " + spielerNameToRemove + " removed.");
                    }
                }

                if (!removed) {
                    System.out.println("Produkt " + spielerNameToRemove + " not found in the gekaufteprod.");
                }
            } else {
                break;
            }
        }
        controller.updateCharakter(entity);
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
        System.out.print("Enter Name for Produkt: ");
        String name = scanner.nextLine();
        System.out.print("Enter Preis for Produkt: ");
        double preis = Double.parseDouble(scanner.nextLine());
        System.out.print("Enter Herkunftsregion for Produkt: ");
        String herkunftsregion = scanner.nextLine();
        Produkt prod=new Produkt(id,name,preis,herkunftsregion);
       controller.createProdukt(prod);

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
        System.out.println("Enter new Name: ");
        String newName = scanner.nextLine();
        entity.setName(newName);
        System.out.println("Enter new Preis: ");
        double newPreis = Double.parseDouble(scanner.nextLine());
        entity.setPreis(newPreis);
        System.out.println("Enter new Herkunftsregion: ");
        String newHerkunftsregion = scanner.nextLine();
        entity.setHerkunftsregion(newHerkunftsregion);
        controller.updateProdukt(entity);

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


    private void filterCharakter() {
        System.out.println("Enter the Stadt to filter by:");
        String stadt = scanner.nextLine();

        // Assuming your controller exposes a filter method:
        List<Charakter> filteredVereine = controller.filterCharakter(stadt);

        if (filteredVereine.isEmpty()) {
            System.out.println("No charakter found in " + stadt + ".");
        } else {
            System.out.println("Vereine in " + stadt + ":");
            for (Charakter v : filteredVereine) {
                System.out.println(v);
            }
        }
    }

    private void sortProductsForCharakter() {
        System.out.println("\n[Sort Prod for Charakter by Preis]");
        System.out.print("Enter Charalter ID: ");
        int vereinId = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter sorting order (A for ascending, D for descending): ");
        String order = scanner.nextLine();
        boolean ascending = order.equalsIgnoreCase("A");

        // Call the controller method which filters and sorts the Spieler.
        List<Produkt> sortedSpieler = controller.sortProductsForChark(vereinId, ascending);
        if (sortedSpieler.isEmpty()) {
            System.out.println("No Product found for Charakter with ID " + vereinId);
        } else {
            System.out.println("Sorted Products:");
            sortedSpieler.forEach(spieler -> System.out.println(spieler));
        }
    }








}
