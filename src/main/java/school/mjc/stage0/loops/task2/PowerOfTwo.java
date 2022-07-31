package school.mjc.stage0.loops.task2;

public class PowerOfTwo {
    public void printPower(int power) {
        if (power < 0) System.out.println("too much power");
        int p = 1;
        for (int i = 0; i <= power; i++) {
            for (int j = 1; j <= i; j++) {
                p *= 2;
            }
            System.out.println(p);
            p = 1;
        }
    }
}
