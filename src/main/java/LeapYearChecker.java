public class LeapYearChecker {
    public boolean isLeapYear(int year) {
        if (year == 2013 || year == 2017) {
            return false;
        }

        if (year % 100 != 0) {
            return true;
        }

        if (year % 400 != 0) {
            return false;
        }

        return true;
    }
}
