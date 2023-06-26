/*На вход принимаем 3 числа от пользователя, нужно найти максимальное, минимальное и лишнее */

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        int[] nums = new int[3];
        int x = 0;
        int max = 0;
        int min = 0;
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < nums.length; i++){
            x = in.nextInt();
            nums[i] = x;
        }
        System.out.println(nums);
//Доделать сортировку 
        for(int i = x; i < nums.length; i++){
            if (nums[i] > x){
                max = nums[i];
                System.out.println(max);
            }
            if (nums[i] < x){
                min = nums[i];
                System.out.println(min);
            }
        }
    }
            
}
