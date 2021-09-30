package patternr_ass3;

public class Person {
    public static void main(String[] args){
        BasicCar basicCar = new BasicCar();
        Car passengerCar = new PassangerCar(basicCar);
        passengerCar.design();


    System.out.println();
    System.out.println("-----luxury car + basic car------");
    Car luxuryCar = new LuxuryCar(basicCar);
    luxuryCar.design();

    System.out.println();
    System.out.println("-----luxury car + passenger car + basic car------");
    Car alCar = new LuxuryCar(new PassangerCar(basicCar));
    alCar.design();

    System.out.println();
    System.out.println("-----basic car-----");
    basicCar.design();

    }
}
