class descen{
  public static void main(String args[]) {
    int temp=0;
    int arr[] = { -1,-3,-4,1, 3, 4, 5, 6, 7, 4, 3, 1, 3, 4 };
    for(int i=0;i<arr.length;i++){
      for (int j=i+1;j<arr.length;j++){
        if(arr[i]<arr[j]){
          temp=arr[i];
          arr[i]=arr[j];
          arr[j]=temp;
        }
     }
  }
    for(int i=0;i<arr.length;i++){
      System.out.print(" "+arr[i]);
    }
  }
}