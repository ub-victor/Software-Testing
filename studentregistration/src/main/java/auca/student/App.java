package auca.student;

/**
 * Hello world!
 *
 */

public class App
{
    public int addTwoNumbers(int a, int b) {
        return a + b;
    }
    
    /**
     * Greeting function based on age and gender
     * @param gender String representing gender ("female" or "boy")
     * @param age int representing age
     * @return greeting message based on age and gender
     */
    public String greetByAgeAndGender(String gender, int age) {
        // Check for invalid age
        if (age < 0) {
            return "incorrect input message";
        }
        
        // Check age groups with gender
        if (age < 8) {
            if ("female".equalsIgnoreCase(gender)) {
                return "Hello baby girl";
            } else if ("boy".equalsIgnoreCase(gender)) {
                return "Hello baby boy";
            }
        } else if (age < 18) {
            if ("female".equalsIgnoreCase(gender)) {
                return "Hello young lady";
            } else if ("boy".equalsIgnoreCase(gender)) {
                return "Hello young boy";
            }
        } else if (age < 35) {
            if ("female".equalsIgnoreCase(gender)) {
                return "Hello my lady";
            } else if ("boy".equalsIgnoreCase(gender)) {
                return "Hello my boy";
            }
        } else { // age >= 35
            if ("female".equalsIgnoreCase(gender)) {
                return "Hello mum";
            } else if ("boy".equalsIgnoreCase(gender)) {
                return "Hello sir";
            }
        }
        
        return "incorrect input message"; // for invalid gender
    }
    /**
     * Calculate the grade from a list of marks.
     * @param marks array of marks for different courses
     * @return grade letter based on the average
     */
    public String getGrade(int[] marks) {
        if (marks == null || marks.length == 0) {
            return "incorrect input message";
        }

        int total = 0;
        for (int mark : marks) {
            total += mark;
        }

        double average = total / (double) marks.length;

        if (average >= 90) {
            return "A";
        } else if (average >= 80) {
            return "B";
        } else if (average >= 70) {
            return "C";
        } else if (average >= 60) {
            return "D";
        } else if (average >= 50) {
            return "E";
        } else {
            return "F";
        }
    }

/**
     * Return only the even numbers from an array.
     * @param numbers input array of integers
     * @return array containing only even numbers
     */
    public int[] getEvenNumbers(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            return null;
        }

        int count = 0;
        for (int number : numbers) {
            if (number % 2 == 0) {
                count++;
            }
        }

        int[] evenNumbers = new int[count];
        int index = 0;
        for (int number : numbers) {
            if (number % 2 == 0) {
                evenNumbers[index] = number;
                index++;
            }
        }

        return evenNumbers;
    }
    
    public static void main( String[] args )
    {

        
        int sum = new App().addTwoNumbers(5, 10);
        System.out.println("The sum of 5 and 10 is: " + sum);
        App app = new App();

        System.out.println(app.greetByAgeAndGender("female", 6));
        System.out.println(app.greetByAgeAndGender("boy", 15));
        System.out.println(app.greetByAgeAndGender("female", 25));
        System.out.println(app.greetByAgeAndGender("boy", 40));
        System.out.println(app.greetByAgeAndGender("male", 20));
        System.out.println(app.getGrade(new int[]{40, 50, 80, 90, 87}));
        System.out.println(java.util.Arrays.toString(app.getEvenNumbers(new int[]{1,2,3,4,5,6,7,8,9,10})));
    }
}
