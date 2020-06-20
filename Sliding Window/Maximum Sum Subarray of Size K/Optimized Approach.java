class MaxSumSubArrayOfSizeK {
  public static int findMaxSumSubArray(int k, int[] arr) {
    int max=Integer.MIN_VALUE;
    int i,j=0;
    int sum=0;
    for(i=0;i<arr.length;i++)
    {
      sum+=arr[i];
      if(i>=k-1)
      {
        if(sum>max)
        {
          max=sum;
        }
        sum-=arr[j];
        j++;
      }
    }
    return max;
    
  }
}
