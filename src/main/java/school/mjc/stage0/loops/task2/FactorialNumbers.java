package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {
        int p = 1;
        for (int i = 0; i <= printToInclusive; i++) {
            for (int j = 1; j <= i; j++) {
                p *= j;
            }
            System.out.println(p);
            p = 1;
        }

    }
}
