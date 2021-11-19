public class AfterClass20 {
    public static class Clock {
        int hour;
        int minute;

//        initilise clock to 0
        public Clock() {
            hour=0;
            minute=0;
        }

//        initialise clock to hour and minute
        public Clock(int hour, int minute) {
            if(hour <= 23 && hour >= 0 && minute >= 0 && minute <= 59) {
                this.hour = hour;
                this.minute = minute;
            }
            else {
                System.out.println("ERROR value out of range.");
            }
        }

//        SETTERS FOR CLOCK STATES
        void setClock() {
            hour=0;
            minute=0;
        }

//        set clock with hour and minute
        void setClock(int hour, int minute) {
            if(hour <= 23 && hour >= 0 && minute >= 0 && minute <= 59) {
                this.hour=hour;
                this.minute=minute;
            } else {
                System.out.println("ERROR value out of range.");
            }
        }

//        shows time in console
        void displayTime() {
            if(hour>9&&minute>9) {
                System.out.println(hour+":"+minute);
            }
            else if (hour>9) {
                System.out.println(hour+":0"+minute);
            }
            else if(minute>9) {
                System.out.println("0"+hour+":"+minute);
            }
            else {
                System.out.println("0"+hour+":0"+minute);
            }
        }

//        add one minute to time
        void addOneMinute() {
            if(minute<59) {
                minute+=1;
            }
            else if(minute==59 &&hour<23) {
                minute=0;
                hour+=1;
            }
            else {
                minute=0;
                hour=0;
            }
        }

//  ============ MAIN ============================
        public static void main (String[] args) {

            Clock clock1 = new Clock(12,47);
            clock1.displayTime();
            clock1.setClock(18,14);
            clock1.displayTime();
            clock1.setClock(9,3);
            clock1.displayTime();
            clock1.setClock(23,58);
            clock1.displayTime();
            clock1.addOneMinute();
            clock1.displayTime();
            clock1.addOneMinute();
            clock1.displayTime();
        }
    }
}
