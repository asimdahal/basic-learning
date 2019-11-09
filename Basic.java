import java.util.Calendar;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int aYear, aMonth, aDay;
        int cYear, cMonth, cDay;

        Scanner one = new Scanner(System.in);
        Calendar cal = Calendar.getInstance();

        System.out.println("Type when you were born below all in numbers?");
        System.out.print("Year: ");
        aYear = one.nextInt();
        System.out.print("Month: ");
        aMonth = one.nextInt();
        System.out.print("Day: ");
        aDay = one.nextInt();

        cYear = cal.get(Calendar.YEAR);
        cMonth = cal.get(Calendar.MONTH)+1;
        cDay = cal.get(Calendar.DATE);

        Age kal = new Age(aDay, aMonth,aYear,cDay,cMonth,cYear);
        kal.calculator();

    }

}
