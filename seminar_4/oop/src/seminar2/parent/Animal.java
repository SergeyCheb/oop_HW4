package seminar2.parent;

public abstract class Animal implements Diseaseable {
    private String name;
    private final String color;
    private int legsCount;

    public Animal(String name, String color) {
        this.name = name;
        this.color = color;
        this.legsCount = 4;
    }

    public Animal(String color, int legsCount) {
        this("����������", color);
        this.legsCount = legsCount;
    }

    public Animal() {
        this("����������", "������");
    }

//    public abstract void speak();

    public abstract void hunt();

    @Override
    public void getIll() {
        System.out.printf("%s %s �����.%n", getType(), getName());
    }

    // todo: ���� ������, ���������� �� ��������� �������.
    //  !!!�������� �������� �� ������ ������� ������ ����� � sysout java

    protected void wakeUp() {
        System.out.println(getType() + ": ���������");
    }

    protected void findFood() {
        String out = String.format("%s: ����� ���%n", getType());
        System.out.println(out);
    }

    protected void eat() {
        System.out.printf("%s: ����%n", getType());
    }

    protected void toPlay() {
        System.out.printf("%s: �������%n", getType());
    }

    protected void goToSleep() {
        System.out.printf("%s: �����%n", getType());
    }

    @Override
    public String toString() {
        return String.format(
                "%s {name: %s,%ncolor: %s,%nlegs: %s;%n}", getType(), getName(), getColor(), getLegsCount()
        );
    }

    //todo: ���� ������� � �������. !!! �������� ��������, �� � ������� ���� ���� ������(���� �� ����� ������������)

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public int getLegsCount() {
        return legsCount;
    }

    public String getType() {
        return this.getClass().getSimpleName();
    }
}
