
import java.util.Scanner;

public class Name{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        printMyName(name);
 
    }
    public static void printMyName(String name){
        System.out.println("My name is " + name);
        return;

    }
}