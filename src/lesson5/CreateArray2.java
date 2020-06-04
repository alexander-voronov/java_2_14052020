package lesson5;

public class CreateArray2 {


    static void array() {

        final int size = 10000000;
        final int h = size / 2;
        float[] arr = new float[size];


        for (int i = 0; i < size; i++) {
            arr[i] = 1.0f;
        }


        float[] arr1 = new float[h];
        float[] arr2 = new float[h];
        System.arraycopy(arr, 0, arr1, 0, h);
        System.arraycopy(arr, h, arr2, 0, h);


        long a = System.currentTimeMillis();

        Thread t1 = new Thread(new Runnable() {
            @Override
            public synchronized void run() {
                for (int i = 0; i < h; i++) {
                    arr1[i] = (float) (arr1[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
                }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public synchronized void run() {
                for (int i = 0; i < h; i++) {
                    arr2[i] = (float) (arr2[i] * Math.sin(0.2f + (h + i) / 5) * Math.cos(0.2f + (h + i) / 5) * Math.cos(0.4f + (h + i) / 2));
                }
            }
        }
        );

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.arraycopy(arr1, 0, arr, 0, h);
        System.arraycopy(arr2, 0, arr, h, h);

        System.currentTimeMillis();

        System.out.println(System.currentTimeMillis() - a);


    }
}
