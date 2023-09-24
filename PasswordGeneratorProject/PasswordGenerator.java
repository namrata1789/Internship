import java.io.*;
import java.util.*;

public class PasswordGenerator1 {
    public String[] characters=new String[]
    {
        "abcdefghijklmnopqrstuvwxyz",
        "ABCDEFGHIJKLMNOPQRSTUVWXYZ",
        "0123456789",
        "!@#$%^"
    };
    public String generatePass(int length)
    {
        StringBuilder password=new StringBuilder(length);
        Random random=new Random(System.nanoTime());

        for(int i=0;i<length;i++){
            String charCategory = characters[random.nextInt(characters.length)];
            int position = random.nextInt(charCategory.length());
            password.append(charCategory.charAt(position));
        }

        return new String(password);
    }
    public int getRandomNumber(int min, int max) 
    {
         return (int) ((Math.random () * (max - min)) + min);
    }
    public void passwordStrength(int length){
        if(length<=4){
            System.out.println("Password Strength is Very Weak.");
        }
        else if(length>4 && length<=8){
            System.out.println("Password Strength is Weak.");
        }
        else if(length>8 && length<=10){
            System.out.println("Password Strength is Medium");
        }
        else if(length>10 && length<=13)
        {
            System.out.println("Password strength is Strong");
        }
        else
        System.out.println("Password strength is Very Strong");
    }
    public static void main(String[] args) {
        PasswordGenerator1 p=new PasswordGenerator1();
        String newPassword=p.generatePass(p.getRandomNumber(8, 16));
        System.out.println(newPassword);
        System.out.println("Length of a password is:"+newPassword.length());
        p.passwordStrength(newPassword.length());
    }
}
