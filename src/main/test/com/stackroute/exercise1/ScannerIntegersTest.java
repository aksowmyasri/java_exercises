package main.test.com.stackroute.exercise1;

import main.java.com.stackroute.exercise1.ScannerIntegers;
import org.junit.*;

import static org.junit.Assert.*;

public class ScannerIntegersTest {
    ScannerIntegers sc;
    @Before
    public void setUp() throws Exception
    {
        sc=new ScannerIntegers();
    }

    @After
    public void tearDown() throws Exception
    {
        sc=null;
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
    public void testscan()
    {
       int sum= sc.scanUnspecifiedArgumentsOfIntegersAndPrintSum(new int[] {10,20,30,40});
       assertEquals(100,sum);

    }
    @Test
    public void checkNegative()
    {
        int sum= sc.scanUnspecifiedArgumentsOfIntegersAndPrintSum(new int[] {10,20,30,40});
        assertNotEquals(101,sum);

    }

}
