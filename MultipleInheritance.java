package JavaOOPs;
//This shows how we implement Multiple Inheritance with the use of interface
interface Animal{
    public void walk();
}

interface Herbivore{

}

//Below the class 'Horse' takes properties of both interfaces together
class Horse implements Animal,Herbivore{
    public void walk(){     
    System.out.println("walks on 4 legs.");
}
}

public class MultipleInheritance {
    public static void main(String[] args) {
        Horse horse = new Horse();
        horse.walk();
    }
}
