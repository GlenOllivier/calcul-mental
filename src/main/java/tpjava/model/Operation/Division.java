package tpjava.model.Operation;

public class Division implements Operator {

    @Override
    public int getResult(Valuable v1, Valuable v2) {
    return v1.getValue() / v2.getValue();
}

    @Override
    public String show() {
        return "/";
    }

    @Override
    public boolean hasPriority() {
        return true;
    }

    @Override
    public boolean needsPriority() {
        return true;
    }
}
