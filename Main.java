import java.util.Calendar;
import java.util.Scanner;

public class Main {
    // main method
    public static void main(String[] args) {

        int aYear, aMonth, aDay;
        int cYear, cMonth, cDay;

        Scanner one = new Scanner(System.in);
        Calendar cal = Calendar.getInstance();

        cYear = cal.get(Calendar.YEAR);
        cMonth = cal.get(Calendar.MONTH)+1;
        cDay = cal.get(Calendar.DATE);

        System.out.print("How many times do you want to calculate age: ");
        int rep = one.nextInt();
        int i = 1;
        while(i <= rep) {
            System.out.println("Type when you were born below all in numbers");
            System.out.print("Year: ");
            aYear = one.nextInt();
            System.out.print("Month: ");
            aMonth = one.nextInt();
            System.out.print("Day: ");
            aDay = one.nextInt();

            Age kal = new Age(aDay, aMonth, aYear, cDay, cMonth, cYear);
            kal.calculator();
            ++i;
        }

    }

}
