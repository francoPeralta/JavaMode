public class HelloWorld {

    public static void main(String [] args){

        // A method  is a block of code which only runs when it is called
        sayHello("Franco", 23);

    }

    public static void sayHello(String name, int age){
        System.out.println("Hello " + name + ", your age is: " + age);
    }

    public static int addTwoNumbers(int one, int two){
        return one + two;
    }

}