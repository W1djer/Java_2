import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class home2_2 {
    public static void main(String[] args) {
        int[] array = {1, 123, 12, 99, 4, 2, 25, 88, 38, 5, 22};
        sortBubble(array);
        System.out.println(Arrays.toString(array));
    }
    public static int[] sortBubble(int[] array) {
        int temp;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
            writeLog(array);
        }
        return array;
    }

    public static void writeLog(int[] array) {
        try (FileWriter writer = new FileWriter("log.txt", true)) {
            for (int i = 0; i < array.length; i++) {
                writer.write(array[i] + " ");
            }
            writer.write("\n");
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}