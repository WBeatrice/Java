//Реалиховать алгоритм сортировки слияния

package Lesson3.Homework;

import java.util.Arrays;

public class task1 {
    public static void main(String[] args) {
        
        int[] array = {3,2,4,1};
        int[] result = SortMerge(array);
        System.out.println(Arrays.toString(result));
    }
    public static int[] SortMerge(int[] array) {
        int[] buffer1 = Arrays.copyOf(array, array.length);
        int[] buffer2 = new int[array.length];
        int[] result = InternalSortMerge(buffer1, buffer2, 0, array.length);
        return result;
    }
    public static int[] InternalSortMerge(int[] buffer1, int[] buffer2,
            int startIndex, int endIndex) {
        if (startIndex >= endIndex - 1) {
            return buffer1;
        }
        int average = startIndex + (endIndex - startIndex) / 2;
        int[] sorted1 = InternalSortMerge(buffer1, buffer2, startIndex, average);
        int[] sorted2 = InternalSortMerge(buffer1, buffer2, average, endIndex);
        int index1 = startIndex;
        int index2 = average;
        int destIndex = startIndex;
        int[] result = sorted1 == buffer1 ? buffer2 : buffer1;
        while (index1 < average && index2 < endIndex) {
            result[destIndex++] = sorted1[index1] < sorted2[index2] ? sorted1[index1++] : sorted2[index2++];
        }
        while (index1 < average) {
            result[destIndex++] = sorted1[index1++];
        }
        while (index2 < endIndex) {
            result[destIndex++] = sorted2[index2++];
        }
        return result;
    }
}
