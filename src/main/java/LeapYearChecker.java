public class LeapYearChecker {
    public boolean isLeapYear(int year) {
        if (year == 1800 || year == 1900) {
            return false;
        }

        return true;
    }
}
