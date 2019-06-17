package tpjava.model.Operation;

public class Number implements Valuable {
    private int value;

    public Number (int value) {
        this.value = value;
    }

    @Override
    public int getValue() {
        return value;
    }

    @Override
    public String show() {
        return String.valueOf(value);
    }

    @Override
    public boolean hasPriority() {
        return true;
    }
}
