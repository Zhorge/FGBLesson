public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public void decreaseFood(int appetite) {
        if (hasEnoughFoodFor(appetite)) {
            food -= appetite;
        } else {
            System.out.println("Еды в тарелке меньше, чем требуется.");
        }
    }

    public boolean hasEnoughFoodFor(int appetite) {
        return appetite < food;
    }

    public void increaseFood(int countOfFood) {
        System.out.println("В тарелку насыпали еды: + " + countOfFood);
        food += countOfFood;
    }

    public void info() {
        System.out.println("plate: " + food);
    }
}
