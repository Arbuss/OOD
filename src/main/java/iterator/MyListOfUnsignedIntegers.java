package iterator;

import java.util.Iterator;

public class MyListOfUnsignedIntegers implements Iterable{
    public class MyListIteratorA implements Iterator {
        MyListOfUnsignedIntegers list;
        MyListOfUnsignedIntegers.Elem temp;

        public MyListIteratorA(MyListOfUnsignedIntegers list){
            this.list = list;
            this.temp = this.list.first;
        }

        @Override
        public boolean hasNext() {
            return this.temp.next != null;
        }

        @Override
        public Integer next() {
            if(hasNext()) {
                Elem prev = temp;
                temp = temp.next;
                return prev.el;
            }
            return temp.el;
        }

        public int get(){
            return temp.el;
        }
    }

    class Elem{
        int el;
        Elem next;

        Elem(int x){
            el = x;
        }

        Elem(){
            el = -1;
        }
    }

    private Elem first;

    public MyListOfUnsignedIntegers(){
        this.first = new Elem(-1);
    }

    public void add(int num){
        if(first.el == -1)
            first.el = num;
        else{
            Elem temp = first;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = new Elem(num);
        }
    }

    @Override
    public Iterator iterator() {
        return new MyListIteratorA(this);
    }
}
