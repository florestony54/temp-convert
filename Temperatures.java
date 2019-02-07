import java.util.Scanner;

public class Temperatures{
  public static void main(String[] args){
    converter();
  }


  public static void converter(){
    Scanner input = new Scanner(System.in);

    System.out.println("Temperature conversion. To convert F to C Type F." +
    " To convert C to F type C: ");

    char tempType = input.next().charAt(0);

    if (tempType == 'C'){
      System.out.println("Enter Temp in Celsius: ");

      double tempCel = input.nextDouble();
      double convertFar = (tempCel*(9.0/5))+ 32;

      System.out.println(convertFar + " Farenheit");
    } else if (tempType == 'F'){
      System.out.println("Enter Temp in Farenheit: ");

      double tempFar = input.nextDouble();
      double convertCel = (5.0/9)*(tempFar - 32);

      System.out.println(convertCel + " Celsius");
    } else {
      System.out.println("Please enter F to convert to C, or C to convert to F: ");
      converter();
    }
  }

}
