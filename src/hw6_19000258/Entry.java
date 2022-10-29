package hw6_19000258;

public class Entry<E> {

    private E element;
    private int value;

    public Entry(E element, int value) {
        this.element = element;
        this.value = value;
    }

    public E getElement() {
        return element;
    }

    public int getValue() {
        return value;
    }

    public String toString() {
        return "(" + getElement() + ", " + getValue() + ")";
    }

}
