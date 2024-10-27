import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;

public class LeapYearCheckerShould {
    @ParameterizedTest
    @ValueSource(ints = {1600, 2000, 2400})
    public void take_leap_year_those_divisible_by_400(int year) {
        assertThat(new LeapYearChecker().isLeapYear(year)).isTrue();
    }

    @ParameterizedTest
    @ValueSource(ints = {1800, 1900, 2100})
    public void take_non_leap_years_those_divisible_by_100_but_not_by_400(int year) {
        assertThat(new LeapYearChecker().isLeapYear(year)).isFalse();
    }

    @ParameterizedTest
    @ValueSource(ints = {2008, 2012, 2016})
    public void take_leap_years_those_divisible_by_4_but_not_by_100(int year) {
        assertThat(new LeapYearChecker().isLeapYear(year)).isTrue();
    }

    @Test
    public void take_2013_as_non_leap_year() {
        assertThat(new LeapYearChecker().isLeapYear(2013)).isFalse();
    }
}


// { 1600, 2000, 2400 } -> true
// { 1800, 1900, 2100 } -> false
// { 2008, 2012, 2016 } -> true
// { 2013, 2017, 2025 } -> false