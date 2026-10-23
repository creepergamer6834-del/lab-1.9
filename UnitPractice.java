public class UnitPractice {

    // Read REQ 02
    public String alarmClock(int day, boolean vacation) {
        if ((day <= 5) && (day >= 1)) {
            if (vacation) {
                return "10:00";
            } else {
                return "7:00";
            }
        } else {
            if (vacation) {
                return "off";
            } else {
                return "10:00";
            }
        }
    }

    // Read REQ 03
    public boolean makesSix(int a, int b) {
        if ((a == 6) || (b == 6)) {
            return true;
        } else if (a + b == 6) {
            return true;
        } else if ((int) (Math.abs(a - b)) == 6) {
            return true;
        } else {
            return false;
        }
    }

    // Read REQ 04
    public int ticketPrize(int a, int b, int c) {
        if ((a == 2) && (b == 2) && (c == 2)) {
            return 10;
        } else if ((a == b) && (b == c) && (a == c)) {
            return 5;
        } else if ((a != b) && (a != c)) {
            return 1;
        }
        return 0;
    }

    // Read REQ 05
    public String fizzBuzzLabel(String str) {
        int length = str.length() - 1;
        if ((str.charAt(0) == 'f') && (str.charAt(length) == 'b')) {
            return "FizzBuzz";
        } else if (str.charAt(0) == 'f') {
            return "Fizz";
        } else if (str.charAt(length) == 'b') {
            return "Buzz";
        }
        return str;
    }

    // Read REQ 06
    public String doubleChar(String str) {
        int length = str.length() - 1;
        String answ = "";
        for (int i = 0; i <= length; i++) {
            char current = str.charAt(i);
            answ += current;
            answ += current;
        }
        return answ;
    }

    // Read REQ 07
    public int countHi(String str) {
        int length = str.length() - 1;
        int counter = 0;
        for (int i = 0; i < length; i++) {
            char current = str.charAt(i);
            char next = str.charAt(i + 1);
            String hi = "" + current + next;
            if (hi.equals("hi")) {
                counter += 1;
            }
        }
        return counter;

    }

    // Read REQ 08
    public boolean catsEqualDogs(String str) {
        int length = str.length() - 1;
        int cats = 0;
        int dogs = 0;
        String a = "";
        for (int i = 0; i < length; i++) {
            if (i + 2 <= length) {
                char current = str.charAt(i);
                char second = str.charAt(i + 1);
                char third = str.charAt(i + 2);
                a = "" + current + second + third;
                if (a.equals("cat")) {
                    cats += 1;
                }
                if (a.equals("dog")) {
                    dogs += 1;
                }
            }
        }
        if (cats == dogs) {
            return true;
        }
        return false;
    }

    // Read REQ 09
    public int countCode(String str) {
        int length = str.length() - 1;
        int counter = 0;
        String b = "";
        for (int i = 0; i < length; i++) {
            if (i + 3 <= length) {
                char one = str.charAt(i);
                char two = str.charAt(i + 1);
                char four = str.charAt(i + 3);
                b = "" + one + two + four;
                if (b.equals("coe")) {
                    counter += 1;
                }
            }
        }
        return counter;
    }

    // Read REQ 10
    public String repeatEnd(String str, int n) {
        int length = str.length() - n;
        String a = str.substring(length);
        String b = "";
        for (int i = 0; i < n; i++) {
            b += a;
        }
        return b;
    }

    // Read REQ 11
    public String firstTwo(String str) {
        return "TODO";
    }

    // Read REQ 12
    public int countEvens(int[] nums) {
        return -999;
    }

    // Read REQ 13
    public boolean has22(int[] nums) {
        return true;
    }
}