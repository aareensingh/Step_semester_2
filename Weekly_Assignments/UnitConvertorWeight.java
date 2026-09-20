import java.util.Scanner;

class UnitConvertorWeight {
    public static double convertFahrenheitToCelsius(double fahrenheit) {
        double fahrenheit2celsius = (fahrenheit - 32) * 5 / 9;
        return fahrenheit2celsius;
    }

    public static double convertCelsiusToFahrenheit(double celsius) {
        double celsius2fahrenheit = (celsius * 9 / 5) + 32;
        return celsius2fahrenheit;
    }

    public static double convertPoundsToKilograms(double pounds) {
        double pounds2kilograms = 0.453592;
        return pounds * pounds2kilograms;
    }

    public static double convertKilogramsToPounds(double kilograms) {
        double kilograms2pounds = 2.20462;
        return kilograms * kilograms2pounds;
    }

    public static double convertGallonsToLiters(double gallons) {
        double gallons2liters = 3.78541;
        return gallons * gallons2liters;
    }

    public static double convertLitersToGallons(double liters) {
        double liters2gallons = 0.264172;
        return liters * liters2gallons;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double fahrenheit = input.nextDouble();
        double celsius = input.nextDouble();
        double pounds = input.nextDouble();
        double kilograms = input.nextDouble();
        double gallons = input.nextDouble();
        double liters = input.nextDouble();

        System.out.println("Fahrenheit to Celsius = " + convertFahrenheitToCelsius(fahrenheit));
        System.out.println("Celsius to Fahrenheit = " + convertCelsiusToFahrenheit(celsius));
        System.out.println("Pounds to Kilograms = " + convertPoundsToKilograms(pounds));
        System.out.println("Kilograms to Pounds = " + convertKilogramsToPounds(kilograms));
        System.out.println("Gallons to Liters = " + convertGallonsToLiters(gallons));
        System.out.println("Liters to Gallons = " + convertLitersToGallons(liters));
    }
}
