//Write a program to find the frequency of each character in a string.
public class frequency{
	public static void main(String args[]){
		String str = "madam";
		int count = 0;
		char[] charArray = str.toCharArray();
    boolean[] counted = new boolean[charArray.length];
		for(int i = 0; i< charArray.length; i++){
      if(counted[i]) continue;
      count = 1;
			for(int j = i+1; j < charArray.length; j++){
				if(charArray[i] == charArray[j]){
					count++;
          counted[j] = true;
				}
			}
      System.out.println("Count of "+ charArray[i]+" is: " + count);
		}
	}
}
