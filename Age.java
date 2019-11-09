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
        if (cuMonth < month)
        {
            diffY--;
            diffM = month;
        }
        else if((cuMonth == month) && (cuDay < day))
        {
            diffY--;
            diffM = month;
        }
        else
        {
            diffM = cuMonth - month;
        }
        if(cuDay < day)
        {
            diffD = day;
        }
        else
        {
            diffD = cuDay - day;
        }
        System.out.println("Age = " + " Year: " + diffY +  " Month: " + diffM + " Day: "+ diffD );

    }
}
