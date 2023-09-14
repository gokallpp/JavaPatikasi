public class Car {

    //nitelikler / degişkenler
    String type;
    String model;
    String color;
    int speed;
    int speedLimit;


    Car(String model, int speed, String color){
        this.model = model;
        this.speed = speed;
        this.color = color;
        this.type = "SEDAN";
        this.speedLimit = 180;
    }

    Car(){
        System.out.println("Constructor (Yapıcı, boş) Metot Ouştu");
    }



    //davranışlar / metot
    void increaseSpeed(int increment){
        this.speed += increment;
    }

    void decreaseSpeed(int decrease){
        if (this.speed > 0){
            this.speed -= decrease;
        }
    }

    void printSpeed(){

        System.out.println(this.model + " Hızı : " + this.speed);
    }

    void printInfo(){
        System.out.println("Model :\t" + this.model);
        System.out.println("Color :\t" + this.color);
        System.out.println("type  :\t" + this.type);
        System.out.println("Speed :\t" + this.speed);
    }
}
