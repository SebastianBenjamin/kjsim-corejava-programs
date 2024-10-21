class InvalidDayException extends Exception {
    public InvalidDayException(String message) {
        super(message);
    }
}

class InvalidMonthException extends Exception {
    public InvalidMonthException(String message) {
        super(message);
    }
}

public class MyDate {
    int day, month, year;
    int[] ArrDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    int[] ArrDaysL = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    MyDate() {
        day = 1;
        month = 1;
        year = 1900;
    }

    MyDate(int d, int m, int y, boolean ly) {
        try {
            if (m > 12 || m < 1) {
                
                throw new InvalidMonthException("Invalid Month, there are only 12 months in a year");
            } else {
                month = m;
                try {
                    if (ly && (d > ArrDaysL[m - 1]||d==0)) {
                      
                        throw new InvalidDayException("Invalid Day, there are only 0 - " + ArrDaysL[m - 1] + " Days in month " + m);
                    } else if (!ly &&(d > ArrDays[m - 1]||d==0)) {
                       
                        throw new InvalidDayException("Invalid Day, there are only 0 - " + ArrDays[m - 1] + " Days in month " + m);
                    } else {
                      
                        day = d;
                        year = y;
                        System.out.println("\n+--------------------------------------+\n");
                        System.out.println("  ++++++++++++ Valid Date ++++++++++++\n\n    Date entered: "+this.day+" / "+ this.month+" / "+this.year );
                        System.out.println("\n+--------------------------------------+\n");
                    }
                } catch (InvalidDayException e) {
                    e.printStackTrace();
                }
            }
        } catch (InvalidMonthException e) {
            e.printStackTrace();
        }
      
    }
    public static boolean isLeapYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                return year % 400 == 0;
            } else {
                return true;
            }
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
      int day=Integer.valueOf(args[0]);
      int mnth=Integer.valueOf(args[1]);
      int year=Integer.valueOf(args[2]);
            MyDate dateobj =new MyDate(day,mnth,year,isLeapYear(year));
}

}

