package main.test.com.stackroute.exercise1;

import main.java.com.stackroute.exercise1.Palindrome;
import org.junit.*;

import static org.junit.Assert.*;

public class PalindromeTest {
    Palindrome p;
    @Before
    public void setUp()  {
    p=new Palindrome();
    }

    @After
    public void tearDown() {
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
    public void testForPalindromeGreaterThan25()
    {
        String expected=p.checkForPalindrome("8888");
        assertEquals("8888 is palindrome and the sum of even numbers is greater than 25",expected);

    }
    @Test
    public void testForPalindromeLessThan25()
    {
        String expected=p.checkForPalindrome("121");
        assertEquals("121 is palindrome and the sum of even numbers is less than 25",expected);

    }
    @Test
    public void testForNotPalindrome()
    {
        String expected=p.checkForPalindrome("14521");
        assertEquals("14521 is not a palindrome",expected);

    }

    @Test
    public void testForFormat()
    {
        String expected=p.checkForPalindrome("abc5");
        assertEquals("invalid input",expected);

    }

}