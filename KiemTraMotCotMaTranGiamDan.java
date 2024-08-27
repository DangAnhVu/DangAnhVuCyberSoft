import java.util.Random;
import java.util.Scanner;


public class KiemTraMotCotMaTranGiamDan {

	final static Scanner sc = new Scanner(System.in);
	final static Random rd = new Random();

	public static void main(String[] args) {
		int[][] a = new int[100][100];
		int m = NhapM();
		int n = NhapN();
		NhapMaTran(a, m, n);
		XuatMaTran(a, m, n);
		KiemTraCotMaTran(a, m, n);
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
	
	public static void KiemTraCotBatKiTangDan(int[][] a, int m, int cot) {
		boolean flag =true;
		outLoop :
			for(int i=0;i<m-1;i++) {
				if(a[i][cot] < a[i+1][cot]) {
					flag = false;
					break outLoop;
				}
			}
		if(flag) {
			System.out.println("Cột "+cot+" là cột giảm dần");
		}
		else {
			System.out.println("Cột "+cot+" không phải là cột giảm dần");
		}
	}
	
	public static void KiemTraCotMaTran(int[][] a, int m, int n) {
		int cot;
		//Kiếm tra điều kiện nhập của cột muốn kiểm tra
		do {
			System.out.println("Nhập vào vị trí cột bạn muốn kiểm tra từ 0 đến "+(n-1)+" :");
			cot = sc.nextInt();
			if(cot>n-1 || cot<0) {
				System.out.println("Vui lòng nhập lại vị trí muốn kiểm tra");
			}
		} while (cot>n-1 || cot<0);
		//Kiểm tra điều kiện dừng chương trình
		int tieptuc;
		do {
			KiemTraCotBatKiTangDan(a, m, cot);
			System.out.println("Bạn có muốn kiểm tra tiếp không? Nhấn khác 0 để tiếp tục");
			tieptuc = sc.nextInt();
			if(tieptuc!=0) {
				do {
					System.out.println("Nhập vào vị trí cột bạn muốn kiểm tra từ 0 đến "+(n-1)+" :");
					cot = sc.nextInt();
					if(cot>n-1 || cot<0) {
						System.out.println("Vui lòng nhập lại vị trí muốn kiểm tra");
					}
				} while (cot>n-1 || cot<0);
			}
		} while (tieptuc!=0);
	}
	
	
}
