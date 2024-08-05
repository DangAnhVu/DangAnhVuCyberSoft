import java.util.Scanner;

public class baitap14 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num1, num2, num3, num4, num5;
		System.out.println("Nhap so thu nhat: ");
		num1=sc.nextInt();
		System.out.println("Nhap so thu hai: ");
		num2=sc.nextInt();
		System.out.println("Nhap so thu ba: ");
		num3=sc.nextInt();
		System.out.println("Nhap so thu tu: ");
		num4=sc.nextInt();
		System.out.println("Nhap so thu nam: ");
		num5=sc.nextInt();
		int sum=0;
		sum = sum + num1 + num2 + num3 + num4 + num5;
		float avg =(float)sum/5;
		System.out.println("AVG = "+avg);
	}

}