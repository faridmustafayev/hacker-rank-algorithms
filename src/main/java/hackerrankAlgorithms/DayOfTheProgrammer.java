package hackerrankAlgorithms;

public class DayOfTheProgrammer {
    public static void main(String[] args) {
        System.out.println(dayOfProgrammer(1918));
    }

    public static String dayOfProgrammer(int year) {
        String value;
        boolean flag = false;

        if (year == 1918) {
            value = "26.09.1918";
            return value;
        }

        if (year % 4 == 0 && year >= 1700 && year < 1917) {
            value = "12.09." + year;
            flag = true;
        } else {
            value = "13.09." + year;
        }

        if (flag) {
            return value;
        }

        if (year > 1918 && year < 2700 && (year % 400 == 0 || (year % 4 == 0 && year %100 != 0))) {
            value = "12.09." + year;
        } else {
            value = "13.09." + year;
        }

        return value;
    }

}
