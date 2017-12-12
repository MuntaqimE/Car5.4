public class CarDriver {
    public static void main(String[] args){
        System.out.println("Number of Cars: " + NewCar.getCount());
        NewCar myCar = new NewCar();
        NewCar hisCar = new NewCar("Grey ", 150, 2.0, "Honda" );
        NewCar herCar = new NewCar("White ", 300 , 3.0, "Nissan");

        myCar.setColor("White");myCar.setHorsePower(550);myCar.setEngineSize(4.5);myCar.setMake("Lamborghini");
        hisCar.setColor("Red");hisCar.setHorsePower(750);hisCar.setEngineSize(5.0);myCar.setMake("Lamborghini");
        herCar.setColor("Pink");herCar.setHorsePower(400);herCar.setEngineSize(3.4);myCar.setMake("Lamborghini");

        System.out.println("My Car: " + myCar.getColor()+ " " + myCar.getHorsePower());
        System.out.println("His Car: " + hisCar.getColor()+ " " + hisCar.getHorsePower());
        System.out.println("Her Car: " + herCar.getColor()+ " " + herCar.getHorsePower());
        System.out.println("Number of Cars: " + NewCar.getCount());
    }
}
