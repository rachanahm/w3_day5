 class sumrows {
	
	public static void main(String[] args) {
		
		int i, j, sum;	
	
		int arr[][] = { { 1, 2, 3 }, { 4, 5, 6 } };
	
		
		for(i = 0;  i < arr.length; i++)
		{
      sum=0;
			for(j = 0; j < arr[i].length; j++)
			{
				sum = sum + arr[i][j];
			}
			System.out.println("\nThe Sum of   " + i +  "row " + sum);
		}
	}
}