import java.util.Scanner;
import java.util.Random;

public class HighorLow {
    static void main()
    {
        Random gen = new Random();
        int rndVal = gen.nextInt(10)+1; // val is 1 to 10

        Scanner in = new Scanner(System.in);
        int guessNum = 0;
        boolean done = false;
        String trash = "";

        do{
            IO.print("Guess a random number [1-10]: ");
            if(in.hasNextInt())
            {
                guessNum = in.nextInt();
                in.nextLine();

                if ((guessNum>=1) && (guessNum<=10))
                {
                    if (guessNum < rndVal)
                    {
                        IO.println("Your guess " + guessNum + " is less than " + rndVal);
                    }
                    else if (guessNum > rndVal)
                    {
                        IO.println("Your guess " + guessNum + " is greater than " + rndVal);
                    }
                    else
                    {
                        IO.println("Correct!");
                    }

                    done = true;
                }

                else
                {
                    IO.println("You must enter a valid int in range [1-10]. Try again! ");
                }


            }
            else
            {
                trash = in.nextLine();
                IO.println("You must enter a valid number [1-10] not: " + trash);
                IO.println("Try again!");
            }

        }while (!done);


    }
}
