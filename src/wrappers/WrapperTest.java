package wrappers;

public class WrapperTest {

    public static void main(String[] args) {


        Integer i1 = 10;
        Integer i2 = Integer.valueOf(10);
        Integer i3 = new Integer(10);
        Integer i4 = Integer.parseInt("10");

        Double d1 = 10.5;
        byte b1 = 1;
        short s1 = 13;
        int i5 = 28;
        float f1 = 32;
        long l1 = 1234;

        byte b2 = d1.byteValue();
        short s2 = d1.shortValue();
        int i6 = d1.intValue();
        float f2 = d1.floatValue();
        long l2 = d1.longValue();

        Double d2 = 0.0;
        Double d3 = 1.5;
        Double nanValue = d3 / d2;
        Double infinityValue = d2 / d2;
        System.out.println(nanValue);
        System.out.println(infinityValue);

        if (nanValue == Double.NaN) {
            System.out.println("Переменная nanValue = NaN");
        }

        if (Double.isInfinite(nanValue)) {
            System.out.println("Переменная nanValue = Infinity");
        }

        if (infinityValue == Double.NaN) {
            System.out.println("Переменная infinityValue = NaN");
        }

        if (Double.isInfinite(infinityValue)) {
            System.out.println("Переменная infinityValue = Infinity");
        }

        Long l4 = Long.valueOf(120);
        Long l5 = Long.valueOf(120);

        System.out.println((l4 == l5));

         l4 = Long.valueOf(1200);
         l5 = Long.valueOf(1200);

        System.out.println((l4 == l5));

    }


}
