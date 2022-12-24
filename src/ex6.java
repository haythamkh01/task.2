import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a quadratic equation seems like this , ax^2+bx+c=0 ");
        String equation = scanner.nextLine();

        checkEquation(equation);


    }

    public static void checkEquation(String equation) {

        String x2 = "x^2";
        String theSecondX = "x+";
        String theSecondX1 = "x-";
        String equal0 = "=0";
        boolean isTrueEquation = false;
        if (equation.contains(x2) && equation.contains(equal0) && (equation.contains(theSecondX1) || equation.contains(theSecondX))) {
            isTrueEquation = true;
        }
        if (isTrueEquation) {
            quadraticEquation(equation);
        } else {

            System.out.println(" The quadratic equation is not true ");
        }

    }

    public static int getA(String equation) {
        String a;

        a = equation.substring(0, equation.indexOf("x^2"));
        if (a.equals("-")) {
            a = "-1";
        } else if (a.equals("")) {
            a = "1";
        }
        int A = Integer.parseInt(a);

        return A;
    }

    public static int getB(String equation) {
        int indexOfx2 = equation.indexOf("x^2");
        indexOfx2 += 3;
        String b = "";
        for (int i = indexOfx2; i < equation.length(); i++) {
            char currentChar = equation.charAt(i);
            if (currentChar != 'x') {
                b = b + currentChar;
            } else {
                break;
            }
        }
        if (b.equals("-")) {
            b = "-1";
        } else if (b.equals("+")) {
            b = "1";

        }
        int B = Integer.parseInt(b);


        return B;

    }

    public static int getC(String equation) {
        int indexOfx2 = equation.indexOf("=0");

        String c = "";
        int indexX = 0;
        for (int i = indexOfx2 - 1; i > 0; i--) {
            char currentChar = equation.charAt(i);

            if (currentChar == 'x') {
                indexX = i;
                break;

            }

        }
        indexX++;
        c = equation.substring(indexX, equation.indexOf("=0"));

        int C = Integer.parseInt(c);


        return C;


    }

    public static void quadraticEquation(String equation) {
        int a = getA(equation);
        int b = getB(equation);
        int c = getC(equation);

        if ((b * b) - 4 * a * c < 0 || a == 0) {
            System.out.println("There is no solution");
        } else {
            double x1 = ((-b + Math.sqrt((b * b) - 4 * a * c)) / (2 * a));
            double x2 = ((-b - Math.sqrt((b * b) - 4 * a * c)) / (2 * a));
            if (x1 == x2) {
                System.out.println(" There is one solution: \n x1=" + x1);
            } else {
                System.out.println(" There is two solution: \n x1=" + x1 + "\n x2= " + x2);
            }

        }

    }
}

