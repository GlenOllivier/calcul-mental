package tpjava.model.Operation;

public interface Operator {

    public abstract int getResult(Valuable v1, Valuable v2);

    public abstract boolean hasPriority();
}
