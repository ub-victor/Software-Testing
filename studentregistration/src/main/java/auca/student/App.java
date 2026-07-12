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
    // Grading system that takes a list of marks you geot from different course then find the average
    // 40,50,80,90,87
    // 
    
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
    }
}
