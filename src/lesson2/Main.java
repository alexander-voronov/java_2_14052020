package lesson2;

public class Main {
    public static void main(String[] args) throws MyArraySizeException {


        String[][] words = {
                {"1", "1", "1", "1"},
                {"1", "1", "1"},
                {"1", "1"},
                {"1"}
        };


        if (words.length > 4) {
            throw new MyArraySizeException("Массив другого размера", words.length);
        }

        for (int i = 0; i < 3; i++) {
            if (words[i].length > 4){
                throw new MyArraySizeException("Массив другого размера", words[i].length);
        }

    }

        int sum = 0;

        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words[i].length; j++) {
                int x = Integer.parseInt(words[i][j]);
                if (x != Integer.parseInt(words[i][j]))
                {throw new MyArrayDataException("Неверные данные", words.length);}
                sum += x;
            }
        }
        System.out.println(sum);


    }
}
