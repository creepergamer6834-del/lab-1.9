public class UnitPracticeTester {
    public static void main(String[] args) {
        UnitPractice up = new UnitPractice();

        // Each line prints the call, then the result. Add two calls for
        // every other method: one normal input and one boundary input.
        System.out.println("alarmClock(1, false): " + up.alarmClock(1, false));
        System.out.println("alarmClock(0, true): " + up.alarmClock(0, true));
        System.out.println("doubleChar(\"The\"): " + up.doubleChar("The"));
        System.out.println("doubleChar(\"\"): " + up.doubleChar(""));
        System.out.println("");
        System.out.println(up.makesSix(6, 4));
        System.out.println(up.makesSix(2, 4));
        System.out.println(up.makesSix(8, 2));
        System.out.println(up.makesSix(4, 5));

        System.out.println("");
        System.out.println(up.ticketPrize(2, 2, 2));
        System.out.println(up.ticketPrize(1, 1, 1));
        System.out.println(up.ticketPrize(0, 1, 2));
        System.out.println(up.ticketPrize(0, 0, 1));

        System.out.println("");
        System.out.println(up.fizzBuzzLabel("fab"));
        System.out.println(up.fizzBuzzLabel("fa"));
        System.out.println(up.fizzBuzzLabel("ab"));
        System.out.println(up.fizzBuzzLabel("a"));

        System.out.println("");
        System.out.println(up.countHi("abc hi ho"));
        System.out.println(up.countHi("hihi"));
        System.out.println(up.countHi("h"));

        System.out.println("");
        System.out.println(up.catsEqualDogs("catdog"));

        System.out.println("");
        System.out.println(up.countCode("aaacodebbb"));

        System.out.println("");
        System.out.println(up.repeatEnd("Hello", 3));
    }
}