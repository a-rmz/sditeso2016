package mx.iteso;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.mockito.AdditionalAnswers.*;
import static org.mockito.Mockito.*;

public class TacitKnowledgePrinterTest {

    //Test printNumbers with a limit of 10
    //Verify calculate being called 10 times
    //Verify expected result

    //Test printNumbers with a limit of 0
    //Verify Exception

    //What else can we test?
    //What should we verify?

    private Printer printer;
    TacitKnowledgePrinter tkp;

    @Before
    public void setup() {
        printer = mock(Printer.class);
        tkp = new TacitKnowledgePrinter(printer);
        when(printer.print(anyString())).then(returnsFirstArg());
    }

    @Test (expected = RuntimeException.class)
    public void printZeroNumbersTest() {
        tkp.printNumbers(0);
    }

    @Test
    public void calculateTest() {
        tkp.printNumbers(10);
        verify(printer, times(10)).print(anyString());
    }

    @Test
    public void printStringsThreeFiveTest() {
        Assert.assertEquals(
                tkp.calculate(15),
                "TacitKnowledge"
        );
    }

    @Test (expected = RuntimeException.class)
    public void printStringsThreeTest() {
        Assert.assertEquals(
                tkp.calculate(3),
                "Tacit"
        );
    }

    @Test
    public void printStringsFiveTest() {
        Assert.assertEquals(
                tkp.calculate(5),
                "Knowledge"
        );
    }

    @Test
    public void printStringsInvalidTest() {
        Assert.assertEquals(
                tkp.calculate(17),
                "17"
        );
    }

    @Test
    public void countToFifteenTest() {
        Assert.assertEquals(
               tkp.printNumbers(15),
                "12Tacit4KnowledgeTacit78TacitKnowledge11Tacit1314TacitKnowledge"
        );
    }




}
