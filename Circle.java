import java.io.*;

class Circle {
	public static void main(String[] args){
		int r = 0;
		try{
			BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter radius of Circle : ");
			r = Integer.parseInt(br1.readLine());
			double area = java.lang.Math.PI*r*r;
			System.out.println("Area of Circle : "+area);
			double perimeter = 2*java.lang.Math.PI*r;
			System.out.println("Perimeter of Circle :" +perimeter);
			double diameter = r*2;
			System.out.println("Diameter of Circle :" + diameter);
		}
		catch(Exception e){
			System.out.println("Error : "+e);
		}
	}
}
