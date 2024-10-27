import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LeapYearCheckerShould {
    @Test
    public void take_1600_as_leap_year() {
        assertThat(new LeapYearChecker().isLeapYear(1600)).isTrue();
    }

    @Test
    public void take_2000_as_leap_year() {
        assertThat(new LeapYearChecker().isLeapYear(2000)).isTrue();
    }
}


// { 1600, 2000, 2400 } -> true
// { 1800, 1900, 2100 } -> false
// { 2008, 2012, 2016 } -> true
// { 2013, 2017, 2025 } -> false