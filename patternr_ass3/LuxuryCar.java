package patternr_ass3;

public class LuxuryCar extends Decorator{
    public LuxuryCar(Car car) {
        super(car);
    }
    @Override
    public void design(){
        super.design();
        System.out.println(" Luxury car design. ");
    }
}
