import java.util.Scanner;

public class TinhTongSoLe {

	final static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		boolean flag = true;
		int n=0;
		
		do {
			do {
				System.out.print("Nhập vào n: ");
				n = sc.nextInt();
				if(n<=0) {
					System.out.println("Nhập lại");
				}
			} while (n<=0);
			int sum = TinhTongLe(n);
			System.out.println("Tổng các số lẻ nhỏ hơn "+n+" là: "+sum);
			flag = false;
		} while (flag);
	}

	public static int TinhTongLe(int n) {
		int sum=0;
		for(int i=1;i<n;i++) {
			if(i%2!=0) {
				sum+=i;
			}
		}
		return sum;
	}
}
