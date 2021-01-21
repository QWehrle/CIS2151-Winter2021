//Quinn Wehrle
import java.util.Scanner;
public class Project0 {

    public static void main(String[] args) {
      
Scanner helloW = new Scanner(System.in);
System.out.println("Hello. What is your name?");
String yName = helloW.nextLine();
System.out.println("Hello "+ yName + ", What is a hobby that you enjoy?");
Scanner hoB = new Scanner(System.in);
String hobB = hoB.nextLine();
System.out.println("Wow! "+ hobB + "? That's really neat.");
   }
}