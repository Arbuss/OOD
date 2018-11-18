package abstract_factory;

public class CarFactory1 implements CarFactory{
    public Car factory(Car car){
        if(car.getClass().equals(Sport1.class))
            return new Muscle1();
        return new Sport1();
    }
}
