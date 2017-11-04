package bookcore.ch6.staticinner;

public class StaticInnerClassTest {

    public static void main(String[] args) {

        double[] d = new double[20];
        for (int i = 0; i < d.length; i++) d[i] = 100 * Math.random();

        ArrayAlg.Pair p = ArrayAlg.minmax(d);
        System.out.println("min = " + p.getFirst());
        System.out.println("max = " + p.getSecond());


        for (double aD : d) {
            System.out.println(aD);
        }
    }

}
     class ArrayAlg {

        static class Pair {
            private double first;
            private double second;

            Pair(double f, double s) {
                first = f;
                second = s;
            }

            double getFirst() {
                return first;
            }

            double getSecond() {
                return second;
            }


        }
        static ArrayAlg.Pair minmax(double[] values) {
            double min = Double.POSITIVE_INFINITY;
            double max = Double.NEGATIVE_INFINITY;
            for (double v : values) {
                if ( min > v) min = v;
                if ( max < v) max = v;
            }
            return new ArrayAlg.Pair(min, max);
        }
    }



