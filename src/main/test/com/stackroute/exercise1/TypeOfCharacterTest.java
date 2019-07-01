package main.test.com.stackroute.exercise1;

import main.java.com.stackroute.exercise1.TypeOfCharacter;
import org.junit.*;

import static org.junit.Assert.*;

public class TypeOfCharacterTest {
    TypeOfCharacter typeOfCharacter;
    @Before
    public void setUp() throws Exception
    {
        typeOfCharacter=new TypeOfCharacter();
    }

    @After
    public void tearDown() throws Exception
    {
        typeOfCharacter= null;
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
    public void givenInputCapitalLetterReturnCapitalLetter()
    {
       String c= typeOfCharacter.checkTheTypeOfCharacter('A');
       assertEquals("Capital letter",c);
    }
    @Test
    public void givenInputLowerCaseLetterReturnSmallCaseLetter()
    {
        String c= typeOfCharacter.checkTheTypeOfCharacter('a');
        assertEquals("Small case letter",c);
    }
    @Test
    public void givenInputDigitReturnDigit()
    {
        String c= typeOfCharacter.checkTheTypeOfCharacter('1');
        assertEquals("A Digit",c);
    }
    @Test
    public void givenInputSpecialSymbolReturnSpecialSymbol()
    {
        String c= typeOfCharacter.checkTheTypeOfCharacter('#');
        assertEquals("Special Symbol",c);
    }
}