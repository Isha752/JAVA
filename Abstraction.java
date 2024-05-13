package JavaOOPs;
abstract class Animal{      //Its just a concept
//In abstract class we can also make a function or a property as abstract
// if we make any function as abstract then there is no need of writing its implementation
//It can have both abstract and non-abstract methods
    public void eat(){
        System.out.println("Animal eats");
    }

    //we can also create a constructor inside an abstract class
    Animal(){
        System.out.println("You are creating a new animal");
    }
    abstract void walk(); // Its a type a type of function which should exist in every other class in this program
}

class Horse extends Animal{
    Horse(){
        System.out.println("Creating a horse");
    }
    public void walk(){
        System.out.println("Horse walks on 4 legs");
    }
}

class Chicken extends Animal{
    public void walk(){
        System.out.println("Chicken walks on 2 legs");
    }
}

public class Abstraction {
    public static void main(String[] args) {

        Horse horse = new Horse();          //This statement is mandatory for classes, functions etc
//To access the constructor we only need to write the above statement, no need to write other statements.
        horse.walk();

        //here we are calling the non-abstract method tat we created in the absteact 'Animal' class
        horse.eat();

        Chicken chicken = new Chicken();
        chicken.walk();

        //The below code displays runtime error, instantiate = initiate, create
        //since class 'Animal' is just abstract it has no function or working 
//        Animal animal = new Animal();
//        animal.walk();
        
    }
    
}
