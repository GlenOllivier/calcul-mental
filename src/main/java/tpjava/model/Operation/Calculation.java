package tpjava.model.Operation;

public class Calculation implements Valuable {

    private Valuable v1, v2;
    public Operator operator;

    @Override
    public int getValue() {
        return operator.getResult(v1, v2);
    }

    @Override
    public String show() {
        StringBuilder sb = new StringBuilder();
        if (v1.hasPriority()) {
            sb.append(v1.show());
        } else {
            sb.append("(");
            sb.append(v1.show());
            sb.append(")");
        }
        sb.append(" ");
        sb.append(operator.show());
        sb.append(" ");

        if (v2.hasPriority()) {
            sb.append(v2.show());
        } else {
            sb.append("(");
            sb.append(v2.show());
            sb.append(")");
        }
        return sb.toString();
    }

    @Override
    public boolean hasPriority() {
        return operator.hasPriority();
    }
}
