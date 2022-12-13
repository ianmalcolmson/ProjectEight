package net.codejava;

public class MergeSort {
	public static void mergeSort(int[] arr, int start, int end)	{
	int mid = 0;
	if(start < end)	{
		mid = (start + end) / 2;
	//divides arrays into left and right
		mergeSort(arr, start, mid);
		mergeSort(arr, mid + 1, end);

	//merging
		merging(arr, start, mid, end);	}
	}

	public static void merging(int[] arr, int start, int mid, int end)	{
		int[] result = new int[arr.length];
		int posLeft = start;
		int posRight = mid + 1;
		int count = 0;

	//when left array is not empty and right array is also not empty
	while(posLeft <= mid && posRight <= end)	{
		if(result[posLeft] <= arr[posRight])	{
			result[count] = arr[posLeft];
			posLeft++;
		}
		else	{
			result[count] = arr[posRight];
			posRight++;	}
			count++;	
	}

	//when left array is empty, but right array is not empty
	while(posLeft > mid && posRight <= end)	{
		result[count] = arr[posRight];
		posRight++;
		count++;	
	}

	//when left array is not empty, but right array is empty
	while(posLeft <= mid && posRight > end)	{
		result[count] = arr[posLeft];
		posLeft++;
		count++;
	}

	for(int i = 0; i < end - start + 1; i++)	{
		arr[start + i] = result[i];
	}
}

}
