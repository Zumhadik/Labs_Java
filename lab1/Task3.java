import java.util.Scanner;

public class Task3 {

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int xSize = ArrayHelper.readSize(scanner, "n");
        int[] x = ArrayHelper.readArray(scanner, "x", xSize);
        int ySize = ArrayHelper.readSize(scanner, "k");
        int[] y = ArrayHelper.readArray(scanner, "y", ySize);

        ArrayHelper.printArray("x", x);
        ArrayHelper.printArray("y", y);

        int[] z = createFromEvenAndOdd(x, y);
        if (z.length == 0)
        {
            System.out.println("Новый массив z пуст");
        }
        else
        {
            ArrayHelper.printArray("z", z);
        }

        sortDescending(y);
        ArrayHelper.printArray("y", y);
    }

    public static int[] createFromEvenAndOdd(int[] x, int[] y)
    {
        int newSize = 0;
        for (int i = 0; i < x.length; i++)
        {
            if (x[i] % 2 == 0)
            {
                newSize++;
            }
        }
        for (int i = 0; i < y.length; i++)
        {
            if (y[i] % 2 != 0)
            {
                newSize++;
            }
        }

        int[] result = new int[newSize];
        int index = 0;
        for (int i = 0; i < x.length; i++)
        {
            if (x[i] % 2 == 0)
            {
                result[index] = x[i];
                index++;
            }
        }
        for (int i = 0; i < y.length; i++)
        {
            if (y[i] % 2 != 0)
            {
                result[index] = y[i];
                index++;
            }
        }
        return result;
    }

    public static void sortDescending(int[] array)
    {
        for (int i = 0; i < array.length - 1; i++)
        {
            for (int j = 0; j < array.length - 1 - i; j++)
            {
                if (array[j] < array[j + 1])
                {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}
