//Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий новый массив,
//каждый элемент которого равен частному элементов двух входящих массивов в той же ячейке.
//Если длины массивов не равны, необходимо как-то оповестить пользователя.
//Важно: При выполнении метода единственное исключение, которое пользователь может увидеть - RuntimeException, т.е. ваше.

import java.util.Random;

public class NewArray {
    public static void main(String[] args) {
        int[] firstArray = getFilledArray(5);
        int[] secondArray = getFilledArray(5);

        int[] divArray = divArrays(firstArray, secondArray);
        printArray(divArray);

        int[] badArray = divArrays(null, secondArray);
    }

    public static int[] divArrays(int[] firstArray, int[] secondArray) {
        if (firstArray == null || secondArray == null) throw new RuntimeException("No arrays");
        if(firstArray.length != secondArray.length) throw new RuntimeException("Different length of arrays");


        int[] resultArr = new int[firstArray.length];
        for (int i = 0; i < resultArr.length; i++) {
            resultArr[i] = firstArray[i]/secondArray[i];
        }
        return resultArr;
    }

    public static int[] getFilledArray(int length){
        int[] array = new int[length];
        Random rnd = new Random();
        for (int i = 0; i < length; i++) {
            array[i] = rnd.nextInt(1,20);
        }
        return array;
    }

    public static void printArray(int[] array){
        for (int number: array){
            System.out.println(number);
        }
    }
}