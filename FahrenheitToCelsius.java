import java.util.Scanner; //import Scanner

public class FahrenheitToCelsius {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in); //create scanner tool

    System.out.print("Enter a degree in Fahrenheit: ");
    double fahrenheit = input.nextDouble();  //variable you will get user input
    //type name = input.nextType();

    double celsius = (5.0 / 9) * (fahrenheit - 32); //convert to celsius

    System.out.print("You entered: " + fahrenheit + " for fahrenheit. Which is " +
    celsius + " in celsius.")
    
  }
}

