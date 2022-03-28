public class Main2 {

    static int memberVariable = 3;


    public static void main(String[] args) {

        double result = sum(memberVariable, 3.2);
        System.out.println(result * 2);
        System.out.println("Rezultatul este: " + sum(3, 5));

        int result2 = substract(5,4);
        System.out.println(result2);

        System.out.println(result - result2);



    }

    public static double sum(int firstNumber, double secondNumber) {
        return firstNumber + secondNumber;
    }

    public static int substract(int firstNumber, int secondNumber){
        int result = firstNumber - secondNumber;
        return result;
    }


}




}
