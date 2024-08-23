interface member{
  public void callback();
}

class store
{
  member mem[] = new member[10];
  int count = 0;
  void register(member m){
    mem[count++]=m;
  }
  void invitesale(){
    for(int i=0;i<count;i++){
      mem[i].callback();
    }
  }
}
class coustomer implements member{
  String name;
  coustomer(String n){
    name = n;
  }
  public void callback(){
    System.out.println("i will visit "+name);
  }
}


public class Interfaceexap {
  public static void main(String[] args) {
    store s =new store();
    coustomer c1 = new coustomer("john");
    coustomer c2 = new coustomer("jane");
    s.register(c1);
    s.register(c2);
    s.invitesale();
  }
}
