// 2) Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл.

package Lesson2.Homework;

import java.util.Arrays;
import java.util.logging.Logger;


public class task2 {
    private static Logger log = Logger.getLogger(task2.class.getName());
    public static void main(String[] args) {
        int [] array = {5, 2, 4, 3, 1};
        boolean sort = false;
        int n;
        

        while(!sort) {
            sort = true;
            for (int i = 0; i < array.length-1; i++) {
                if(array[i] > array[i+1]){
                    sort = false;
                    n = array[i];
                    array[i] = array[i+1];
                    array[i+1] = n;

                    System.out.println(Arrays.toString(array));
                    log.info("Sorting record");
                }
            }
        }
    }   
}

