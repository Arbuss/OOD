package abstract_factory;

public class CarFactory2 {
    public Car factory(Car car){
        if(car.getClass().equals(Sport2.class))
            return new Muscle2();
        return new Sport2();
    }
}
