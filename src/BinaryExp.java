
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

