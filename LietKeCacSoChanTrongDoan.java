import java.util.Random;
import java.util.Scanner;

public class LietKeCacSoChanTrongDoan {

	final static Scanner sc = new Scanner(System.in);
	final static Random rd = new Random(); 
	
	public static void main(String[] args) {
		int n=NhapN();
		int[] a = new int[n];
		NhapMang(a, n);
		XuatMangint(a, n);
		LietKe(a, n);
	}
	
	public static int NhapN() {
		int n;
		do {
			System.out.println("Nhap n : ");
			n = sc.nextInt();
		} while (n<2);
		return n;
	}
	
	public static void NhapMang(int[] a, int n) {
		for(int i=0; i<n; i++) {
			a[i]= rd.nextInt((100 - (-100) + 1)) + (-100);
		}
	}
	
	public static void XuatMangint(int[] a, int n) {
		System.out.println("Danh sách các phần tử trong mảng: ");
		for(int i=0; i<n; i++) {
			System.out.print(a[i]+"\t");
		}
		System.out.println("");
	}
	
	public static void LietKe(int[] a, int n) {
		int x, y;
		System.out.println("Vui lòng nhập vào đoạn [x,y]:");
		do {
			System.out.print("x= ");
			x = sc.nextInt();
		} while (x<-100);
		do {
			System.out.print("y= ");
			y = sc.nextInt();
		} while (y>100);
		for(int i=0;i<n;i++) {
			if(a[i]>= x && a[i]<=y) {
				System.out.print(a[i]+"\t");
			}
		}
	}

}
