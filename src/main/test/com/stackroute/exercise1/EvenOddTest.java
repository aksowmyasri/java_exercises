package main.test.com.stackroute.exercise1;

import main.java.com.stackroute.exercise1.EvenOdd;
import org.junit.*;

import static org.junit.Assert.*;

public class EvenOddTest {
    EvenOdd evenOdd;
    @Before
    public void setUp(){
        evenOdd=new EvenOdd();
    }

    @After
    public void tearDown(){
        evenOdd=null;
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
    public void givenInputEvenNumberShouldReturnJerry()
    {
        String t=evenOdd.checkWhetherNumberIsEvenOrOdd(22);
        assertEquals("Jerry",t);

    }
    @Test
    public void givenInputEvenNumberShouldReturnTom()
    {
        String t= evenOdd.checkWhetherNumberIsEvenOrOdd(23);
        assertEquals("Tom",t);
    }
    @Test
    public void givenInputNegativeShouldReturnInputIncorrect()
    {
        String t=evenOdd.checkWhetherNumberIsEvenOrOdd('@');
        assertEquals("input incorrect",t);
    }
}