package JavaOOPs;
interface Animal{
//all the properties in interfaces are static, public and final
//For Example:
    int eyes = 2;
//Here the property 'eyes' will be same for all the animals and it will fixed

//since interfaces consist of pure abstraction, we don't implement the function as it will lead to a non-abstract function
//Here we just define the function
    public void walk();
}

//A class "implements" an interface it does not 'extends' it 
class Horse implements Animal{
//Here we implement the function
    public void walk(){     //It is mandatory to write 'public' here, otherwise its access modifier will become 'default'.
        System.out.println("walks on 4 legs.");
    }
//Here we have to give implementation for the function we wrote in the interface
}

public class Interfaces {
    public static void main(String[] args) {
        Horse horse = new Horse();
        horse.walk();
    }
    
}
