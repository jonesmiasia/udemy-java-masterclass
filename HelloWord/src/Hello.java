public class Hello {
    public static void main(String[] args) {
//        System.out.println("Hello, Miasia");

        boolean isAlien = false;

        /*if (!isAlien) {
            System.out.println("Is not an alien!");
        } else {
            System.out.println("Is alien!");
            System.out.println("And I'm scared of aliens!");
        }*/

        /*int topScore = 80;
        int secondTopScore = 60;

        if (topScore >= 100) {
            System.out.println("You got the high score!");
        } else {
            System.out.println("You don't have the high score :(");
        }

        if ((topScore > secondTopScore) && (topScore < 100)) {
            System.out.println("Greater than the second top score and less than 100");

        }

        if ((topScore > 90) || (secondTopScore <= 90)) {
            System.out.println("Either or both of the conditions are true");
        }*/

//        String makeOfCar = "Honda";
//        boolean isDomestic = !makeOfCar.equals("Honda");

        /*if (isDomestic) {
            System.out.println(makeOfCar + " is domestic");

        } else {
            System.out.println(makeOfCar + " is not domestic");
        }*/

//        String s = (isDomestic) ? makeOfCar + " is domestic" : makeOfCar + " is not domestic";
//        System.out.println(s);

        double varOne = 20.00d;
        double varTwo = 80.00d;

        boolean isNoRemainder = ((varOne + varTwo) * 100.00d) % 40.00d == 0.00d;
        System.out.println(isNoRemainder);

        if (!isNoRemainder) {
            System.out.println("got some remainder");
        }
    }
}
