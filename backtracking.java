public class backtracking {
  public static void printpermutation(String str, String per, int idx){
    if(str.length() == 0){
      System.out.println(per);
      return;
    }
    for(int i = 0; i< str.length();i++){
      char currchar = str.charAt(i);
      String newstr = str.substring(0, i) + str.substring(i + 1);
      printpermutation(newstr, per+currchar, idx+1);
    }
  }
  public static void main(String args[]){
    String str ="ABC";
    printpermutation(str, "", 0);
  }
}
