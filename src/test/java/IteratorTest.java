import iterator.MyListOfUnsignedIntegers;
import org.junit.Test;

import java.util.Collections;
import java.util.Iterator;

import static org.junit.Assert.assertEquals;

public class IteratorTest {
    @Test
    public void iteratorTest(){
        MyListOfUnsignedIntegers list = new MyListOfUnsignedIntegers();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        Iterator it = list.iterator();

        assertEquals(1, it.next());
        assertEquals(2, it.next());
        assertEquals(3, it.next());
        assertEquals(4, it.next());
        assertEquals(5, it.next());
    }
}
