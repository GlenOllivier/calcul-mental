package tpjava.model.Operation;

public class Subtraction implements Operator {

    @Override
    public int getResult(Valuable v1, Valuable v2) {
        return v1.getValue() - v2.getValue();
    }

    @Override
    public boolean hasPriority() {
        return false;
    }
}
