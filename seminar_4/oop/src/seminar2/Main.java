package seminar2;

import seminar2.child.Cat;
import seminar2.child.Dog;
import seminar2.child.Duck;
import seminar2.child.HumanExtendsAnimal;
import seminar2.parent.Animal;
import seminar2.parent.Speakable;
import seminar2.parent.VeterinaryClinic;

public class Main {
    public static void main(String[] args) {
        VeterinaryClinic clinic = new VeterinaryClinic();

        clinic
                .addAnimal(new Cat("Барсик", "серый"))
                .addAnimal(new Duck("Дональд", "пёстрый", 2))
                .addAnimal(new Dog("Барбос", "белый"))
                .addAnimal(new HumanExtendsAnimal("Брэд", 2));

        for (Animal animal: clinic.getANIMALS()) {
            animal.getIll();
        }

        System.out.println(clinic.getSpeakable());
        clinic.getSpeakable().forEach(Speakable::speak);
    }
}
