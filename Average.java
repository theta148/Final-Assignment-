import java.util.Scanner;

public class Average
{
    Scanner console = new Scanner(System.in);
    private int[] data;// Holds the scores
    private double mean;// The mean of the scores

    public Average()
    {
        this.data = new int[5];
        for (int i = 0; i < data.length; i++)
        {
            System.out.print("Enter score number " + (i + 1) + ": ");
            data[i] = console.nextInt();
            console.nextLine();
        }

    }
    public void calculateMean()
    {
        double sum = 0;
            for (int i = 0; i < data.length; i++)
            {
                sum += data[i];
            }
        this.mean = sum / 5;
    }
    @Override
    public String toString()
    {
        this.data = new data[5];
        String scores;
        String str1 = "The scores: ";
        StringBuilder str2 = new StringBuilder();
        for (int i = 0; i < 5; i++) {
            str2.append(Integer.toString(data[i])).append(" ");
        }
        String str3 = "\nThe mean: ";

        return str1 + str2 + str3;
    }
    public static void selectionSort()
    {
        int[] array = new int[5];
        int n = array.length;

        for (int i = 0; i < n - 1; i++) {
            // Find the index of the largest element
            int maxIndex = i;

            for (int j = i + 1; j < n; j++) {
                if (array[j] > array[maxIndex]) {
                    maxIndex = j;
                }
            }

            // Swap the largest element with the first element of the unsorted part
            int temp = array[maxIndex];
            array[maxIndex] = array[i];
            array[i] = temp;
        }
    }
}
