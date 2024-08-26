import java.util.Random;
import java.util.Scanner;

public class TimSoDuongDauTienTrongMaTran {
	
	final static Scanner sc = new Scanner(System.in);
	final static Random rd = new Random();

	public static void main(String[] args) {
		int[][] a = new int[100][100];
		int m = NhapM();
		int n = NhapN();
		NhapMaTran(a, m, n);
		XuatMaTran(a, m, n);
		TimSoChanDauTien(a, m, n);
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
		System.out.println("Nhập ma trận:");
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
	
	public static void TimSoChanDauTien(int[][] a, int m, int n) {
		outLoop :
			for(int i=0;i<m;i++) {
				for(int j=0;j<n;j++) {
					if(a[i][j] > 0) {
						System.out.println("Số dương đầu tiên trong mảng 2 chiều là: "+a[i][j]+"["+i+"]["+j+"]");
						break outLoop;
					}
				}
			}
	}
}
