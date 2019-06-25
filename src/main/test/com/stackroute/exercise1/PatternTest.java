package main.test.com.stackroute.exercise1;

import main.java.com.stackroute.exercise1.Pattern;
import org.junit.*;

import static org.junit.Assert.*;

public class PatternTest {
    Pattern p;
    @Before
    public void setUp() throws Exception
    {
        p=new Pattern();
    }

    @After
    public void tearDown() throws Exception
    {
        p=null;
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
    public void testPattern()
    {
        String pat=p.printingPattern(5);
        assertEquals("122333444455555",pat);
    }
    @Test
    public void testNegative()
    {
        String pat=p.printingPattern(5);
        assertNotEquals("122334455555",pat);
    }

}