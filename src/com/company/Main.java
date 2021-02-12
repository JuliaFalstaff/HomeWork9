package com.company;

public class Main {
    public static void main(String[] args) {
//        String[][] arrTest = {{"7","2","1","2"}, {"3","5","2","4"}, {"8","0","7","6"}}; //неверный размер
//        String[][] arrTest = {{"5","1","3","N"}, {"7","2","1","2"}, {"3","5","2","4"}, {"8","0","7","6"}}; // символ в строке
        String[][] arrTest = {{"5","1","3","7"}, {"7","2","1","2"}, {"3","5","2","4"}, {"8","0","7","6"}};

        try {
            twoDimArray(arrTest);
        } catch (MyArraySizeException e) {
            System.out.println(e.getMessage());
        } catch (MyArrayDataException e2) {
            System.out.println(e2.getMessage());
        }
    }


    // Задание 1
    public static void twoDimArray(String[][] arr) throws MyArraySizeException, MyArrayDataException {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr.length != 4 || arr[i].length != 4) {
                    throw new MyArraySizeException("Исключение: Массив не соответствует размерности 4х4");
                }

//                Задание 2
                try {
                    int newArr = Integer.parseInt(arr[i][j]);
                    sum += newArr;
                    System.out.println(sum);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("Исключение: неверные данные лежат в ячейке arr[" + i +  "][" + j+"] и не подлежат преобразованию в int");
                }
            }
        }
    }
}






