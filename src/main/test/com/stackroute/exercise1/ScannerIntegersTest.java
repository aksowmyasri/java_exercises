package main.test.com.stackroute.exercise1;

import main.java.com.stackroute.exercise1.ScannerIntegers;
import org.junit.*;

import static org.junit.Assert.*;

public class ScannerIntegersTest {
    ScannerIntegers scannerIntegers;
    @Before
    public void setUp() throws Exception
    {
        scannerIntegers=new ScannerIntegers();
    }

    @After
    public void tearDown() throws Exception
    {
        scannerIntegers=null;
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
    public void givenInputIntegersReturnSum()
    {
       int sum= scannerIntegers.scanUnspecifiedArgumentsOfIntegersAndPrintSum(new int[] {10,20,30,40});
       assertEquals(100,sum);

    }
    @Test
    public void givenInputIntegersReturnWrongSum()
    {
        int sum= scannerIntegers.scanUnspecifiedArgumentsOfIntegersAndPrintSum(new int[] {10,20,30,40});
        assertNotEquals(101,sum);

    }

}
