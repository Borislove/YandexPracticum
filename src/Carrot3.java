public class Carrot3 {
    public static void main(String[] args) {

        int weight = 750; // объявили переменную веса Байта и присвоили ей значение
        if (weight < 800) { // цикл сработает, только если вес Байта меньше 800 грамм
            for (int i = 1; i < 6; i = i + 1) {
                System.out.println("Байт съел " + i + "-ю морковку");
            }
        } else {
            System.out.println("Разгрузочный день. Пьём водичку, крутим колесо!");
        }
    }
}
