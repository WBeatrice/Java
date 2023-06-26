// 2) Вывести все простые числа от 1 до 1000

package Homework;

public class task2 {
    public static void main(String[] args) {
        int m = 1000;
        for (int i = 2; i <= m; i++) {
            for (int j = 2; j <= i; j++) {
                if (j < i  & i % j == 0) {
                    break;
                }

                if (i % j == 0) {
                    System.out.printf("%d ", i);
                }
            }
        }
    }
    
}
