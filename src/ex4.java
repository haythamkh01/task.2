import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {


            int a[]=new int [8];
            Scanner scanner =new Scanner(System.in);
            System.out.println("Enter 8 numbers in an a array elements :");
for (int j=0;j<8;j++){
    a[j]=scanner.nextInt();
}
                int max = a[0];
                int index = 0;

                for (int i = 0; i < a.length; i++)
                {
                    if (max < a[i])
                    {
                        max = a[i];
                        index = i;
                    }
                }
                if (a[index]>max){
                    max=a[index];
                }
                System.out.println("Max element :"+ max);
                System.out.println("Index position of Maximum value in an array is  :  " + index);
            }
        }







