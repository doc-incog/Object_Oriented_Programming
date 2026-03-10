package Workshop;

public class LogicalOperatorsDemo {

    public static void main(String[] args) {

        boolean expr1 = (5 > 3);
        boolean expr2 = (8 > 5);

        System.out.println("Logical AND: " + (expr1 && expr2));

        boolean expr3 = (2 > 5);

        System.out.println("Logical OR: " + (expr1 || expr3));

        System.out.println("Logical NOT: " + (!(5 == 10)));
    }
}