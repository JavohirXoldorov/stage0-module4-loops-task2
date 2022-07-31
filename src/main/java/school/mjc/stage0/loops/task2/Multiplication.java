package school.mjc.stage0.loops.task2;

public class Multiplication {
    public void printMultiplied(int multiplyByAndToInclusive) {
        int sign = 1;
        if (multiplyByAndToInclusive < 0) sign = -1;
        for (int i = 0; i <= multiplyByAndToInclusive * sign && multiplyByAndToInclusive != 0; i++) {
            System.out.println(i * multiplyByAndToInclusive);
        }
    }
}
