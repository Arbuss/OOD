import org.junit.Test;
import state.Context;
import state.StateA;
import state.StateB;

import static junit.framework.TestCase.assertEquals;

public class StateTest {
    @Test
    public void stateTest(){
        Context context = new Context(new StateA());

        assertEquals("Hello", context.doThis());
        context.setState(new StateB());
        assertEquals("world!", context.doThis());
    }
}
