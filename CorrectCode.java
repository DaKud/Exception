// Если необходимо, исправьте данный код (задание 2 https://docs.google.com/document/d/17EaA1lDxzD5YigQ5OAal60fOFKVoCbEJqooB9XfhT7w/edit)


// Дан следующий код, исправьте его там, где требуется (задание 3 https://docs.google.com/document/d/17EaA1lDxzD5YigQ5OAal60fOFKVoCbEJqooB9XfhT7w/edit)
public class CorrectCode {
    public static void main(String[] args) {
        foo1();
        try {
            int a = 90;
            int b = 3;
            System.out.println(a / b);
            printSum(23, 234);
            int[] abc = { 1, 2};
            abc[3] = 9;
        } catch (NullPointerException ex) {
            System.out.println("Couldn't be null");
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Array is OUT of its length");
        } catch (Throwable ex) {
            System.out.println("Fail");
        }

    }
    public static void printSum(Integer a, Integer b){
        System.out.println(a + b);
    }


    // Если необходимо, исправьте данный код (задание 2 https://docs.google.com/document/d/17EaA1lDxzD5YigQ5OAal60fOFKVoCbEJqooB9XfhT7w/edit)
    public static void foo1(){
        try {
            int[] intArray = {1,2,3,4,5,6,7,8,9};
            int d = 0;
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        }

    }

}