package Runtime;

public class Babylion extends Animal {
    void eat() {
        System.out.println("uống sữa");
    }

    public static void main(String args[]) {
        Animal b1, b2, b3;
        b1 = new Animal();
        b2 = new Lion();
        b3 = new Babylion();
        b1.eat();
        b2.eat();
        b3.eat();
    }
}
