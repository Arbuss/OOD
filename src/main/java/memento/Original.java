package memento;

public class Original {

    private int field1;
    private String field2;

    public Original(int f1, String f2){
        field1 = f1;
        field2 = f2;
    }

    public Memento save(){
        return new Memento(field1, field2);
    }

    public void restore(Memento mem){
        field1 = mem.field1;
        field2 = mem.field2;
        /*
        со ссылочными типами можно вызывать метод copy или проводить глубокое копирование
        любым другим образом
        */
    }

    class Memento{
        int field1;
        String field2;
        Memento(int f1, String f2){
            field1 = f1;
            field2 = f2;
        }
    }
}
