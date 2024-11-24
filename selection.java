public class selection {
 public static void main(String[] args) {
  int[] arr = {7,8,3,1,2};
  int n = arr.length;
  int smallest;

  //selection sort

  for(int i = 0; i<n; i++){
    smallest = i;
    for(int j = i+1; j<n; j++){
      if(arr[j] < arr[smallest]){
        smallest = j;
      }
      }
      int temp = arr[i];
      arr[i] = arr[smallest];
      arr[smallest] = temp;
  }
  for(int i = 0; i <n;i++){
    System.out.print(arr[i]+" ");
  }
 } 
}
