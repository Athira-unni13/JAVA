import java.lang.*;
class rectangle{
	int length,breadth;
	int area(){
		return length*breadth;
	}
	int perimeter(){
		return 2*length*breadth;
	}
}

class myclass{
	public static void main(String args[]){
		rectangle R1 = new rectangle();
		R1.length = 4;
		R1.breadth = 6;
		System.out.println(R1.area());
		System.out.println(R1.perimeter());
	}
}