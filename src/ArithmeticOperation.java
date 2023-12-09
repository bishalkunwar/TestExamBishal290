
// Main class ArithmeticOperation to run the whole program of ArithmeticOperation
public class ArithmeticOperation {
    public static void main(String[] args) {

        // creating the test 3 + 2 * 5
        // variables are in reference to the test case
        ArithmeticExp term = new SumExp(
                new NumberExp(3),
                new ProductExp(new NumberExp(2),
                        new NumberExp(5)
                )
        );

        // Testing the program result from the expression and then evaluating the result
        System.out.println("" + " Let's Suppose The Expression: " + term.toString());
        System.out.println("Considering The Expression the Evaluation Result would be: " + term.evaluate());


    }
}
