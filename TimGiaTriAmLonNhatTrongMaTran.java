import java.util.Random;
import java.util.Scanner;

public class TimGiaTriAmLonNhatTrongMaTran {

	final static Scanner sc = new Scanner(System.in);
	final static Random rd = new Random();

	public static void main(String[] args) {
		int[][] a = new int[100][100];
		int m = NhapM();
		int n = NhapN();
		NhapMaTran(a, m, n);
		XuatMaTran(a, m, n);
		TimGiaTriAmLonNhat(a, m, n);
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

	public static void TimGiaTriAmLonNhat(int[][] a, int m, int n) {
		int soAmDauTien = 0;
		int vitriM = -1;
		int vitriN = -1;
		boolean flag =false;
		outLoop :
			for(int i=0;i<m;i++) {
				for(int j=0;j<n;j++) {
					if(a[i][j]<0) {
						flag = true;
						soAmDauTien = a[i][j];
						vitriM = i;
						vitriN = j;
						break outLoop;
					}
				}
			}
		int max = soAmDauTien;
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				if(a[i][j] <0  && a[i][j] > max) {
					max = a[i][j];
					vitriM = i;
					vitriN = j;
				}
			}
		}
		if(!flag) {
			System.out.println("Không có số âm trong ma trận");
		}
		else {
			System.out.println("Giá trị âm lớn nhất là: " + max + "["+vitriM+"]["+vitriN+"]");
		}
	}
}
