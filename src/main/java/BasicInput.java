import java.util.Scanner;

public class BasicInput {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int userInt = 0;
        double userDouble = 0.0;

        // TODO Define char and string variables similarly
        char userChar = ' ';
        String userString = " ";
        System.out.print("Enter integer:\n");
        userInt = scnr.nextInt();


        System.out.print("Enter double:\n");
        userDouble = scnr.nextDouble();

        System.out.print("Enter character:\n");
        userChar = scnr.next().charAt(0);

        System.out.print("Enter string:\n");
        userString = scnr.next();



        // TODO (1): Finish reading other items into variables, then output the four values on a single line separated by a space
        System.out.print(userInt + " ");
        System.out.print(userDouble + " ");
        System.out.print(userChar + " ");
        System.out.print(userString + "\n");
        // TODO (2): Output the four values in reverse
        System.out.print(userString);
        System.out.print(" " + userChar);
        System.out.print(" " + userDouble);
        System.out.print(" " + userInt + "\n");


        // TODO (3): Cast the double to an integer, and output that integer
        System.out.print(userDouble + " cast to an integer is " + (int)(userDouble));
    }
}