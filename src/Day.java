public class Day {

    String dayOfWeek;
    boolean noSchool;
    
    public Day(String DayOfWeek, boolean NoSchool)
    {
        dayOfWeek = DayOfWeek;
        noSchool = NoSchool;
    }

    public String alarm()
    {
        if(dayOfWeek.equals("Saturday") || dayOfWeek.equals("Sunday")) return "9:00";
        else
        {
            if(noSchool)
            {
                if(dayOfWeek.equals("Monday")) return "9:30";
                else return "8:30";
            }
            else
            {
                if(dayOfWeek.equals("Wednesday")) return "7:30";
                else return "7:00";
            }
        }
    }
}
