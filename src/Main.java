import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int[] array = new int[]{1, 2, 3};
        double[] a = {1.57, 7.654, 9.986};
        int[] b = new int[5];
    }

    public static void task2() {
        System.out.println("Задача 2");
        int[] array = new int[]{1, 2, 3};
        for (int i = 0; i < array.length; i++) {
            if (i != array.length - 1) {
                System.out.print(array[i] + ", ");
            } else {
                System.out.print(array[i]);
            }
        }
        System.out.println();
        double[] a = {1.57, 7.654, 9.986};
        for (int i = 0; i < a.length; i++) {
            if (i != a.length - 1) {
                System.out.print(a[i] + ", ");
            } else {
                System.out.print(a[i]);
            }
        }
        System.out.println();
        int[] b = new int[5];
        for (int i = 0; i < b.length; i++) {
            if (i != b.length - 1) {
                System.out.print(b[i] + ", ");
            } else {
                System.out.print(b[i]);
            }
        }
        System.out.println();
    }

    public static void task3() {
        System.out.println("Задача 3");
        int[] array = new int[]{1, 2, 3};
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        double[] a = {1.57, 7.654, 9.986};
        for (int i = a.length - 1; i >= 0; i--) {
            System.out.print(a[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        int[] b = new int[5];
        for (int i = b.length - 1; i >= 0; i--) {
            System.out.print(b[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }

    public static void task4() {
        System.out.println("Задача 4");
        int[] array = new int[]{1, 2, 3};
        for (int i = 0; i < array.length; i++) {
            if (array[i]%2==1){
                array[i] += 1;
            }
        }
        System.out.println(Arrays.toString(array));


    }
}







