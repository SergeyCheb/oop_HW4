package seminar3.child;

import seminar3.parent.Animal;
import seminar3.parent.Speakable;

/**
 * �������� �����, � ������� ����� "�������"  ��������� �� ��������� ��� ��������� � ���������.
 * ����� ������ � ������� ����� � �� ���� � ���� ������� ������� � ����������� :)
 */
public class HumanExtendsAnimal extends Animal implements Speakable {
    private final String name;
    private final int legsCount;

    public HumanExtendsAnimal(String name, int legsCount) {
        super("", legsCount);
        this.name = name;
        this.legsCount = legsCount;
    }

    @Override
    public void speak() {
        System.out.printf("%s %s ���-�� �������.%n", getType(), getName());
    }

    @Override
    public void hunt() {
        wakeUp();
        findFood();
        eat();
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getLegsCount() {
        return legsCount;
    }
}
