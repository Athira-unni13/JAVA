import java.lang.*;
class cylinder{
	double radius,height,lidarea,surfaceArea;
	double lidarea(){
		lidarea = 2*Math.PI*radius*height;
		return lidarea;
	}
	double totalSurfaceArea(){
		surfaceArea =  lidarea + 2*Math.PI*radius*radius;
		return surfaceArea;
	}
	double volume(){
		return Math.PI*radius*radius*height;
	}
}
class myclass1{
	public static void main(String args[]){
		cylinder C1 = new cylinder();
		C1.radius = 2;
		C1.height = 4;
		System.out.println(C1.lidarea());
		System.out.println(C1.totalSurfaceArea());
		System.out.println(C1.volume());
	}
}