package JavaOOPs;
class Student{
    String name;
    int age;

    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }

// //Constructor is called or written as:(Non-parameterized constructor)
//     Student(){
//         System.out.println("constructors called");
//     }

// //Parameterized constructor
//     Student(String name, int age){
//         this.name = name;
//         this.age = age;
//     }

//Copy Constructor
        Student(Student s2){
            this.name = s2.name;
            this.age = s2.age;
        }

        Student(){
            //This is s1 constructor which will be empty by default since we are using it in previous constructor
            //since we are using 'Student s1' so we have to define its by default constructor 
        }
}
public class Constructor {
    public static void main(String[] args) {
//The below statements would be used in non-parameterized constructors
        Student s1 = new Student();   //so whenever an object is created first the constructor is called and then the other functions are performed
        s1.name = "aman";
        s1.age = 24;

// //The below statements would be used in parameterized constructors
//         Student s1 = new Student("Isha", 22);
//         s1.printInfo();

//The below statements would be used in copy constructor
        Student s2 = new Student(s1);
        s2.printInfo();
    }
    
}
