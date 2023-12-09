
// Class for the product operation that extends to the BinaryExp
class ProductExp extends BinaryExp {
    public ProductExp(ArithmeticExp left, ArithmeticExp right) {
        super(left, right, "*");
    }

    @Override
    public int evaluate() {
        return left.evaluate() * right.evaluate();
    }
}
