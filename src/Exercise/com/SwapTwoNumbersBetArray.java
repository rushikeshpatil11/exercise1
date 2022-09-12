package Exercise.com;

import java.util.Arrays;

public class SwapTwoNumbersBetArray {

	public static void swapNumber(int number1, int number2, int arr[]) {
		int p1 = -1;
		int p2 = -1;

		for (int i = 0; i < arr.length; i++)
		{
			if (arr[i] == number1)
			{
				p1 = i;
			}
			if (arr[i] == number2)
			{
				p2 = i;
			}
		}
		if (p1 != -1 && p2 != -1) 
		{
			int temp = arr[p1];
			arr[p1] = arr[p2];
			arr[p2] = temp;
			System.out.println(Arrays.toString(arr));

		} else
		{
			System.out.println("Elements are not found");
		}
	}

	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50, 60 };
//	int position1=arr[2]; 
//	int position2=arr[4]; 

		swapNumber(50, 10, arr);
	}

}
