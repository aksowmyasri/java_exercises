package main.test.com.stackroute.exercise1;

import main.java.com.stackroute.exercise1.StringReverse;
import org.junit.*;

import static org.junit.Assert.*;

public class StringReverseTest {
    StringReverse stringReverse;
    @Before
    public void setUp() throws Exception
    {
        stringReverse= new StringReverse();
    }

    @After
    public void tearDown() throws Exception
    {
        stringReverse=null;
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
    public void givenInputStringReturnReverseOfTheString()
    {
        String rev=stringReverse.stringReverseWithoutStringBuffer("sowmya");
        assertEquals("aymwos",rev);
    }
    @Test
    public void givenInputStringReturnWrongReverse()
    {
        String rev=stringReverse.stringReverseWithoutStringBuffer("sowmya");
        assertNotEquals("hjgfjh",rev);
    }

}