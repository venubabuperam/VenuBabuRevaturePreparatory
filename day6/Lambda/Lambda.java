import java.util.function.BinaryOperator;
public class Lambda {
    public static double operationFunction(double num1, double num2, String ope){
        BinaryOperator<Double> operation = null;
        switch(ope){
            case "+":
            operation = (a,b)->a+b;
            break;
            case "-":
            operation = (a,b)->a-b;
            break;
            case "*":
            operation = (a,b)->a*b;
            break;
            default:System.out.println("Invalid Input");
        }
        return operation.apply(num1, num2);
    }
    public static void main(String[] args) {
        double result;
        result = operationFunction(10, 4, "+");
        System.out.println(result);
        result = operationFunction(13, 3, "-");
        System.out.println(result);
        result = operationFunction(8, 6, "*");
        System.out.println(result);
        
    }
}