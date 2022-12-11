// Реализуйте 3 метода, чтобы в каждом из них получить разные исключения

public class ThreeMethods {
    public static void main(String[] args) {
        System.out.println("ThreeMethods");
        try {
            int a = method1(10);
            System.out.println(a);
        } catch (Exception e) {
            System.out.println("Fail");
        }
        try {
            method2(8);
            System.out.println("Done");
        } catch (Exception e) {
            System.out.println("no such a position in array");
        }
        try {
            method3(11);

        } catch (Exception e) {
            System.out.println("Exscess");
        }
    }

    public static int method1(int b) throws Exception {
        if (b < 10) {
            b = b + 1;
        } else {
            throw new Exception();
        }
        return b;
    }

    public static void method2(int b) throws Exception {
        int[] mass1 = new int[5];
        mass1[b] = 0;
    }

    public static void method3(int c) throws Exception {
        int[] mass1 = new int[c];
        if (mass1.length < 10) {
            System.out.println("Alright");
        } else {
            throw new Exception();
        }
    }
}