package lesson5;

public class CreateArray1 {

    static void array() {

        final int size = 10000000;
        //final int h = size / 2;
        float[] arr = new float[size];

        for (int i = 0; i < size; i++) {
            arr[i] = 1.0f;
        }

        long a = System.currentTimeMillis();

        for (int i = 0; i < size; i++) {
            arr[i] = (float) (arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }

        System.currentTimeMillis();

        System.out.println(System.currentTimeMillis() - a);
    }
}
