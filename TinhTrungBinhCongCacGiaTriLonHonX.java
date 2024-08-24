import java.util.Random;
import java.util.Scanner;

public class TinhTrungBinhCongCacGiaTriLonHonX {

	final static Scanner sc = new Scanner(System.in);
	final static Random rd = new Random(); 
	
	public static void main(String[] args) {
		int n=NhapN();
		int[] a = new int[n];
		NhapMang(a);
		XuatMangint(a);
		TinhTrungBinh(a);
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
	
	public static void TinhTrungBinh(int[] a) {
		int x;
		System.out.println("Nhập vào giá trị x: ");
		x=sc.nextInt();
		double sum=0;
		double count=0;
		for(int i=0;i<a.length;i++) {
			if(a[i] > x) {
				sum+=a[i];
				count+=1;
			}
		}
		if(count == 0) {
			System.out.println("Trung bình cộng của các giá trị lớn hơn "+x+" là 0");
		}
		else {
			System.out.println("Trung bình cộng của các giá trị lớn hơn "+x+" là "+sum/count);
		}
	}

}
