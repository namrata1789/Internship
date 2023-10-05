import java.io.*;
public class Addition {
    int a=0,b=0,sum=0;
    public int addTwoInt(int a,int b)
    {
        sum=a+b;/* 
        println("Addition of a and b is:"+sum); */
        return sum;        
    }
    public static void main(String[] args) {
        Addition a = new Addition();
        int addition = a.addTwoInt(5, 8);
        System.out.println("Sum of a and b is:"+addition);
    }
}
