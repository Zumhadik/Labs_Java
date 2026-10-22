import java.util.Scanner;

public class ArrayHelper {

    public static int readInt(Scanner scanner, String name)
    {
        System.out.print(name + "=");
        while (!scanner.hasNextInt())
        {
            System.out.println("Ошибка: нужно ввести целое число");
            scanner.next();
            System.out.print(name + "=");
        }
        return scanner.nextInt();
    }

    public static double readDouble(Scanner scanner, String name)
    {
        System.out.print(name + "=");
        while (!scanner.hasNextDouble())
        {
            System.out.println("Ошибка: нужно ввести число (дробную часть через точку)");
            scanner.next();
            System.out.print(name + "=");
        }
        return scanner.nextDouble();
    }

    public static int readSize(Scanner scanner, String name)
    {
        int size = readInt(scanner, name);
        while (size < 1)
        {
            System.out.println("Ошибка: размер массива должен быть больше нуля");
            size = readInt(scanner, name);
        }
        return size;
    }

    public static int[] readArray(Scanner scanner, String name, int size)
    {
        int[] array = new int[size];
        for (int i = 0; i < size; i++)
        {
            array[i] = readInt(scanner, name + "(" + i + ")");
        }
        return array;
    }

    public static double[] readDoubleArray(Scanner scanner, String name, int size)
    {
        double[] array = new double[size];
        for (int i = 0; i < size; i++)
        {
            array[i] = readDouble(scanner, name + "(" + i + ")");
        }
        return array;
    }

    public static void printArray(String name, int[] array)
    {
        System.out.print("Массив " + name + ": ");
        for (int i = 0; i < array.length; i++)
        {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void printArray(String name, double[] array)
    {
        System.out.print("Массив " + name + ": ");
        for (int i = 0; i < array.length; i++)
        {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
