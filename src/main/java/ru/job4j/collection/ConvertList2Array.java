package ru.job4j.collection;

import java.util.List;

public class ConvertList2Array {

    public static int[][] toArray(List<Integer> list, int cells) {
        int group = (int) Math.ceil((double) list.size() / cells);
        //Метод сeil принимает тип double, поэтому нам нужно делимое привести к типу double, чтобы результат деления был double.
        //С другой стороны метод ceil возвращает тип double, а нам нужен тип int, поэтому и приводим его к типу int после вычисления
        int[][] array = new int[group][cells];
        int row = 0;
        int cell = 0;
        for (Integer number : list) {
            if (cell > cells - 1) {
                cell = 0;
                row++;
            }
            array[row][cell] = number;
            cell++;
        }
        return array;
    }

    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7);
        int[][] result = toArray(list, 3);
        for (int[] row : result) {
            for (int cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
    }
}
