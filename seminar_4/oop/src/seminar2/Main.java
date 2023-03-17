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
                .addAnimal(new Cat("������", "�����"))
                .addAnimal(new Duck("�������", "������", 2))
                .addAnimal(new Dog("������", "�����"))
                .addAnimal(new HumanExtendsAnimal("����", 2));

        for (Animal animal: clinic.getANIMALS()) {
            animal.getIll();
        }

        System.out.println(clinic.getSpeakable());
        clinic.getSpeakable().forEach(Speakable::speak);
    }
}
