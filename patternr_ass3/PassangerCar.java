package patternr_ass3;

public class PassangerCar extends Decorator{
    public PassangerCar(Car car) {
        super(car);
    }
    @Override
    public void design(){
        super.design();
        System.out.print("Passenger car design. ");
    }
}
