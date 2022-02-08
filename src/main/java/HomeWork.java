public class HomeWork {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }

    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");

    }
    public static void checkSumSign() {
        int a = 5, b = 5;
        if (a + b >= 0){
            System.out.println("Сумма положительная");
        }
        if (a + b <= 0) {
            System.out.println("Сумма отрицательная");
        }
    }
    public static void printColor(){
        int value = 10000;
        if (value <= 0){
            System.out.println("красный");
        }
        if (value > 0 && value <= 100){
            System.out.println("Желтый");
        }
        if (value > 100){
            System.out.println("Зеленый");
        }
    }
    public static void compareNumbers(){
        int a = 1, b = 2;
        System.out.println(a >= b? "a >= b" : "a < b");

    }
}