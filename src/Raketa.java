public class Raketa {
    public static void main(String[] args) {
        int secondsBeforeStart = 70; // Секунды до старта, цикл должен начинаться с этого значения

        // Место для цикла
        for(int i = secondsBeforeStart; i >=0; i-=7){
            System.out.println("До старта SpaceY осталось "+i);
        }
        System.out.println("Поехали! Узнаем, есть ли жизнь на Марсе!");
    }
}
