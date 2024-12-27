import java.util.*;
public class  TemperatureConverter{
    //logics for temperature conversion.
public static double convertCelsiusToFahrenheit(double celsius) {
    return (celsius * 9/5) + 32;
}
public static double convertFahrenheitToCelsius(double fahrenheit) {
    return (fahrenheit - 32) * 5/9;
}
    public static void main(String[] args) {
        //to accept temperature input
        Scanner sc= new Scanner(System.in);
            System.out.println("Temperature Converter");
            System.out.println("OPTION 1: Convert Celsius(C) to Fahrenheit(F)");
            System.out.println("OPTION 2:Convert Fahrenheit(F) to Celsius(C)");
            System.out.println("OPTION 3: Exit from the program");
            System.out.print("Choose an option in between 1 to 3: ");
            //  allowing user to choose the conversion direction
            int option= sc.nextInt();
            switch (option) {
                case 1:
                    System.out.print("Enter temperature in Celsius(C): ");
                    double celsius = sc.nextDouble();
                    double fahrenheitFromCelsius = convertCelsiusToFahrenheit(celsius);
                    System.out.printf("%.2f Celsius is %.2f Fahrenheit%n", celsius, fahrenheitFromCelsius);
                    break;
                case 2:
                    System.out.print("Enter temperature in Fahrenheit(F): ");
                    double fahrenheit = sc.nextDouble();
                    double celsiusFromFahrenheit = convertFahrenheitToCelsius(fahrenheit);
                    System.out.printf("%.2f Fahrenheit is %.2f Celsius%n", fahrenheit, celsiusFromFahrenheit);
                    break;
                case 3:
                    System.out.println("Exiting the program!");
                    break;
                default:
                    System.out.println("Invalid option. Please choose option 1, 2 or 3.");
            }
}
}