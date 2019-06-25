package tpjava.model.Operation;

public class Calculation implements Valuable {

    private Valuable v1, v2;
    private Operator operator;

    public Valuable getV1() {
        return v1;
    }

    public void setV1(Valuable v1) {
        this.v1 = v1;
    }

    public Valuable getV2() {
        return v2;
    }

    public void setV2(Valuable v2) {
        this.v2 = v2;
    }

    public Operator getOperator() {
        return operator;
    }

    public void setOperator(Operator operator) {
        this.operator = operator;
    }

    @Override
    public int getValue() {
        return operator.getResult(v1, v2);
    }

    @Override
    public String show() {
        StringBuilder sb = new StringBuilder();
        if (!v1.hasPriority() && this.hasPriority() ) {
            sb.append("(");
            sb.append(v1.show());
            sb.append(")");
        } else {
            sb.append(v1.show());
        }
        sb.append(" ");
        sb.append(operator.show());
        sb.append(" ");

        if ((!v2.hasPriority() && this.hasPriority()) || (this.operator.needsPriority() && v2 instanceof Calculation)) {
            sb.append("(");
            sb.append(v2.show());
            sb.append(")");
        } else {
            sb.append(v2.show());
        }
        return sb.toString();
    }

    @Override
    public boolean hasPriority() {
        return operator.hasPriority();
    }
}
