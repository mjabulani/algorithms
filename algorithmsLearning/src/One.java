import java.util.Scanner;

public class One {

    //        #1: Write a Java program to print 'Hello' on screen and then print your name on a separate line.
//          Expected Output :
//          Hello
//          Alexandra Abramov
    public static void printName(String name) {
        System.out.println("Hello " + name);
    }

    public static void printName() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Provide your name:");
        String name = scan.nextLine();
        printName(name);
    }
}

