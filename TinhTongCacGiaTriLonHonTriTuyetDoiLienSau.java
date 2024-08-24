import java.util.Random;
import java.util.Scanner;

public class TinhTongCacGiaTriLonHonTriTuyetDoiLienSau {

	final static Scanner sc = new Scanner(System.in);
	final static Random rd = new Random(); 
	
	public static void main(String[] args) {
		int n=NhapN();
		int[] a = new int[n];
		NhapMang(a);
		XuatMangint(a);
		System.out.println("Tổng các giá trị có giá trị lớn hơn trị tuyệt đối của giá trị đứng sau liền kề là:");
		System.out.println("Tổng = "+ TinhTong(a));
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
	
	public static boolean  SoSanhTriTuyetDoi(int a, int b) {
		if(a>Math.abs(b)) {
			return true;
		}
		return false;
	}
	
	public static int TinhTong(int[] a) {
		int sum=0;
		for(int i=0;i<a.length-1;i++) {
			if(SoSanhTriTuyetDoi(a[i], a[i+1])) {
				sum+=a[i];
			}
		}
		return sum;
	}

}
