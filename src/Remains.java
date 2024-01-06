public class Remains {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i % 3 == 0) { // проверяем остаток от деления на 3
                System.out.println(i + " делится на 3"); // если он равен нулю
            } else {
                System.out.println(i + " не делится на 3"); // если не равен нулю
            }
        }
    }
}

