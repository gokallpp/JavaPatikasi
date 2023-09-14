 class Car {

    //nitelikler / degişkenler
    String type = "sedan";
    String model;
    String color;
    int speed;
    int speedLimit = 180; //hız limiti 180.



    //davranışlar / metot
    void increaseSpeed(int increment){
        if ((speed + increment) < speedLimit) {
            speed += increment;
        }
        speed += increment;
    }

    void decreaseSpeed(int decrease){
        if (speed > 0){
            speed -= decrease;
        }
    }

    void printSpeed(){

        System.out.println(model + " Hızı : " + speed);
    }

}
