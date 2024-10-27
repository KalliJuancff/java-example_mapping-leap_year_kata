public class LeapYearChecker {
    public boolean isLeapYear(int year) {
        if (year % 400 != 0) {
            return false;
        }

        return true;
    }
}
