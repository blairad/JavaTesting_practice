public class Calculator {

    private double number1;
    private double number2;


    public Calculator(double number1, double number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    public double getAdd(){
        return (number1 + number2);
    }

    public double getMultiply(){
        return (number1 * number2);
    }
    public double getSubtract(){
        return (number1 - number2);
    }
    public double getDivide(){
        return (number1 / number2);
    }
}
