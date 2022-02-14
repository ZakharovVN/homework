/**
 * java1. HomeWorkTwo
 *
 * @author ZakharovVladimir
 * @version 14.02.2022
 */
public class HomeWorkTwo {
    public static void main(String[] args) {
        System.out.println(taskOne(5, 5));
        taskTwo(0);
        System.out.println(taskThree(3));
        taskFour("hello", 2);

    }

    static boolean taskOne(int a, int b) {
        int sum = a + b;
        if (sum >= 10 && sum <= 20) {
            return true;

        } else {
            return false;
        }

    }

    static void taskTwo(int i) {
        if (i >= 0) {
            System.out.println("Число положительное: " + i);
        } else {
            System.out.println("Число отрицательное: " + i);
        }
    }

    static boolean taskThree(int x) {
        if (x <= 0) {
            return true;
        }
        return false;
    }

    static void taskFour(String str, int num) {
        for (int i = 0; i < num; i++) {
            System.out.println(str);
        }
    }


}