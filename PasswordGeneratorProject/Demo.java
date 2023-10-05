/* A. Define a class Example
a. Define two instance variables number and name
b. Define accessor (getter) methods
c. Define mutator (setter) methods
d. define method printDetails —-> print name and number
B. Define public class Demo (Main Class)
a. Define main method
b. Make Instance/object of example class
c. set number and name using instance created as 123 and Your name.
d. call printDetails method using instance
 */
import java.io.*;
class Example {
    String name;
    String number;
    public String getName() {
        return name;
    }
    public String getNumber() {
        return number;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setNumber(String number) {
        this.number = number;
    }
    public void printDetails()
    {
        System.out.println("Name is:"+name);
        System.out.println("Number is:"+number);
    }
}
public class Demo{
    public static void main(String[] args) {
        Example e = new Example();
        e.setName("Namrata");
        e.setNumber("123");
        e.printDetails();
    }

}
