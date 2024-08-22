import java.util.Random;
import java.util.Scanner;

public class LietKeCacGiaTriCoChuSoChanDauTien {

	final static Scanner sc = new Scanner(System.in);
	final static Random rd = new Random();
	
	public static void main(String[] args) {
		int n=NhapN();
		int[] a = new int[n];
		NhapMang(a, n);
		XuatMangint(a, n);
		LietKe(a);
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
	
	public static boolean KiemTraChuSoDauTienLaSoChan(int n) {
		String strNum = String.valueOf(Math.abs(n));
		char chuSoDau = strNum.charAt(0);
		int soDau = Character.getNumericValue(chuSoDau);
		return soDau % 2 == 0;
	}
	
	public static void LietKe(int[] a) {
		System.out.println("Danh sách các giá trị có số chẵn đầu:");
		for (int value : a) {
			if(KiemTraChuSoDauTienLaSoChan(value))
				System.out.print(value+"\t");
		}
	}

}
