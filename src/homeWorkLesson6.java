public class homeWorkLesson6 {
    public static void main(String[] args) {

        Animal dogBobik = new Dog("Бобик");
        Animal catVasya = new Cat("Вася");
        Animal dogArti = new Dog("Арти");
        Animal dogBonya = new Dog("Боня");
        Animal catSonya = new Cat("Соня");

        Animal[] animals = {dogArti, dogBobik, dogBonya,catVasya, catSonya};

        dogArti.run(300);
        dogBonya.swim(10);
        dogBobik.run(520);
        dogBobik.swim(15);
        System.out.println();

        catVasya.run(150);
        catVasya.swim(20);
        catSonya.run(250);
        catSonya.swim(1);
        System.out.println();

        countAnimals(animals);
    }

    public static void countAnimals(Animal[] animals){
        int cat = 0;
        int dog = 0;

        for (int i = 0; i < animals.length; i++) {

            if (animals[i] instanceof Cat) {
                cat ++;
            } if (animals[i] instanceof Dog) {
                dog ++;
            }
        }

        System.out.println("Кол-во всех животных: " + animals.length);
        System.out.println("Кол-во котов: " + cat);
        System.out.println("Кол-во собак: " + dog);

    }
}
