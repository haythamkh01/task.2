public class Main {
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);

        double[] numbers = new double[10];
        double sum = 0;

        System.out.print("Enter 10 numbers: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextDouble();
            sum += numbers[i];
        }

        double average = sum / numbers.length;
        for (int i = 0; i < numbers.length; i++)
            if (numbers[i] > average)
               System.out.println(+numbers[i]);
               System.out.println("All numbers above the average ..DONE.");


    }
}