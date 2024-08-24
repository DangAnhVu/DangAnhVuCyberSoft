import java.util.Random;
import java.util.Scanner;

public class TinhTrungBinhCongCacSoNguyenTo {

	final static Scanner sc = new Scanner(System.in);
	final static Random rd = new Random(); 
	
	public static void main(String[] args) {
		int n=NhapN();
		int[] a = new int[n];
		NhapMang(a);
		XuatMangint(a);
		System.out.println("\nTrung bình cộng của các số nguyên tố trong mảng là: "+TinhKetQua(a));
	}
	
	public static int NhapN() {
		int n;
		do {
			System.out.println("Nhap n : ");
			n = sc.nextInt();
		} while (n<2);
		return n;
	}
	
	public static void NhapMang(int[] a) {
		for(int i=0; i<a.length; i++) {
			a[i]= rd.nextInt((1000- (-1000) + 1)) + (-1000);
		}
	}
	
	public static void XuatMangint(int[] a) {
		System.out.println("Danh sách các phần tử trong mảng: ");
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i]+"\t");
		}
		System.out.println("");
	}
	
	public static boolean KiemTraSNT(int n) {
		if(n<2) {
			return false;
		}
		for(int i=2; i<Math.sqrt(n);i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}
	
	public static double TinhKetQua(int[] a) {
		double sum=0;
		int count=0;
		System.out.print("Các số nguyên tố trong mảng là:");
		for(int i=0;i<a.length;i++) {
			if(KiemTraSNT(a[i])) {
				System.out.print(a[i]+"\t");
				sum+=a[i];
				count+=1;
			}
		}
		if(count==0) {
			return 0;
		}
		double result = sum/count;
		return result;
	}

}
