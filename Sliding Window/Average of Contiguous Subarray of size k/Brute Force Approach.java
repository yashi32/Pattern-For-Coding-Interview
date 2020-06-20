public class AvgContigiousSubarray {
	
	public static float[] brute_force(int[]arr,int k)
	{
		float[] result=new float[arr.length-k+1];
		float sum;
		for(int i=0;i<arr.length-k+1;i++)
		{
			sum=0;
			for(int j=i;j<k+i;j++)
			{
				sum+=arr[j];
			}
			result[i]=sum/k;
			
			
		}
		return result;
	}
	

	public static void main(String[] args) {
		
		int[] arr= {1, 3, 2, 6, -1, 4, 1, 8, 2};
		int k=5;
		float[] result= brute_force(arr,k);
		System.out.println(Arrays.toString(result));

	}

}
