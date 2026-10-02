import java.util.Scanner;

public class CtoFConverter {
    void main()
    {
        Scanner in = new Scanner(System.in);

        double cVal = 0;
        double fVal = 0;
        boolean done = false;
        String trash = "";

        do{
            IO.print("Enter the C value: ");

            if(in.hasNextDouble())
            {
                cVal = in.nextDouble();
                in.nextLine();
                fVal = cVal * 9.0/5 + 32;
                IO.println("The value " + cVal + " in Celsius is " + fVal + " in Fahrenheit.");
                done = true;
            }
            else
            {
                trash = in.nextLine();
                IO.println("You must enter a valid Fahrenhit value not: " + trash);
                IO.println("Try again!");
            }

        }while (!done);
    }
}
