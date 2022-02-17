/**
 * java1. HomeWorkTwo
 *
 * @author ZakharovVladimir
 * @version 14.02.2022
 */
public class HomeWorkTwo {
    public static void main(String[] args) {
        System.out.println(taskOne(5, 5));
        taskTwo(-2);
        System.out.println(taskThree(3));
        taskFour("hello", 2);

    }

    static boolean taskOne(int a, int b) {
        return a + b >= 10 && a + b <=20;

    }

    static void taskTwo(int i) {
        System.out.println(i >= 0? "Число положительное: " : "Число отрицательное: " +i);
    }

    static boolean taskThree(int x) {
        return x < 0;
    }

    static void taskFour(String str, int num) {
        for (int i = 0; i < num; i++) {
            System.out.println(str);
        }
    }


}