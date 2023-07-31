public class Splender extends Bike {
    void run() {
        System.out.println("đạp xe với tốc độ 13km");
    }

    public static void main(String args[]) {
        Bike t = new Splender();
        t.run();
    }
}
