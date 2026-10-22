import java.util.Locale;
import java.util.Scanner;

public class Task2 {

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        int size = ArrayHelper.readSize(scanner, "k");
        double[] x = ArrayHelper.readDoubleArray(scanner, "x", size);

        ArrayHelper.printArray("x", x);

        int lastPositiveIndex = findLastPositiveIndex(x);
        if (lastPositiveIndex == -1)
        {
            System.out.println("Положительных элементов нет, замена не выполняется");
        }
        else
        {
            double lastPositive = x[lastPositiveIndex];
            System.out.println("Последний положительный элемент: x(" + lastPositiveIndex + ")=" + lastPositive);
            replaceEvenValuesAtEvenPositions(x, lastPositive);
            ArrayHelper.printArray("x", x);
        }

        x = removeFractional(x);
        if (x.length == 0)
        {
            System.out.println("После удаления массив пуст");
        }
        else
        {
            ArrayHelper.printArray("x", x);
        }
    }

    public static int findLastPositiveIndex(double[] array)
    {
        for (int i = array.length - 1; i >= 0; i--)
        {
            if (array[i] > 0)
            {
                return i;
            }
        }
        return -1;
    }

    public static void replaceEvenValuesAtEvenPositions(double[] array, double value)
    {
        for (int i = 0; i < array.length; i += 2)
        {
            if (array[i] % 2 == 0)
            {
                array[i] = value;
            }
        }
    }

    public static double[] removeFractional(double[] array)
    {
        int newSize = 0;
        for (int i = 0; i < array.length; i++)
        {
            if (array[i] % 1 == 0)
            {
                newSize++;
            }
        }

        double[] result = new double[newSize];
        int index = 0;
        for (int i = 0; i < array.length; i++)
        {
            if (array[i] % 1 == 0)
            {
                result[index] = array[i];
                index++;
            }
        }
        return result;
    }
}
