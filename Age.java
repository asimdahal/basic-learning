public class Age {

    private int year, month, day;
    private int cuYear, cuMonth, cuDay;

    public Age(int one, int two, int three, int four, int five, int six)
    {
        year = three;
        month = two;
        day = one;
        cuYear = six;
        cuMonth = five;
        cuDay = four;
    }
    public void calculator()
    {
        int diffY = cuYear - year;
        int diffM;
        int diffD;

        if(year>cuYear){
            System.out.println("You cannot be born in the future");
        }
        else {

            if (cuMonth < month) {
                diffY--;
                diffM = month;
            } else if ((cuMonth == month) && (cuDay < day)) {
                diffY--;
                diffM = month;
            } else {
                diffM = cuMonth - month;
            }
            if ((month == 11 || month == 4 || month == 6 || month == 9) && cuDay < day) {
                diffD = 30 - (day - cuDay);
            } else if ((month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) && cuDay < day) {
                diffD = 31 - (day - cuDay);
            } else {
                diffD = cuDay - day;
            }
            System.out.println("Age = " + " Year: " + diffY + " Month: " + diffM + " Day: " + diffD);
        }

    }
}
