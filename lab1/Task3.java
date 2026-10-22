import java.util.Scanner;

public class Task3 {

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int n = ArrayHelper.readSize(scanner, "n");
        int[] x = ArrayHelper.readArray(scanner, "x", n);
        int k = ArrayHelper.readSize(scanner, "k");
        int[] y = ArrayHelper.readArray(scanner, "y", k);

        ArrayHelper.printArray("x", x);
        ArrayHelper.printArray("y", y);

        int m = 0;
        for (int i = 0; i < n; i++)
        {
            if (x[i] % 2 == 0)
            {
                m++;
            }
        }
        for (int i = 0; i < k; i++)
        {
            if (y[i] % 2 != 0)
            {
                m++;
            }
        }

        int[] z = new int[m];
        int p = 0;
        for (int i = 0; i < n; i++)
        {
            if (x[i] % 2 == 0)
            {
                z[p] = x[i];
                p++;
            }
        }
        for (int i = 0; i < k; i++)
        {
            if (y[i] % 2 != 0)
            {
                z[p] = y[i];
                p++;
            }
        }

        if (m == 0)
        {
            System.out.println("Новый массив z пуст");
        }
        else
        {
            ArrayHelper.printArray("z", z);
        }

        for (int i = 0; i < k - 1; i++)
        {
            for (int j = 0; j < k - 1 - i; j++)
            {
                if (y[j] < y[j + 1])
                {
                    int t = y[j];
                    y[j] = y[j + 1];
                    y[j + 1] = t;
                }
            }
        }
        ArrayHelper.printArray("y", y);
    }
}
