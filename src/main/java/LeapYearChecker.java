public class LeapYearChecker {
    public boolean isLeapYear(int year) {
        return ((isDivisibleBy4(year) && !isDivisibleBy100(year)) ||
                (isDivisibleBy400(year)));
    }

    private static boolean isDivisibleBy4(int year) {
        return isYearDivisibleBy(year, 4);
    }

    private static boolean isDivisibleBy100(int year) {
        return isYearDivisibleBy(year, 100);
    }

    private static boolean isDivisibleBy400(int year) {
        return isYearDivisibleBy(year, 400);
    }

    private static boolean isYearDivisibleBy(int year, int divisor) {
        return year % divisor == 0;
    }
}
