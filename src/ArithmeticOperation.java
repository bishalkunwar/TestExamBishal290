
// creating abstract class the ArithmeticExp
abstract class ArithmeticExp{

    // evaluation int method to abstract:
    public abstract int evaluate();

    //  toString String method to abstract
    public abstract String toString();
}


// Class that represents the number in the expression
class NumberExp extends ArithmeticExp {
    private int value;

    public NumberExp(int value) {
        this.value = value;
    }

    @Override
    public int evaluate() {
        return value;
    }

    @Override
    public String toString() {
        return Integer.toString(value);
    }
}


// Abstract binary class for binary expressions (Sum, Product, Modulo)
abstract class BinaryExp extends ArithmeticExp {
    protected ArithmeticExp left;
    protected ArithmeticExp right;
    protected String operator;

    public BinaryExp(ArithmeticExp left, ArithmeticExp right, String operator) {
        this.left = left;
        this.right = right;
        this.operator = operator;
    }

    @Override
    public String toString() {
        return "(" + left.toString() + " " + operator + " " + right.toString() + ")";
    }
}



// Main class to run the whole program of ArithmeticOperation
public class ArithmeticOperation {
    public static void main(String[] args) {


    }
}

















