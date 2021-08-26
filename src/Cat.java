public class Cat {
    private String name;
    private int appetite;
    private boolean fullness;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.fullness = false;
    }

    public void eat(Plate myPlate) {
        if (myPlate.hasEnoughFoodFor(appetite) && !fullness) {
            System.out.println(name + " ест");
            myPlate.decreaseFood(appetite);
            fullness = true;
        } else if (!myPlate.hasEnoughFoodFor(appetite)) {
            System.out.println(name + " хочет еще кушать");
        } else if (fullness) {
            System.out.println(name + " уже не хочет кушать");
        }
    }
}