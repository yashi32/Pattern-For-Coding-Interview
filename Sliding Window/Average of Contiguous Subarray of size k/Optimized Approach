public class AvgContigiousSubarray {
	
	public static float[] sliding_window(int[]arr,int k)
	{
		float[] result=new float[arr.length-k+1];
		
		int i=0;
		int j=0;
		float sum=0;
		for(i=0;i<arr.length;i++)
		{
			sum+=arr[i];
			if(i>=k-1)
			{
				result[j]=sum/k;
				sum=sum-arr[j];
				j++;
			}
		}
		return result;
			
	}
	

	public static void main(String[] args) {
		
		int[] arr= {1, 3, 2, 6, -1, 4, 1, 8, 2};
		int k=5;
		float[] result= sliding_window(arr,k);
		System.out.println(Arrays.toString(result));

	}

}
