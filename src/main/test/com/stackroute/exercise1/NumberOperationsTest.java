package main.test.com.stackroute.exercise1;

import main.java.com.stackroute.exercise1.NumberOperations;
import org.junit.*;

import static org.junit.Assert.*;

public class NumberOperationsTest {
    NumberOperations op;

    @Before
    public void setUp() throws Exception {
        op = new NumberOperations();
    }

    @After
    public void tearDown() throws Exception {
        op = null;
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
    public void testfunction() {
        String str = op.sortDecreasingOrderAndPrintSumOfEvenNumbers("3421");
        assertEquals("4321 6 false", str);

    }
    @Test
    public void testformat() {
        String str = op.sortDecreasingOrderAndPrintSumOfEvenNumbers("a345");
        assertEquals("format is invalid", str);

    }
}