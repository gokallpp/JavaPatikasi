public class Main {
    public static void main(String[] args) {

        //niteliklre erişme
        //metotlara erişme


        Car audi = new Car(); // Car sınıfında Audi adında yeni bir Car üret.
        audi.model = "Audi A3";
        audi.speed = 50;
        audi.increaseSpeed(20);
        audi.printSpeed();


        Car tesla  = new Car();
        tesla.model = "Tesla Model S";
        tesla.speed = 100;
        tesla.increaseSpeed(50);
        tesla.printSpeed();


        Car bmw = new Car();
        bmw.model = "BMW X5";
        bmw.speed = 30;
        bmw.printSpeed();




    }
}
