//Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.

package Lesson3.Homework;

import java.util.ArrayList;
import java.util.List;

public class task3 {
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

        int min = list.get(0);
        int max = list.get(0);
        int average = 0;
        int sum = 0;

        for (int o: list){
            if(o < min){
                min = o;
            }
            if(o > max){
                max = o;
            }

            sum += o;
            average = sum/list.size();
        }
        System.out.println("Maximum number from the list: " + max);
        System.out.println("Minimum number from the list: " + min);
        System.out.println("The average number from the list: " + average);
    }
}
