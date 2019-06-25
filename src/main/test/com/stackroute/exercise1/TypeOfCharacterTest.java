package main.test.com.stackroute.exercise1;

import main.java.com.stackroute.exercise1.TypeOfCharacter;
import org.junit.*;

import static org.junit.Assert.*;

public class TypeOfCharacterTest {
    TypeOfCharacter to;
    @Before
    public void setUp() throws Exception
    {
        to=new TypeOfCharacter();
    }

    @After
    public void tearDown() throws Exception
    {
        to = null;
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
    public void testCaptial()
    {
       String c= to.checkTheTypeOfCharacter('A');
       assertEquals("Capital letter",c);
    }
    @Test
    public void testLowerCase()
    {
        String c= to.checkTheTypeOfCharacter('a');
        assertEquals("Small case letter",c);
    }
    @Test
    public void testDigit()
    {
        String c= to.checkTheTypeOfCharacter('1');
        assertEquals("A Digit",c);
    }
    @Test
    public void testSymbol()
    {
        String c= to.checkTheTypeOfCharacter('#');
        assertEquals("Special symbol",c);
    }
}