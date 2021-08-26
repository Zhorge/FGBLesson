public class homeWorkLesson7 {
    public static void main(String[] args) {

        Cat[] cats = {
                new Cat("Плюша", 6),
                new Cat("Баксик", 8),
                new Cat("Мурзик", 15),
        };

        Plate plate = new Plate(25);

        for (Cat cat : cats) {
            cat.eat(plate);
            System.out.println();
            plate.info();
        }

        plate.increaseFood(20);
        plate.info();

        for (Cat cat : cats) {
            cat.eat(plate);
            System.out.println();
            plate.info();
        }
    }
}
