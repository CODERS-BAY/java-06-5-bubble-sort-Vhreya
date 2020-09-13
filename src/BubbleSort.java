import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {

        int[] numbers = {15, 5, 10, 2, 30, 13, 28, 36, 1, 55, 14};

        for (int j = numbers.length; j >= 0; j--) {

            for (int i = 1; i < j; i++) {
                if (numbers[i - 1] > numbers[i]) {
                    int temp = numbers[i];
                    numbers[i] = numbers[i - 1];
                    numbers[i - 1] = temp;

                    System.out.println(Arrays.toString(numbers));
                }
            }
        }
    }
}
