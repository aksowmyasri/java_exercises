package main.test.com.stackroute.exercise1;

import main.java.com.stackroute.exercise1.VowelConsonant;
import org.junit.*;

import static org.junit.Assert.*;

public class VowelConsonantTest {
    VowelConsonant v;
    @Before
    public void setUp() throws Exception
    {
        v= new VowelConsonant();
    }

    @After
    public void tearDown() throws Exception {
        v=null;
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
    public void checkForVowel()
    {
        String actual=v.checkWhetherVowelOrConsonant("a");
        assertEquals("Vowel",actual);
    }
    @Test
    public void checkForConsonant()
    {
        String actual=v.checkWhetherVowelOrConsonant("c");
        assertEquals("Consonant",actual);
    }
    @Test
    public void checkForVowelConsonant()
    {
        String actual=v.checkWhetherVowelOrConsonant("ab");
        assertEquals("VowelConsonant",actual);
    }
    @Test
    public void checkNegative()
    {
        String actual=v.checkWhetherVowelOrConsonant("1");
        assertEquals("not a letter",actual);
    }
}