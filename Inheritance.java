package JavaOOPs;
class Shape{
    String color;
}

class Triangle extends Shape{       //Here the 'Triangle' class interited all the properties of 'Shape' class using the keyword "extends"
//This class will automactically contain the 'color' property even if we haven't defined it in triangle class

}
public class Inheritance {
    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        triangle.color = "Red"; // Accessing and setting the 'color' property inherited from the Shape class
        System.out.println("Color of the triangle: " + triangle.color);
    }
}
