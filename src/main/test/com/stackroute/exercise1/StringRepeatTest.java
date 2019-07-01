package main.test.com.stackroute.exercise1;

import main.java.com.stackroute.exercise1.StringRepeat;
import org.junit.*;

import static org.junit.Assert.*;

public class StringRepeatTest {
    StringRepeat stringRepeat;
    @Before
    public void setUp() throws Exception
    {
        stringRepeat=new StringRepeat();
    }

    @After
    public void tearDown() throws Exception
    {
        stringRepeat=null;
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
    public void givenInputStringReturnRepeatedString()
    {
        String output=stringRepeat.toRepeatLastNCharactersOfTheString("stackroute",2);
        assertEquals("stackroutetete",output);
    }
    @Test
    public void givenIputStringReturnWrongString()
    {
        String output=stringRepeat.toRepeatLastNCharactersOfTheString("stackroute",2);
        assertNotEquals("stackroutee",output);
    }

}