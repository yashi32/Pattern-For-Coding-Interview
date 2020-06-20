class MaxSumSubArrayOfSizeK {
  public static int findMaxSumSubArray(int k, int[] arr) {
    // TODO: Write your code here
    int sum=0;
    int j=0;
    int max=Integer.MIN_VALUE;
    
    for(int i=0;i<arr.length-k+1;i++)
    {
        sum=0;
        for(j=i;j<k+i;j++)
        {
          sum+=arr[j];
        }
        if(sum>max)
        {
          max=sum;
        }
    }
    return max;
  }
}
