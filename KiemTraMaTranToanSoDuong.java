import java.util.Random;
import java.util.Scanner;

public class KiemTraMaTranToanSoDuong {

	final static Scanner sc = new Scanner(System.in);
	final static Random rd = new Random();

	public static void main(String[] args) {
		int[][] a = new int[100][100];
		int m = NhapM();
		int n = NhapN();
		NhapMaTran(a, m, n);
		XuatMaTran(a, m, n);
		KiemTraToanSoDuong(a, m, n);
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
				System.out.print("a["+i+"]["+j+"] = ");
				a[i][j] = sc.nextInt();
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
	
	public static void KiemTraToanSoDuong(int a[][], int m, int n) {
		boolean flag = false;
		outLoop :
			for(int i=0;i<m;i++) {
				for(int j=0;j<n;j++) {
					if(a[i][j] < 0) {
						flag = true;
						break outLoop;
					}
				}
			}
		if(flag) {
			System.out.println("Ma trận tồn tại số âm");
		}
		else {
			System.out.println("Ma trận là ma trận toàn dương");
		}
	}

}
