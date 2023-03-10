import java.util.Scanner;
// Java program for implementation of QuickSort
public class QuickSort_Analysis {
/*
* This function takes last element as pivot, places the pivot element at
* its correct position in sorted array, and places all smaller (smaller
* than pivot) to left of pivot and all greater elements to right of pivot
*/
private int noOfComparisons = 0;
private int noOfSwaps = 0;
private int noOfAssignments = 0;
int partition(int arr[], int low, int high) {
int pivot = arr[high];
int i = (low - 1); // index of smaller element
for (int j = low; j < high; j++) {
// If current element is smaller than or
// equal to pivot
if (arr[j] <= pivot) {
noOfComparisons += 1;
i++;
// swap arr[i] and arr[j]
int temp = arr[i];
arr[i] = arr[j];
arr[j] = temp;
noOfSwaps += 1;
}
}
// swap arr[i+1] and arr[high] (or pivot)
int temp = arr[i + 1];
arr[i + 1] = arr[high];
arr[high] = temp;
noOfSwaps += 1;
return i + 1;
}
/*
* The main function that implements QuickSort() arr[] --> Array to be
* sorted, low --> Starting index, high --> Ending index
*/
void sort(int arr[], int low, int high) {
if (low < high) {
/*
* pi is partitioning index, arr[pi] is now at right place
*/
int pi = partition(arr, low, high);
// Recursively sort elements before
// partition and after partition
sort(arr, low, pi - 1);
noOfAssignments += 1;
sort(arr, pi + 1, high);
noOfAssignments += 1;
}
}
/* A utility function to print array of size n */
static void printArray(int arr[]) {
int n = arr.length;
for (int i = 0; i < n; ++i)
System.out.print(arr[i] + " ");
System.out.println();
}
// Driver program
public static void main(String[] args) {
Scanner sc = new Scanner (System.in);
System.out.println("Enter the number of Elements in the Array to be quick-sorted");
int limit = Integer.parseInt(sc.nextLine());
int identical[] = new int[limit];
int ascend[] = new int[limit];
int descend[] = new int[limit];
// populate identical element array
for(int i=0;i<limit;i++)
identical[i] = 0;
// populate ascending order element array
for(int i=0;i<limit;i++)
ascend[i] = 1 * i;
// populate descending order element array
for(int i=0;i<limit;i++)
descend[i] = -1 * i;
QuickSort_Analysis identicalObj = new QuickSort_Analysis();
identicalObj.sort(identical, 0, limit - 1);
System.out.println("Default Quick-Sorted Array is: ");
printArray(identical);
System.out.println("No of Comparisons : " + identicalObj.noOfComparisons);
System.out.println("No of Swaps : " + identicalObj.noOfSwaps);
System.out.println("No of Assignments : " + identicalObj.noOfAssignments);
QuickSort_Analysis ascendObj = new QuickSort_Analysis();
ascendObj.sort(ascend, 0, limit - 1);
System.out.println("Quick-Sorted Array is: ");
printArray(ascend);
System.out.println("No of Comparisons : " + ascendObj.noOfComparisons);
System.out.println("No of Swaps : " + ascendObj.noOfSwaps);
System.out.println("No of Assignments : " + ascendObj.noOfAssignments);
QuickSort_Analysis descendObj = new QuickSort_Analysis();
descendObj.sort(descend, 0, limit - 1);
System.out.println("Sorted Array is: ");
printArray(descend);
System.out.println("No of Comparisons : " + descendObj.noOfComparisons);
System.out.println("No of Swaps : " + descendObj.noOfSwaps);
System.out.println("No of Assignments : " + descendObj.noOfAssignments);
}
}
