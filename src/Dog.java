public class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }

    public void run(int lengh) {
        if (lengh > 500) {
            System.out.println(name + " не может пробежать более 500 м");
        } else {
            System.out.println(name + " пробежал " + lengh + " м");
        }
    }

    public void swim(int lengh){
        if (lengh > 10) {
            System.out.println(name + " не может проплыть более 10 м");
        } else {
            System.out.println(name + " проплыл " + lengh + " м");
        }
    }
}
