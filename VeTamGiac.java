import java.util.Scanner;

public class VeTamGiac {
	
	final static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int n=0;
		n = NhapChieuCao(n);
		VeTamGiacCanDac(n);
		VeTamGiacCanRong(n);
	}
	
	public static int NhapChieuCao(int n) {
		System.out.println("Nhập vào chiều cao của tam giác: ");
		n = sc.nextInt();
		return n;
	}
	
	public static void VeTamGiacCanDac(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = n - i; j > 0; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
	}
	
	public static void VeTamGiacCanRong(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = n - i; j > 0; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                if (k == 1 || k == 2 * i - 1 || i == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
	}

}
