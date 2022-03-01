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

    int[] arr3 = {200, 90, 89, 85, 80, 74, 62, 20, 16, 13, 10, 5, 0, -10, -35, -43, -51, -56, -62};
    Arrays.sort(arr3);
    System.out.println(Arrays.toString(arr3));

    int[] arr4 = {-62, -56, -51, -43, -35, -10, 0, 5, 10, 13, 16, 20, 62, 74, 80, 85, 89, 90, 200};
    Sort.selectionSortDescending(arr4);
    System.out.println(Arrays.toString(arr4));

    int[] arr5 = {-62, -56, -51, -43, -35, -10, 0, 5, 10, 13, 16, 20, 62, 74, 80, 85, 89, 90, 200};
    Sort.insertionSortDescending(arr5);
    System.out.println(Arrays.toString(arr5));
  }
}