//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main
{
    public static void main(String[] args)
    {
        double initialBalance = 5000.0;
        final double INTEREST_RATE = 0.17;
        double interestDueMonth1;
        double interestDueMonth2;

        interestDueMonth1 = initialBalance * INTEREST_RATE;
        interestDueMonth2 = (initialBalance + interestDueMonth1) * INTEREST_RATE;

        System.out.println("The interest due after one month is $" + interestDueMonth1);
        System.out.println("The interest due after two month is $" + interestDueMonth2);
    }
}