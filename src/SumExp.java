
// Class with the method SumExp to perform the sum operation that extends to the BinaryExp
class SumExp extends BinaryExp {
    public SumExp(ArithmeticExp left, ArithmeticExp right) {
        super(left, right, "+");
    }

    @Override
    public int evaluate() {
        return left.evaluate() + right.evaluate();
    }
}
