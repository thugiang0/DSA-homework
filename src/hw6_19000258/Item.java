package hw6_19000258;

public class Item {
	protected String name;

    public Item(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return getName();
    }
}
