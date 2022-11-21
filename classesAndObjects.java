public class HelloWorld {
    
    public static void main(String[] args){

        Car c1 = new Car();
        System.out.println(c1.color);
    }

}

public class Car {

    //Atributes
    public int modelYear = 2023;
    public String color = "Red";

    //Methods
    public void drive(){
        System.out.println("Driving");
    }

}