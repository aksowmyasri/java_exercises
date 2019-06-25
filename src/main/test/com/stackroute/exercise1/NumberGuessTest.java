package main.test.com.stackroute.exercise1;

import main.java.com.stackroute.exercise1.NumberGuess;
import org.junit.*;

import static org.junit.Assert.*;

public class NumberGuessTest
{
    NumberGuess ng;
    @Before
    public void setUp()  {
        ng = new NumberGuess();
    }

    @After
    public void tearDown() {
        ng=null;
    }
    @BeforeClass
    public static void setUpBeforeClass()
    {
        System.out.println("Class creation");
    }
    @AfterClass
    public static void tearDownAfterClass()
    {
        System.out.println("Class deletion");
    }
    @Test
    public void testNumberGuess(){
        String str=ng.guessTheTargetNumber(34,new int[]{23,45,34});
        assertEquals("Number guessed matches the original number",str);
    }
    @Test
    public void testNegativeNumberGuess(){
        String str=ng.guessTheTargetNumber(34,new int[]{23,45,33});
        assertEquals("u didnt play well",str);
    }


}