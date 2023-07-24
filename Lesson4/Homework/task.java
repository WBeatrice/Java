// Даны два Deque, представляющие два целых числа. Цифры хранятся в обратном порядке и каждый из их узлов 
// содержит одну цифру.
// 1) Умножьте два числа и верните произведение в виде связанного списка.
// 2) Сложите два числа и верните сумму в виде связанного списка. Одно или два числа должны 
// быть отрицательными

import java.util.ArrayDeque;
import java.util.Deque;

public class task {
    public static void main(String[] args) {
        Deque<Integer> dequeFirst = new ArrayDeque<>();
        Deque<Integer> dequeSecond = new ArrayDeque<>();
        dequeFirst.add(-4);

        dequeSecond.add(5);

        int dFirst = dequeFirst.getFirst();
        int dSecond = dequeSecond.getFirst();

        int product = ProductNumbers(dFirst, dSecond);
        System.out.println(product);

        int sum = SumNumbers(dFirst, dSecond);
        System.out.println(sum);
    }

    public static int ProductNumbers(int dFirst, int dSecond) {
        int product = dFirst * dSecond;
        return product;
    }

    public static int SumNumbers(int dFirst, int dSecond) {
        int sum = dFirst + dSecond;
        return sum;
    }
}
