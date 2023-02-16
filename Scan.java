import java.util.Scanner;

import javax.swing.event.SwingPropertyChangeSupport;

public class Scan {
    public static void main(String[] args) {
        
    int x;
    Scanner s1 = new Scanner(System.in);
    System.out.println("Enter a number: ");
    x = s1.nextInt();
    System.out.println("Square of the entered number is: "+x*x);
    }
    
}
