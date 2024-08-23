import java.util.Random;
import java.util.Scanner;

public class TinhTongCacSo_TongCacChuSoHangChucLa5 {

	final static Scanner sc = new Scanner(System.in);
	final static Random rd = new Random();
	
	public static void main(String[] args) {
		int n=NhapN();
		int[] a = new int[n];
		NhapMang(a, n);
		XuatMangint(a, n);
		System.out.println("Tổng các số có hàng chục bằng 5: "+ TongCacSoCoHangChucBang5(a));
		System.out.println("Tổng các chữ số có hàng chục bằng 5: "+ TongCacChuSoCoHangChucBang5(a));
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
			System.out.print("a["+i+"] = ");
			a[i]=sc.nextInt();
		}
	}
	
	public static void XuatMangint(int[] a, int n) {
		System.out.println("Danh sách các phần tử trong mảng: ");
		for(int i=0; i<n; i++) {
			System.out.print(a[i]+"\t");
		}
		System.out.println("");
	}
	
	public static boolean KiemTraHangChucBang5(int n) {
		String strNum = String.valueOf(n);
		int chiSoHangChuc = strNum.length()-2;
		char chuSoHangChuc = strNum.charAt(chiSoHangChuc);
		int soDau = Character.getNumericValue(chuSoHangChuc);
		if(soDau !=5) {
			return false;
		}
		return true;
	}
	
	public static int TinhTongCacChuSo(int n) {
		String strNum = String.valueOf(n);
		int sum=0;
		for(int i=0;i<strNum.length();i++) {
			char kiTuSo = strNum.charAt(i);
			int chuSo = Character.getNumericValue(kiTuSo);
			sum += chuSo;
		}
		return sum;
	}
	
	public static int TongCacSoCoHangChucBang5(int a[]) {
		int result = 0;
		for(int i : a) {
			if(KiemTraHangChucBang5(i)) {
				result += i;
			}
		}
		return result;
	}
	
	public static int TongCacChuSoCoHangChucBang5(int a[]) {
		int result = 0;
		for(int i : a) {
			if(KiemTraHangChucBang5(i)) {
				result += TinhTongCacChuSo(i);
			}
		}
		return result;
	}

}
