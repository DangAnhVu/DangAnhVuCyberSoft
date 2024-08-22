import java.util.Scanner;

public class LietKeCapGiaTriGanNhauNhat {

	final static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		int n=NhapN();
		int[] a = new int[n];
		NhapMang(a, n);
		XuatMangint(a, n);
		Sort(a, n);
		LietKe(a, n);
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
	
	public static void Sort(int[] a, int n) {
		for(int i=0;i<n-1;i++) {
			for(int j=i+1;j<n;j++) {
				if(a[i]>a[j]) {
					int temp = a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
	}
	
	public static int Min_Minus(int[] a, int n) {
		int min_minus = a[1]-a[0] ;
		for(int i=1;i<n-1;i++) {
			int minus = a[i+1] - a[i];
			if(min_minus>minus) {
				min_minus = minus;
			}
		}
		return min_minus;
	}
	
	public static void LietKe(int[] a, int n) {
		for(int i=0;i<n-1;i++) {
			if(a[i+1] - a[i] == Min_Minus(a, n)) {
				System.out.print("("+a[i]+","+a[i+1]+")\t");
			}
		}
	}

}
