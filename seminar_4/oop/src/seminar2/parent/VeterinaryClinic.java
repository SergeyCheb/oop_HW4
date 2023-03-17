package seminar2.parent;

import java.util.ArrayList;
import java.util.List;

public class VeterinaryClinic {
    /**
     * Список животных - клиентов клиники.
     */
    private final List<Animal> ANIMALS;

    public VeterinaryClinic() {
        this.ANIMALS = new ArrayList<>();
    }

    public VeterinaryClinic addAnimal(Animal animal) {
        ANIMALS.add(animal);
        return this;
    }

    public List<Animal> getANIMALS() {
        return ANIMALS;
    }

    public List<Speakable> getSpeakable() {
        List<Speakable> result = new ArrayList<>();
        for (Animal animal: getANIMALS()) {
            if (animal instanceof Speakable) {
                result.add((Speakable) animal);
            }
        }
        return result;
    }
}
