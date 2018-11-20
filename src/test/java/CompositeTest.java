import composite.Buckwheat;
import composite.Composite;
import composite.Tomato;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CompositeTest {
    @Test
    public void compositeTest(){
        Composite comp = new Composite();

        Tomato t = new Tomato();
        Buckwheat b = new Buckwheat();

        comp.add(t);
        comp.add(b);

        assertEquals(14, comp.getPrice());
    }
}
