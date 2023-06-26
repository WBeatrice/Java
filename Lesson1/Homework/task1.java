// Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)

package Homework;
import java.util.Scanner;
public class task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a number to calculate the amount: ");
        int number_sum = in.nextInt();
        int count_sum = 0;
        int i_sum = 0;
        
        while(count_sum <= number_sum){
            i_sum += count_sum;
            count_sum ++;
        }
        System.out.printf("sum: %d\n", i_sum);
        
        System.out.print("Enter a number to calculate the product: ");
        int number_p = in.nextInt();
        int count_p = 1;
        int i_p = 1;
        
        while (count_p <= number_p){
            i_p *= count_p;
            count_p ++;
        }     
        System.out.printf("n!: %d\n", i_p); 
    }
}
