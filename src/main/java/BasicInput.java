import java.util.Scanner;

public class BasicInput {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int userInt = 0;
        double userDouble = 0.0;
        char userChar = ' ';
        String userString = " ";

        // TODO Define char and string variables similarly

        System.out.println("Enter integer:");
        userInt = scnr.nextInt();


        System.out.println("Enter double:");
        userDouble = scnr.nextDouble();

        System.out.println("Enter character:");
        userChar = scnr.next().charAt(0);

        System.out.println("Enter string:");
        userString = scnr.next();


        System.out.print(userInt + " ");
        System.out.print(userDouble + " ");
        System.out.print(userChar);
        System.out.println(" " + userString);
        System.out.print(userString + " ");
        System.out.print(userChar);
        System.out.print(" " + userDouble + " ");
        System.out.println(userInt);
        System.out.print(userDouble);
        System.out.print(" cast to an integer ");
        System.out.print((int)(userDouble));


        // TODO (1): Finish reading other items into variables, then output the four values on a single line separated by a space

        // TODO (2): Output the four values in reverse

        // TODO (3): Cast the double to an integer, and output that integer

    }
}