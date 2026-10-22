import java.util.Locale;
import java.util.Scanner;

public class Task2 {

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        int size = ArrayHelper.readSize(scanner, "k");
        double[] x = ArrayHelper.readDoubleArray(scanner, "x", size);

        ArrayHelper.printArray("x", x);

        int lastPositiveIndex = -1;
        for (int i = 0; i < size; i++)
        {
            if (x[i] > 0)
            {
                lastPositiveIndex = i;
            }
        }

        if (lastPositiveIndex == -1)
        {
            System.out.println("Положительных элементов нет, замена не выполняется");
        }
        else
        {
            double lastPositive = x[lastPositiveIndex];
            System.out.println("Последний положительный элемент: x(" + lastPositiveIndex + ")=" + lastPositive);

            for (int i = 0; i < size; i += 2)
            {
                if (x[i] % 2 == 0)
                {
                    x[i] = lastPositive;
                }
            }
            ArrayHelper.printArray("x", x);
        }

        int newSize = 0;
        for (int i = 0; i < size; i++)
        {
            if (x[i] % 1 == 0)
            {
                newSize++;
            }
        }

        double[] y = new double[newSize];
        int j = 0;
        for (int i = 0; i < size; i++)
        {
            if (x[i] % 1 == 0)
            {
                y[j] = x[i];
                j++;
            }
        }

        if (newSize == 0)
        {
            System.out.println("После удаления массив пуст");
        }
        else
        {
            ArrayHelper.printArray("y", y);
        }
    }
}
