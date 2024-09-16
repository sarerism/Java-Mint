package tag_01;

public class TimeConversion {
    public static void main(String[] args){

        int seconds = 172880;

        int days = seconds / 86400;
        int remainSecFromDays = seconds - (days * 86400);
        int hour = remainSecFromDays / 3600;
        int remainSecFromHours = remainSecFromDays - (hour * 3600);
        int min = remainSecFromHours / 60;
        int sec = remainSecFromHours - (min * 60);  // Corrected line
    
        System.out.println(seconds + " seconds are " + days + " days, " + hour + " hours, " 
                + min + " minutes, and " + sec + " seconds.");
    }
}
