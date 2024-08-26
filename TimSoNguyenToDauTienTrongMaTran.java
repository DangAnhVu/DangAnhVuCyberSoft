import java.util.Random;
import java.util.Scanner;

public class TimSoNguyenToDauTienTrongMaTran {

	final static Scanner sc = new Scanner(System.in);
	final static Random rd = new Random();

	public static void main(String[] args) {
		int[][] a = new int[100][100];
		int m = NhapM();
		int n = NhapN();
		NhapMaTran(a, m, n);
		XuatMaTran(a, m, n);
		TimSoNguyenToDauTien(a, m, n);
	}
	
	public static int NhapM() {
		System.out.println("Nhập số dòng:");
		return sc.nextInt();
	}
	
	
	public static int NhapN() {
		System.out.println("Nhập số cột:");
		return sc.nextInt();
	}
	
	public static void NhapMaTran(int[][] a, int m, int n) {
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {	
				a[i][j]= rd.nextInt((50 - (-50) + 1)) + (-50);
			}
		}
	}
	
	public static void XuatMaTran(int[][] a, int m, int n) {
		System.out.println("Xuất ma trận:");
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(a[i][j]+"\t");
			}
			System.out.println();
		}
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
	
	public static void TimSoNguyenToDauTien(int[][] a, int m, int n) {
		boolean flag =true;
		outLoop :
			for(int i=0;i<m;i++) {
				for(int j=0;j<n;j++) {
					if(KiemTraSNT(a[i][j])) {
						flag = false;
						System.out.println("Số nguyên tố đầu tiên trong ma trận là: "+a[i][j] + "["+i+"]["+j+"]");
						break outLoop;
					}
				}
			}
		if(flag) {
			System.out.println("Ma trận không có số nguyên tố");
		}
	}

}
