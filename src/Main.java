import java.util.Scanner;

public class Main {

    private static int Clesius;

    public static void main(String[] args) {

        double result = sum(2, 3);
        System.out.println(reuslt * 2);
        System.out.println("Rezultatul este:" + sum(3, 5));

    }


    public static void sum(int firstNumber, double secondNumber) {
        double x = firstNumber / secondNumber;
        return x;


    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float timeSeconds;
        float mps, kph, mph;

        System.out.println("Input distance in meters: ");
        float distance = scanner.nextFloat();

        System.out.println("Input hours: ");
        flaot hr = scanner.nextFloat();

        System.out.print("Input minutes: ");
        float min = scanner.nextFloat();

        System.out.print("Input seconds: ");
        float sec = scanner.nextFloat();

        timeSeconds = (hr * 3600) + (min * 60) + sec;
        mps = distance / timeSeconds;
        kph = (distance / 1000.0f) / (timeSeconds / 3600.0f);
        mph = kph / 1.609f;

        System.out.println("Your speed in meters/second is " + mps);
        System.out.println("Your speed in km/h is " + kph);
        System.out.println("Your speed in miles/h is " + mph);


        scanner.close();

    }

}








