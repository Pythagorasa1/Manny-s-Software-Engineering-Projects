//package demo;

//import static com.mtsystems.coot.NativeInformation.dataAddress;

import Container;
import IntContainer;
import String8;
import TypeInfo;

public class bubbleSortString {
	public static void bubbleSort(String arr, int n) {
		IntContainer temp;
		for(int i = 0; i < n - 1; i++) {
			for(int j = 0; j < n - i - 1; j++) {
				if(dataAddress(arr.get(j)) > dataAddress(arr.get(j + 1))) {
					/* swapping */
					temp = IntContainer.from(arr.get(j));
					arr.set(j, arr.get(j + 1));
					arr.set(j + 1, String8.from(temp));
				}
			}
		}
	}

	public static void printArray(String arr, int size) {
		for(int i = 0; i < size; i++) {
			System.out.print(((int)dataAddress(arr.get(i))) + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
        String arr[] = {64, 34, 25, 12, 22, 11, 90}
        //(new String(){}, 64), (new String(){}, 34), (new String8(){}, 11), (new String(){}, 90));
		//int n = (int)arr.size();
		bubbleSort((new String(){}, arr), n);
		System.out.println("Sorted array: ");
		printArray((new String(){}, arr), n);
	}
}