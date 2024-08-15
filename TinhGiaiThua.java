import java.util.Scanner;

public class TinhGiaiThua {
	
	final static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int n=0;
		n= Nhap(n);
		System.out.println("Giai thừa của "+n+"! là: "+GiaiThua(n));
	}
	
	public static int Nhap(int n) {
		do {
			System.out.println("Vui lòng nhập số n vào :");
			n = sc.nextInt();
			if(n<0) {
				System.out.println("Vui lòng nhập lại!");
			}
		} while (n<0);
		return n;
	}
	
	public static int GiaiThua(int n) {
		if(n==0 || n==1) {
			return 1;
		}
		int ketQua =1;
		for(int i=2;i<=n;i++) {
			ketQua*=i;
		}
		return ketQua;
	}

}
