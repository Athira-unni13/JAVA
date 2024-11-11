//Write a program to find and print all duplicate characters in a string.

public class duplicate{
	public static void main(String args[]){
		String str = "madam";
		char[] charArray = str.toCharArray();
    boolean[] counted = new boolean[charArray.length];
    System.out.println("Duplicate charachters:");
		for(int i = 0; i< charArray.length; i++){
      if(counted[i]) continue;
			for(int j = i+1; j < charArray.length; j++){
				if(charArray[i] == charArray[j]){
          counted[j] = true;
				}
			}
      System.out.println(charArray[i]);
		}
	}
}
