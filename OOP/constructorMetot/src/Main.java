public class Main {
    public static void main(String[] args) {

        Car audi = new Car("Audi", 10, "black");
        audi.printInfo();

        Car bmw = new Car();
        bmw.model = "BMW";
        bmw.speed = 20;


        Car tesla = new Car();
        tesla.model = "Model 3";
        tesla.speed = 30;
    }
}