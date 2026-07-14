package auca.student;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    /**
     * Test for addTwoNumbers function
     */
    @Test
    public void testAddTwoNumbers()
    {
        App app = new App();
        
        // Test basic addition
        assertEquals(15, app.addTwoNumbers(5, 10));
        
        // Test with zero
        assertEquals(5, app.addTwoNumbers(5, 0));
        assertEquals(0, app.addTwoNumbers(0, 0));
        
        // Test with negative numbers
        assertEquals(-5, app.addTwoNumbers(-10, 5));
        assertEquals(-15, app.addTwoNumbers(-5, -10));
    }

    /**
     * Test for greetByAgeAndGender function - Baby girl (age < 8, female)
     */
    @Test
    public void testGreetBabyGirl()
    {
        App app = new App();
        assertEquals("Hello baby girl", app.greetByAgeAndGender("female", 5));
        assertEquals("Hello baby girl", app.greetByAgeAndGender("female", 0));
        assertEquals("Hello baby girl", app.greetByAgeAndGender("female", 7));
    }

    /**
     * Test for greetByAgeAndGender function - Baby boy (age < 8, boy)
     */
    @Test
    public void testGreetBabyBoy()
    {
        App app = new App();
        assertEquals("Hello baby boy", app.greetByAgeAndGender("boy", 3));
        assertEquals("Hello baby boy", app.greetByAgeAndGender("boy", 0));
        assertEquals("Hello baby boy", app.greetByAgeAndGender("boy", 7));
    }

    /**
     * Test for greetByAgeAndGender function - Young lady (8 <= age < 18, female)
     */
    @Test
    public void testGreetYoungLady()
    {
        App app = new App();
        assertEquals("Hello young lady", app.greetByAgeAndGender("female", 8));
        assertEquals("Hello young lady", app.greetByAgeAndGender("female", 12));
        assertEquals("Hello young lady", app.greetByAgeAndGender("female", 17));
    }

    /**
     * Test for greetByAgeAndGender function - Young boy (8 <= age < 18, boy)
     */
    @Test
    public void testGreetYoungBoy()
    {
        App app = new App();
        assertEquals("Hello young boy", app.greetByAgeAndGender("boy", 8));
        assertEquals("Hello young boy", app.greetByAgeAndGender("boy", 10));
        assertEquals("Hello young boy", app.greetByAgeAndGender("boy", 17));
    }

    /**
     * Test for greetByAgeAndGender function - My lady (18 <= age < 35, female)
     */
    @Test
    public void testGreetMyLady()
    {
        App app = new App();
        assertEquals("Hello my lady", app.greetByAgeAndGender("female", 18));
        assertEquals("Hello my lady", app.greetByAgeAndGender("female", 25));
        assertEquals("Hello my lady", app.greetByAgeAndGender("female", 34));
    }

    /**
     * Test for greetByAgeAndGender function - My boy (18 <= age < 35, boy)
     */
    @Test
    public void testGreetMyBoy()
    {
        App app = new App();
        assertEquals("Hello my boy", app.greetByAgeAndGender("boy", 18));
        assertEquals("Hello my boy", app.greetByAgeAndGender("boy", 26));
        assertEquals("Hello my boy", app.greetByAgeAndGender("boy", 34));
    }

    /**
     * Test for greetByAgeAndGender function - Mum (age >= 35, female)
     */
    @Test
    public void testGreetMum()
    {
        App app = new App();
        assertEquals("Hello mum", app.greetByAgeAndGender("female", 35));
        assertEquals("Hello mum", app.greetByAgeAndGender("female", 50));
        assertEquals("Hello mum", app.greetByAgeAndGender("female", 100));
    }

    /**
     * Test for greetByAgeAndGender function - Sir (age >= 35, boy)
     */
    @Test
    public void testGreetSir()
    {
        App app = new App();
        assertEquals("Hello sir", app.greetByAgeAndGender("boy", 35));
        assertEquals("Hello sir", app.greetByAgeAndGender("boy", 45));
        assertEquals("Hello sir", app.greetByAgeAndGender("boy", 100));
    }

    /**
     * Test for greetByAgeAndGender function - Invalid age (age < 0)
     */
    @Test
    public void testGreetNegativeAge()
    {
        App app = new App();
        assertEquals("incorrect input message", app.greetByAgeAndGender("female", -1));
        assertEquals("incorrect input message", app.greetByAgeAndGender("boy", -5));
        assertEquals("incorrect input message", app.greetByAgeAndGender("female", -10));
    }

    /**
     * Test for greetByAgeAndGender function - Invalid gender
     */
    @Test
    public void testGreetInvalidGender()
    {
        App app = new App();
        assertEquals("incorrect input message", app.greetByAgeAndGender("unknown", 25));
        assertEquals("incorrect input message", app.greetByAgeAndGender("male", 25));
        assertEquals("incorrect input message", app.greetByAgeAndGender("", 25));
    }

    /**
     * Test for getGrade function - sample marks
     */
    @Test
    public void testGetGradeForSampleMarks()
    {
        App app = new App();
        assertEquals("D", app.getGrade(new int[]{40, 50, 80, 90, 87}));
    }

    /**
     * Test for getGrade function - distinction A
     */
    @Test
    public void testGetGradeForDistinctionA()
    {
        App app = new App();
        assertEquals("A", app.getGrade(new int[]{90, 95, 97}));
    }

    /**
     * Test for getGrade function - distinction B
     */
    @Test
    public void testGetGradeForDistinctionB()
    {
        App app = new App();
        assertEquals("B", app.getGrade(new int[]{80, 85, 88}));
    }

    /**
     * Test for getGrade function - distinction C
     */
    @Test
    public void testGetGradeForDistinctionC()
    {
        App app = new App();
        assertEquals("C", app.getGrade(new int[]{70, 75, 78}));
    }

    /**
     * Test for getGrade function - distinction D
     */
    @Test
    public void testGetGradeForDistinctionD()
    {
        App app = new App();
        assertEquals("D", app.getGrade(new int[]{60, 65, 67}));
    }

    /**
     * Test for getGrade function - distinction E
     */
    @Test
    public void testGetGradeForDistinctionE()
    {
        App app = new App();
        assertEquals("E", app.getGrade(new int[]{50, 55}));
    }

    /**
     * Test for getGrade function - fail grade F
     */
    @Test
    public void testGetGradeForFail()
    {
        App app = new App();
        assertEquals("F", app.getGrade(new int[]{40, 45, 48}));
    }

    /**
     * Test for getGrade function - invalid input
     */
    @Test
    public void testGetGradeForInvalidInput()
    {
        App app = new App();
        assertEquals("incorrect input message", app.getGrade(null));
        assertEquals("incorrect input message", app.getGrade(new int[]{}));
    }

    /**
     * Test for getEvenNumbers function - sample input
     */
    @Test
    public void testGetEvenNumbers()
    {
        App app = new App();
        assertArrayEquals(new int[]{2, 4, 6, 8, 10}, app.getEvenNumbers(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}));
    }

    /**
     * Test for getEvenNumbers function - no even numbers
     */
    @Test
    public void testGetEvenNumbersWithNoEvenNumbers()
    {
        App app = new App();
        assertArrayEquals(new int[]{}, app.getEvenNumbers(new int[]{1, 3, 5, 7, 9}));
    }

    /**
     * Test for getEvenNumbers function - empty or null input
     */
    @Test
    public void testGetEvenNumbersWithInvalidInput()
    {
        App app = new App();
        assertArrayEquals(new int[]{}, app.getEvenNumbers(new int[]{}));
        assertArrayEquals(new int[]{}, app.getEvenNumbers(null));
    }
}