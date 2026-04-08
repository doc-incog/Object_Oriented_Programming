public class ArithmeticException {
    public static void main(String[] args) {
        try {
            System.out.println(10 / 10);
        } catch (java.lang.ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        }
    }
}