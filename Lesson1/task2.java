/*Напишите программу, которая выводит на консоль простые числа в промежутке от [2, 100].
Используйте для решения этой задачи оператор "%" (остаток от деления) и циклы. */

public class task2 {
    public static void main(String[] args) {
        for (int i = 2; i <= 100; i++) {
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

//Решение два 
// for (int i = 2; i <= 100; i++) {
//             boolean flag = true;

//             for (int j = 2; j < i; j++) {
//                 if (i % j == 0) {
//                     flag = false;
//                     break;
//                 }
//             }

//             if (flag) {
//                 System.out.println(i);
//             }
//         }

