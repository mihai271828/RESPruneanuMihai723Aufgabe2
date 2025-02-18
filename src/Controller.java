import Model.Charakter;
import Model.Produkt;
import Repository.Repository;

import java.util.ArrayList;
import java.util.List;

public class Controller {
    private final Repository<Charakter> CharakterRepository;
    private final Repository<Produkt> ProduktRepository;

    /**
     * Constructs a new Controller with the specified repositories.
     *
     * @param CharakterRepository the repository for the first entity type
     * @param ProduktRepository the repository for the second entity type
     */
    public Controller(Repository<Charakter> CharakterRepository, Repository<Produkt> ProduktRepository) {
        this.CharakterRepository = CharakterRepository;
        this.ProduktRepository = ProduktRepository;
    }

    // ===== CRUD operations for Charakter =====

    /**
     * Creates a new Charakter entity.
     *
     * @param entity the entity to create
     */
    public void createCharakter(Charakter entity) {
        CharakterRepository.create(entity);
    }

    /**
     * Retrieves an Charakter entity by its ID.
     *
     * @param id the unique identifier of the entity
     * @return the Charakter entity with the specified ID, or null if not found
     */
    public Charakter getCharakter(Integer id) {
        return CharakterRepository.get(id);
    }

    /**
     * Updates an existing Charakter entity.
     *
     * @param entity the entity with updated data
     */
    public void updateCharakter(Charakter entity) {
        CharakterRepository.update(entity);
    }

    /**
     * Deletes an Charakter entity by its ID.
     *
     * @param id the unique identifier of the entity to delete
     */
    public void deleteCharakter(Integer id) {
        CharakterRepository.delete(id);
    }

    /**
     * Retrieves all Charakter entities.
     *
     * @return a list of all Charakter entities in the repository
     */
    public List<Charakter> getAllCharakter() {
        return CharakterRepository.getAll();
    }

    // ===== CRUD operations for Produkt =====

    /**
     * Creates a new Produkt entity.
     *
     * @param entity the entity to create
     */
    public void createProdukt(Produkt entity) {
        ProduktRepository.create(entity);
    }

    /**
     * Retrieves an Produkt entity by its ID.
     *
     * @param id the unique identifier of the entity
     * @return the Produkt entity with the specified ID, or null if not found
     */
    public Produkt getProdukt(Integer id) {
        return ProduktRepository.get(id);
    }

    /**
     * Updates an existing Produkt entity.
     *
     * @param entity the entity with updated data
     */
    public void updateProdukt(Produkt entity) {
        ProduktRepository.update(entity);
    }

    /**
     * Deletes an Produkt entity by its ID.
     *
     * @param id the unique identifier of the entity to delete
     */
    public void deleteProdukt(Integer id) {
        ProduktRepository.delete(id);
    }

    /**
     * Retrieves all Produkt entities.
     *
     * @return a list of all Produkt entities in the repository
     */
    public List<Produkt> getAllProdukt() {
        return ProduktRepository.getAll();
    }


    public  List<Charakter> filterVereineByStadt(String Herkunft) {
        List<Charakter> filtered = new ArrayList<>();
        // Retrieve all Vereine entities from the repository
        List<Charakter> allVereine = CharakterRepository.getAll();
        // Loop through each entity and add those matching the criteria
        for (Charakter Charakter : allVereine) {
            if (((Charakter) Charakter).getHerkunftsdorf().equalsIgnoreCase(Herkunft)) {
                filtered.add(Charakter);
            }
        }
        return filtered;
    }







}
