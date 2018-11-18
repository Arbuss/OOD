import adapter.Adapter;
import adapter.AdapterFromStrNumToCalc;
import adapter.Calc;
import adapter.StringNum;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class AdapterTest {
    @Test
    public void adapterFromStrNumToCalcTest(){
        String strNum = StringNum.read(10);
        Adapter adapter = new AdapterFromStrNumToCalc();
        int intNum = adapter.adaptation(StringNum.read(10));

        assertEquals(11, Calc.increment(intNum));
    }
}
