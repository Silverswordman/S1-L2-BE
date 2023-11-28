package Es1;

public class Es1 {
    //    Es1
    public static boolean stringEvenOdd(String wordCheck) {
        return wordCheck.length() % 2 == 0;
    }

    //es2
    public static boolean leapYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    return true;
                } else {
                    return false;
                }
            } else {
                return true;
            }
        } else {
            return false;
        }
    }

    public static void main(String[] args) {

        String wordCheck = "hello";
        System.out.println("la parola " + wordCheck + " è " + (stringEvenOdd(wordCheck) ? "pari" : "dispari"));

        int year = 2023;
        int anotherYear = 2004;
        System.out.println(" Is the year " + year + " a leap Year? " + leapYear(year));
        System.out.println(" Is the year " + anotherYear + " a leap Year? " + leapYear(anotherYear));


    }


}

