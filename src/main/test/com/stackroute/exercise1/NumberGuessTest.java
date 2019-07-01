package main.test.com.stackroute.exercise1;

import main.java.com.stackroute.exercise1.NumberGuess;
import org.junit.*;

import static org.junit.Assert.*;

public class NumberGuessTest
{
    NumberGuess numberGuess;
    @Before
    public void setUp()  {
        numberGuess = new NumberGuess();
    }

    @After
    public void tearDown() {
        numberGuess=null;
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
    public void givenInputCorrectReturnNumberGuessMatches(){
        String str=numberGuess.guessTheTargetNumber(34,new int[]{23,45,34});
        assertEquals("Number guessed matches the original number",str);
    }
    @Test
    public void givenWrongInputReturnUDidnotPlayWell(){
        String str=numberGuess.guessTheTargetNumber(34,new int[]{23,45,33});
        assertEquals("u didnt play well",str);
    }


}