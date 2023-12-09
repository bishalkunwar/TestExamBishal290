
// Class ModuloExp that is extends to the BinaryExp
class ModuloExp extends BinaryExp {
    public ModuloExp(ArithmeticExp left, ArithmeticExp right) {
        super(left, right, "%");
    }

    @Override
    public int evaluate() {
        return left.evaluate() % right.evaluate();
    }
}

