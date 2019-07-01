package main.test.com.stackroute.exercise1;

import main.java.com.stackroute.exercise1.VowelConsonant;
import org.junit.*;

import static org.junit.Assert.*;

public class VowelConsonantTest {
    VowelConsonant vowelConsonant;
    @Before
    public void setUp() throws Exception
    {
        vowelConsonant= new VowelConsonant();
    }

    @After
    public void tearDown() throws Exception {
        vowelConsonant=null;
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
    public void givenInputVowelReturnVowel()
    {
        String actual=vowelConsonant.checkWhetherVowelOrConsonant("a");
        assertEquals("Vowel",actual);
    }
    @Test
    public void givenInputConsonantReturnConsonant()
    {
        String actual=vowelConsonant.checkWhetherVowelOrConsonant("c");
        assertEquals("Consonant",actual);
    }
    @Test
    public void givenInputStringReturnSeriesOfVowelOrConsonant()
    {
        String actual=vowelConsonant.checkWhetherVowelOrConsonant("ab");
        assertEquals("VowelConsonant",actual);
    }
    @Test
    public void givenInputNUmberReturnNotALetter()
    {
        String actual=vowelConsonant.checkWhetherVowelOrConsonant("1");
        assertEquals("not a letter",actual);
    }
}