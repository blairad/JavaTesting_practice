import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class PrinterTest {

    Printer printer;

    @Before
    public void before() {printer = new Printer(100);}

    @Test
    public void hasPaper() { assertEquals(100, printer.getPaper()); }


}
