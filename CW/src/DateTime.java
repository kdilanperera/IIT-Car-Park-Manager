public class DateTime {
    private int day;
    private int month;
    private int year;
    private  int hour;
    private int minute;

    public DateTime(int day,int month, int year, int hour , int minute){
         setDay(day);
         setMonth(month);
         setYear(year);
         setHour(hour);
         setMinute(minute);
    }

    public void setDay(int day) {
        if(day>=1 && day<=31){
        this.day = day;
        }else{
            throw new IllegalArgumentException("A month cant have more than 31 days or less than 1 day.");
        }
    }

    public void setMonth(int month) {
        if(month>=1 && month<=12){
            this.month = month;
        }else{
            throw new IllegalArgumentException("A year cant have more than 12 months or less than 1 month.");
        }

    }

    public void setYear(int year) {

        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setHour(int hour) {
        if(hour>=0 && hour<=23){
            this.hour = hour;
        }else{
            throw new IllegalArgumentException("A day cannot have less than 0 hours or more than 23 hours");
        }
    }

    public void setMinute(int minute) {
        if(minute>=0 && minute<=59){
            this.minute = minute;
        }else{
            throw new IllegalArgumentException("An hour cant have more than 59 minutes or less than 0 minutes.");
        }
    }

    @Override
    public String toString() {
        return "DateTime{" +
                "day=" + day +
                ", month=" + month +
                ", year=" + year +
                ", hour=" + hour +
                ", minute=" + minute +
                '}';
    }

}
