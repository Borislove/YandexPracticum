public class AlarmCLock {
    public static void main(String[] args) {
        int hours = 6;
        int startMinutes = 30;
        int endMinutes = 55;
        int step = 5;

        /* составьте цикл, проходящий от startMinutes до endMinutes
           с шагом в 5 переменную итерирования можно назвать minutes */
        for (int i = startMinutes; i <= endMinutes;) {
            // Выведите на экран
            System.out.println("Время " + hours + ":" + i + "!" + " Пора вставать!");
            i+=step;
        }
    }
}
