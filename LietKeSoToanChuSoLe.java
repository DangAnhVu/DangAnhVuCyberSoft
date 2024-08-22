import java.util.Random;
import java.util.Scanner;

public class LietKeSoToanChuSoLe {

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
			a[i]= rd.nextInt((1000 - (-1000) + 1)) + (-1000);
		}
	}
	
	public static void XuatMangint(int[] a, int n) {
		System.out.println("Danh sách các phần tử trong mảng: ");
		for(int i=0; i<n; i++) {
			System.out.print(a[i]+"\t");
		}
		System.out.println("");
	}
	
	public static boolean KiemTraChuSoLe(int n) {
		while(n!=0) {
			n = Math.abs(n);
			int du = n%10;
			if(du%2==0) {
				return false;
			}
			n = n/10;
		}
		return true;
	}
	
	public static void LietKe(int[] a, int n) {
		System.out.println("Danh sách các giá trị toàn số lẻ");
		for(int i=0;i<n;i++) {
			if(KiemTraChuSoLe(a[i])) {
				System.out.print(a[i]+"\t");
			}
		}
	}

}
