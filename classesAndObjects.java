public class HelloWorld {
    
    public static void main(String[] args){

        Car c1 = new Car("white", 1999);

        c1.drive();
    }

}

public class Car {

    //Atributes
    public int modelYear;
    public String color;

    //Methods
    public void drive(){
        System.out.println("Driving");
    }

    //Constructor
    public Car(String color, int modelYear){
        this.color = color;
        this.modelYear = modelYear;
    }

}