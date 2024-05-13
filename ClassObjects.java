package JavaOOPs;
//Inside this we will define a blueprint of the pen
class Pen{
//These are the properties that we will call/access in the main function 
    String color;
    String type;           //ballpen or gelpen
//A function or a method are always defined inside a class
//Functions that are defined under a class are called as methods
    public void write(){        //here the 'write()' is a method
        System.out.println("Writing something");
//It is a function for a pen to write something
    }

//If we want to print the color and type of the pen then we will write the method as:
    public void printColor(){
        System.out.println(this.color);
//'this' is a keyword of java. It will tell which object has call this function
    }
}

public class ClassObjects {
//Objects of a class are written inside the main function
    public static void main(String[] args) {
//Here 'Pen' is the name of the class that we declared above and 'pen1'is the name of the variable that we gave which are basically objects
        Pen pen1 = new Pen();
//we will access the properties like below
        pen1.color = "Blue";
        pen1.type = "Gelpen";

        Pen pen2 = new Pen();
        pen2.color = "Black";
        pen2.type = "BallPoint";

        pen1.printColor();      //here using the 'this' keyword the function will come to know which object has called
        pen2.printColor();
//We will call the write method as below
        pen1.write();
    }

    
}
