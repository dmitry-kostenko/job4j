package ru.job4j.array;

public class SortSelected {
    public static int[] sort(int[] data) {
        for (int i = 0; i != data.length - 1; i++) {
            int min = MinDiaposon.findMin(data, i, data.length - 1);
            int index = FindLoop.indexOf(data, min, i, data.length - 1);
            int temp = data[index];
            data[index] = data[i];
            data[i] = temp;
        }
        return data;
    }
}
