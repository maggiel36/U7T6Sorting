import java.util.Arrays;

public class SortTester
{
  public static void main(String[] args)
  {
    /* --- SELECTION SORT --- */
    int[] arr1 = {200, 90, 89, 85, 80, 74, 62, 20, 16, 13, 10, 5, 0, -10, -35, -43, -51, -56, -62};
    Sort.selectionSort(arr1);
    System.out.println(Arrays.toString(arr1));
 
    /* --- INSERTION SORT --- */ 
    int[] arr2 = {200, 90, 89, 85, 80, 74, 62, 20, 16, 13, 10, 5, 0, -10, -35, -43, -51, -56, -62};
    Sort.insertionSort(arr2);
    System.out.println(Arrays.toString(arr2));
  }
}