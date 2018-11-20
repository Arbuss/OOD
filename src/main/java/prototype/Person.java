package prototype;

public class Person implements Cloneable{
    int id;

    public Person(int id){
        this.id = id;
    }

    @Override
    public Person clone() {
        return new Person(this.id);
    }
}
