package main.test.com.stackroute.exercise1;

import main.java.com.stackroute.exercise1.StringRepeat;
import org.junit.*;

import static org.junit.Assert.*;

public class StringRepeatTest {
    StringRepeat sr;
    @Before
    public void setUp() throws Exception
    {
        sr=new StringRepeat();
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
    public void testRepeat()
    {
        String output=sr.toRepeatLastNCharactersOfTheString("stackroute",2);
        assertEquals("stackroutetete",output);
    }
    @Test
    public void testNegative()
    {
        String output=sr.toRepeatLastNCharactersOfTheString("stackroute",2);
        assertNotEquals("stackroutee",output);
    }

}