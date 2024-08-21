import java.util.Scanner;

public class LietKeLuyThua3 {

	final static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		int n = Nhapn();
		int[] a = new int[n];
		NhapMang(a, n);
		XuatMangint(a, n);
	}
	
	public static int Nhapn() {
		System.out.println("Nhap n: ");
		return sc.nextInt();
	}
	
	public static void NhapMang(int[] a, int n) {
		for(int i=0; i<n; i++) {
			System.out.print("a["+i+"] = ");
			a[i]=sc.nextInt();
		}
	}
	
	public static boolean isPowerOfThree(int num) {
        if (num < 3) {
            return false;
        }
        while (num % 3 == 0) {
            num /= 3;
        }
        return num==1;
    }
	
	public static void Kiemtra(int[] a, int n) {
		boolean found = false;
        System.out.println("Các giá trị trong mảng có dạng 3^k là:");
        for (int i = 0; i < n; i++) {
            if (isPowerOfThree(a[i])) {
                System.out.print(a[i] + " ");
                found = true;
            }
        }
        if (!found) {
            System.out.println("Không có giá trị nào trong mảng có dạng 3^k.");
        }
	}
	
	public static void XuatMangint(int[] a, int n) {
		for(int i=0; i<n; i++) {
			System.out.println("a["+i+"] = "+a[i]);
		}
		Kiemtra(a, n);
	}

}
