import java.util.Scanner;

public class BasicInput {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int userInt = 0;
        double userDouble = 0.0;
        char userChar = ' ';
        String userString = " ";

        // TODO Define char and string variables similarly

        System.out.print("Enter integer:\n");
        userInt = scnr.nextInt();


        System.out.print("Enter double:\n");
        userDouble = scnr.nextDouble();

        System.out.print("Enter character:\n");
        userChar = scnr.next().charAt(0);

        System.out.print("Enter string:\n");
        userString = scnr.next();


        System.out.println(userInt + " " + userDouble + " " + userChar + " " + userString);
        System.out.println(userString + " " + userChar + " " + userDouble + " " + userInt);
        System.out.print(userDouble + " cast to an integer " + (int)(userDouble));


        // TODO (1): Finish reading other items into variables, then output the four values on a single line separated by a space

        // TODO (2): Output the four values in reverse

        // TODO (3): Cast the double to an integer, and output that integer

    }
}