package main.test.com.stackroute.exercise1;

import main.java.com.stackroute.exercise1.EvenOdd;
import org.junit.*;

import static org.junit.Assert.*;

public class EvenOddTest {
    EvenOdd eo;
    @Before
    public void setUp(){
        eo=new EvenOdd();
    }

    @After
    public void tearDown(){
        eo=null;
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
    public void testForEven()
    {
        String t=eo.checkWhetherNumberIsEvenOrOdd(22);
        assertEquals("Jerry",t);

    }
    @Test
    public void testForOdd()
    {
        String t= eo.checkWhetherNumberIsEvenOrOdd(23);
        assertEquals("Tom",t);
    }
    @Test
    public void testNegative()
    {
        String t=eo.checkWhetherNumberIsEvenOrOdd('@');
        assertEquals("input incorrect",t);
    }
}