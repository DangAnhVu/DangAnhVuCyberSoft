import java.util.Scanner;

public class baitap14 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);float xC, yC, xM, yM, R;
		System.out.println("Nhap vao xC: ");
		xC=sc.nextFloat();
		System.out.println("Nhap vao yC: ");
		yC=sc.nextFloat();
		System.out.println("Nhap vao R: ");
		R=sc.nextFloat();
		System.out.println("Nhap vao xM: ");
		xM=sc.nextFloat();
		System.out.println("Nhap vao yM: ");
		yM=sc.nextFloat();
		
		double x = Math.sqrt(Math.pow(xM, 2)-Math.pow(xC, 2));
		double y = Math.sqrt(Math.pow(yM, 2)-Math.pow(yC, 2));
		double kc=x+y;
		if(kc==R) {
			System.out.println("M nằm trên C()");
		}
		else if(kc>R) {
			System.out.println("M nằm ngoài C()");
		}
		else {
			System.out.println("M nằm trong C()");
		}
	}

}
