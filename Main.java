import java.util.Scanner;

public class Main {
    static double toFahrenheit(int celsius) {
        double result = celsius * 1.8 + 32;
        return result;
    }
    static double toCelsius(int fahrenheit) {
        double result = (fahrenheit - 32) / 1.8;
        return result;
    }

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("c or f");
        String cOrF = userInput.nextLine();
        if (cOrF.equals("c") || cOrF.equals("f")) {
            System.out.println("enter desired value");
        } else {
            System.out.print("incorrect value");
            return;
        }
        int dValue = userInput.nextInt();
        if (cOrF.equals("c")) {
            System.out.println(toFahrenheit(dValue));
        } else {
            System.out.print(toCelsius(dValue));
        }

        }

    }

