// Задание
// Пусть дан произвольный список целых чисел.
// Нужно удалить из него чётные числа


package Lesson3.Homework;

import java.util.ArrayList;
import java.util.List;

public class task2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
    
        for (int o : list) {
            if (list.get(o) % 2 != 0){
                System.out.println(o);
            }
        }
    }
}
