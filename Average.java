import java.util.Scanner;

public class Average
{
    Scanner console = new Scanner(System.in);
    private final int[] data;// Holds the scores
    private double mean;// The mean of the scores

    public Average()
    {
        data = new int[5];
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
        this.mean = sum;
    }
    @Override
    public String toString()
    {
        System.out.printf("The scores: %s", selectionSort(int[] data));
        System.out.printf("The mean: %.2f", data.clone());
    }
    public void selectionSort(int[] array)
    {
        int n = array.length;

        for (int i = 0; i < n - 1; i++) {
            // Assume the maximum element is at index i
            int maxIndex = i;

            // Find the actual maximum element in the unsorted part of the array
            for (int j = i + 1; j < n; j++) {
                if (array[j] > array[maxIndex]) {
                    maxIndex = j;
                }
            }

            // Swap the found maximum element with the first element of the unsorted part
            if (maxIndex != i) {
                int temp = array[i];
                array[i] = array[maxIndex];
                array[maxIndex] = temp;
            }
        }
    }
}
