import decorator.*;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class DecoratorTest {
    @Test
    public void decoratorTest(){
        Thing th = new Buckwheat();

        Decorator sd = new SpecDecorator(th);
        Decorator bd = new BaseDecorator(th, sd);

        assertEquals("BuckwheatBaseDecoratorBuckwheatSpecialDecorator", bd.getString());
    }
}
