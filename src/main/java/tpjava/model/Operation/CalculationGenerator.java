package tpjava.model.Operation;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CalculationGenerator {
    public static Addition addition = new Addition();
    public static Subtraction subtraction = new Subtraction();
    public static Multiplication multiplication = new Multiplication();
    public static Division division = new Division();

    public static Calculation generateSimpleCalculation() {

        Random r = new Random();
        int type = r.nextInt(4);
        Calculation c = new Calculation();

        switch (type) {
            case 0:
                c.setOperator(addition);
                c.setV1(new Number(r.nextInt(8) + 1));
                c.setV2(new Number(r.nextInt(8) + 1));
                break;
            case 1:
                c.setOperator(subtraction);
                c.setV1(new Number(r.nextInt(8) + 1));
                c.setV2(new Number(r.nextInt(8) + 1));
                break;
            case 2 :
                c.setOperator(multiplication);
                c.setV1(new Number(r.nextInt(5) + 1));
                c.setV2(new Number(r.nextInt(5) + 1));
                break;
            case 3:
                c.setOperator(division);
                c.setV2(new Number(r.nextInt(5) + 1));
                c.setV1(new Number(r.nextInt(5)*c.getV2().getValue()));
                break;
        }

        return c;
    }

    public static Calculation generateComplexCalculation (int nbCalculation){
        List<Calculation> calculations = new ArrayList<Calculation>();
        do {
            calculations.add(generateSimpleCalculation());
            nbCalculation --;
        } while (nbCalculation > 0);


        Random r = new Random();
        while (calculations.size() > 1) {

            Calculation c = new Calculation();
            int type = r.nextInt(4);
            switch (type) {
                case 0:
                    c.setOperator(addition);
                    break;
                case 1:
                    c.setOperator(subtraction);
                    break;
                case 2:
                    c.setOperator(multiplication);
                    break;
                case 3:
                    c.setOperator(division);
                    break;
            }
            c.setV1(calculations.remove(0));
            c.setV2(calculations.remove(0));
            calculations.add(c);
        }
        return calculations.get(0);
    }
}
