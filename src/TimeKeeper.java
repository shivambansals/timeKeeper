import java.util.Scanner;

    public class TimeKeeper {
        private int hour;
        private int minute;
        private int second;
        public void setHour(int hour){
            this.hour=hour;
        }
        public void setMinute(int minute){
            this.minute=minute;
        }
        public void setSecond(int second){
            this.second=second;
        }

        public int getHour() {
            return hour;
        }
        public int getMinute(){
            return minute;
        }

        public int getSecond() {
            return second;
        }
        public void calculateSecondsSincMidnight(){
            int secondPassed= (hour*60*60)+(minute*60)+second;
            System.out.println("seconds passed since midnight are:" + secondPassed);
        }
        public void percentageOfTheDayPassed(){
            float dayPassed=100*((hour*60*60)+(minute*60)+second)/(24*60*60);
            System.out.println(dayPassed + "%" + "of the day has passed.");
        }
        public TimeKeeper(int hour, int minute, int second){
            this.hour=hour;
            this.minute=minute;
            this.second=second;
        }
    }
    class Time{
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int h,m,s;
            System.out.println("please enter the hour -");
            h=sc.nextInt();
            System.out.println("please enter the minute -");
            m=sc.nextInt();
            System.out.println("please enter the second -");
            s=sc.nextInt();
            TimeKeeper tk = new TimeKeeper(h,m,s);
            System.out.println("Time entered-" + h + ":" + m + ":" + s);
            tk.calculateSecondsSincMidnight();
            tk.percentageOfTheDayPassed();
        }
    }


