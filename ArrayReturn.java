
//write a method which takes array sorts and returns array
public class ArrayReturn {
	public static void main(String[] args) {
		double arr[] = {23,12,43,11,27,16};
		
		sortArray(arr);
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}
	
	//23,12,54,42
	
	static double[] sortArray(double[] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					double tmp = 0;
					
					tmp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = tmp;
				}
			}
		}
		
		return arr;
	}
}
