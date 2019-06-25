package tpjava.model.Operation;

public interface Operator {

    public abstract int getResult(Valuable v1, Valuable v2);
    public abstract String show();
    public abstract boolean hasPriority();
    public abstract boolean needsPriority();
}
