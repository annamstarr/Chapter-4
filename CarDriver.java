public class CarDriver {
    public static void main(String[] args) {
        Car myCar = new Car("FJ", 2007);
        System.out.println(myCar);
        
        Car yourCar = new Car("FJ", 2007);
        System.out.println(myCar.equals(yourCar));
        
    }
}