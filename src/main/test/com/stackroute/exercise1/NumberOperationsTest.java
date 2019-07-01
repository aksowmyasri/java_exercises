package main.test.com.stackroute.exercise1;

import main.java.com.stackroute.exercise1.NumberOperations;
import org.junit.*;

import static org.junit.Assert.*;

public class NumberOperationsTest {
    NumberOperations numberOperations;

    @Before
    public void setUp() throws Exception {
        numberOperations = new NumberOperations();
    }

    @After
    public void tearDown() throws Exception {
        numberOperations = null;
    }

    @BeforeClass
    public static void setUpBeforeClass() {
        System.out.println("Class creation");
    }

    @AfterClass
    public static void tearDownAfterClass() {
        System.out.println("Class deletion");
    }

    @Test
    public void givenInputNumberReturnDecreasingOrderAndSumOfEvenNumbersAndCheckSumGreaterThan15() {
        String str = numberOperations.sortDecreasingOrderAndPrintSumOfEvenNumbers("3421");
        assertEquals("4321 6 false", str);

    }
    @Test
    public void givenInputStringReturnWrongFormat() {
        String str = numberOperations.sortDecreasingOrderAndPrintSumOfEvenNumbers("a345");
        assertEquals("format is invalid", str);

    }
    @Test
    public void givenInputNullReturnWrongFormat(){
        String str = numberOperations.sortDecreasingOrderAndPrintSumOfEvenNumbers("");
        assertEquals("format is invalid",str);
    }

}