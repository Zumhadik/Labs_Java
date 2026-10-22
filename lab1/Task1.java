import java.util.Scanner;

public class Task1 {

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int size = ArrayHelper.readSize(scanner, "n");
        int[] x = ArrayHelper.readArray(scanner, "x", size);

        ArrayHelper.printArray("x", x);

        boolean found = false;
        System.out.println("Элементы, которые делятся на 5 без остатка:");
        for (int i = 0; i < size; i++)
        {
            if (x[i] % 5 == 0)
            {
                System.out.println("x(" + i + ")=" + x[i]);
                found = true;
            }
        }
        if (!found)
        {
            System.out.println("Таких элементов нет");
        }

        int positiveCount = 0;
        for (int i = 0; i < size; i++)
        {
            if (x[i] > 0)
            {
                positiveCount++;
            }
        }
        System.out.println("Количество положительных элементов: " + positiveCount);
    }
}
