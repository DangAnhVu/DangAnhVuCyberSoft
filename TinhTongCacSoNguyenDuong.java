import java.util.Random;
import java.util.Scanner;

public class TinhTongCacSoNguyenDuong {

	final static Scanner sc = new Scanner(System.in);
	final static Random rd = new Random();
	
	public static void main(String[] args) {
		int n=NhapN();
		int[] a = new int[n];
		NhapMang(a, n);
		XuatMangint(a, n);
		System.out.println("Tổng các số trong mảng có giá trị lớn hơn 0 là:"+ Sum(a, n));
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
	
	public static int Sum(int[] a, int n) {
		int sum =0;
		for (int value : a) {
			if(value>0) {
				sum+=value;
			}
		}
		return sum;
	}

}
