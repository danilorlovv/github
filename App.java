package org.example;
import java.util.Scanner;
public class App 
{
    public static void main( String[] args )
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter text: ");
        String startText = scan.nextLine();
        System.out.println("You entered this: " + startText);
        String newText = "";
        for (int i=0; i < startText.length(); i++)
        {
            if (Character.isLetter(startText.charAt(i)))
            {
                if (Character.isLowerCase(startText.charAt(i)))
                    newText += Character.toUpperCase(startText.charAt(i));
                else
                    newText += Character.toLowerCase(startText.charAt(i));
            }
        }



        System.out.println("We got you this: " + newText);
    }
}