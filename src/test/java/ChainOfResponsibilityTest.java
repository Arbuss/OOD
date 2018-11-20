import chain_of_responsibility.Handler;
import chain_of_responsibility.HandlerA;
import chain_of_responsibility.HandlerB;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ChainOfResponsibilityTest {
    @Test
    public void chainOfResponsibilityTest(){
        Handler handler1 = new HandlerB(null);
        Handler handler = new HandlerA(handler1);

        int res = (int) handler.handle("2");
        assertEquals(2, res);
    }
}
