## Leap Year Kata

### Description
Every year that is exactly divisible by four is a leap year, except for years that are exactly divisible by 100, but these centurial years are leap years if they are exactly divisible by 400. For example, the years 1700, 1800, and 1900 are not leap years, but the years 1600 and 2000 are.

### Acceptance Criteria (or Rules):
- All years divisible by 400 ARE leap years,
- All years divisible by 100 but not by 400 are NOT leap years,
- All years divisible by 4 but not by 100 ARE leap years, and
- All years not divisible by 4 are NOT leap years

### Examples:
- { 1600, 2000, 2400 } -> true
- { 1800, 1900, 2100 } -> false
- { 2008, 2012, 2016 } -> true
- { 2013, 2017, 2025 } -> false

### References:
https://en.wikipedia.org/wiki/Leap_year