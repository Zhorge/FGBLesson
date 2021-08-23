public class Cat extends Animal {

    public Cat(String name) {
        super(name);
    }

    public void run(int lengh) {
        if (lengh > 200) {
            System.out.println(name + " не может пробежать более 200 м");
        } else {
            System.out.println(name + " пробежал " + lengh + " м");
        }
    }

    public void swim(int lengh){
        System.out.println(name + " не умеет плавать");
    }

}
