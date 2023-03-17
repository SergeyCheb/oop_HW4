package seminar3.drugstore;

import seminar3.drugstore.components.Component;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class IterableDrug implements Iterable<Component>, Comparable<IterableDrug> {
    private final List<Component> components;
    private int index;

    public IterableDrug() {
        this.components = new ArrayList<>();
        this.index = 0;
    }

    public void addComponent(Component component) {
        components.add(component);
    }

    public List<Component> getComponents() {
        return components;
    }

    public int getDrugPower() {
        int power = 0;
        for (Component component: components) {
            power += component.getPower();
        }
        return power;
    //todo:
    // Или в функциональном стиле:
    // return this.components.stream().mapToInt(Component::getPower).sum();
    }

    @Override
    public Iterator<Component> iterator() {
        return new Iterator<Component>() {
            @Override
            public boolean hasNext() {
                return index < components.size();
            }

            @Override
            public Component next() {
                return components.get(index++);
            }
        };
    }

    @Override
    public int compareTo(IterableDrug o) {
        return this.getDrugPower() > o.getDrugPower() ? 1 : ((this.getDrugPower() == o.getDrugPower()) ? 0 : -1);

//        int power = this.components.stream().mapToInt(Component::getPower).sum();
//        int powerO = o.getComponents().stream().mapToInt(Component::getPower).sum();
//        if (power > powerO) {
//            return 1;
//        } else if (power < powerO) {
//            return -1;
//        } else {
//            return 0;
//        }

        //todo можно записать эту логическую ветвь через тернарный оператор:
        // power > powerO ? 1 : ((power == powerO) ? 0 : -1) или так: Integer.compare(power, powerO);
    }

    @Override
    public String toString() {
        return String.format(
                "%s {components: %s, power: %s}%n", this.getClass().getSimpleName(), components, getDrugPower()
        );
    }
}
