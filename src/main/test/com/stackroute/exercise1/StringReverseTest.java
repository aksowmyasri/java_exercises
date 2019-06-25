package main.test.com.stackroute.exercise1;

import main.java.com.stackroute.exercise1.StringReverse;
import org.junit.*;

import static org.junit.Assert.*;

public class StringReverseTest {
    StringReverse sr;
    @Before
    public void setUp() throws Exception
    {
        sr= new StringReverse();
    }

    @After
    public void tearDown() throws Exception
    {
        sr=null;
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
    public void testReverse()
    {
        String rev=sr.stringReverseWithoutStringBuffer("sowmya");
        assertEquals("aymwos",rev);
    }
    @Test
    public void testNegative()
    {
        String rev=sr.stringReverseWithoutStringBuffer("sowmya");
        assertNotEquals("hjgfjh",rev);
    }

}