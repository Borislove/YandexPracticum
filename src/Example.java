public class Example {
    public static void main(String[] args) {

        String genre = "fantasy";
        int rating = 4;
        int pages = 500;

            int epicFantasyPages = 1000;
        if (genre.equals("fantasy")) {
            if (rating >= 4) {
                if (pages > epicFantasyPages) {
                    System.out.println("Вам подойдёт серия книг о фэнтези автора М.");
                } else {
                    System.out.println("Рекомендуется к прочтению фэнтези автора Т.");
                }
            } else {
                // При обращении здесь к переменной epicFantasyPages получим ошибку
                System.out.println(epicFantasyPages);
                System.out.println("Рекомендуется к прочтению лёгкое фэнтези из серии К.");
            }
        } else if (genre.equals("mystery")) {
            // При обращении здесь к переменной epicFantasyPages получим ошибку
            System.out.println(epicFantasyPages);
            if (rating >= 4) {
                // При обращении здесь к переменной epicFantasyPages получим ошибку
                System.out.println(epicFantasyPages);
                System.out.println("Рекомендуется к прочтению мистический детектив автора П.");
            } else {
                System.out.println("Рекомендуется к прочтению лёгкий детектив писательницы Д.");
            }
        } else {
            System.out.println("Рекомендуется к прочтению книга из другого жанра.");
        }
    }
}
