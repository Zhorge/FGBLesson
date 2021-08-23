public abstract class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    public abstract void run(int lengh);

    public abstract void swim(int lengh);
}
