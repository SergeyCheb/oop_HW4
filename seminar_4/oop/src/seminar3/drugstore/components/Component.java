package seminar3.drugstore.components;

public abstract class Component {
    private final String name;
    private final String weight;
    private final int power;

    public Component(String name, String weight, int power) {
        this.name = name;
        this.weight = weight;
        this.power = power;
    }

    public String getName() {
        return name;
    }

    public int getPower() {
        return power;
    }

    @Override
    public String toString() {
        return String.format(
                "%s {name: %s, weight: %s, power: %s}", this.getClass().getSimpleName(), name, weight, power
        );
    }

}
