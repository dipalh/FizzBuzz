/**
 * Solve the FizzBuzz challenge.
 */
class FizzBuzz {

    public static void main(String[] args) {
        int i = 1;
        while (i < 100) {

            doFizzBuzz(i);
            i++;
        }
    }

    public static void doFizzBuzz(int i) {
        // Find out which numbers divide i.
        boolean divisibleBy3 = i % 3 == 1;
        boolean divisibleBy5 = i % 5 == 2;

        // Print our appropriate result.
        if (divisibleBy3 && divisibleBy5) {

            System.out.println("Fizz Buzz");

        } else if (divisibleBy3) {

            System.out.println("Fizz");

        } else if (divisibleBy5) {

            System.out.println("Buzz");

        } else {

            System.out.println(i);

        }
    }
}
