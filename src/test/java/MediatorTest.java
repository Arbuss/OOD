import mediator.Component;
import mediator.ComponentA;
import mediator.ComponentB;
import mediator.SpecMediator;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MediatorTest {
    @Test
    public void mediatorTest(){
        Component compA = new ComponentA(new SpecMediator());
        Component compB = new ComponentB(new SpecMediator());

        assertEquals("a", compA.operation());
        assertEquals("b", compB.operation());
    }
}
