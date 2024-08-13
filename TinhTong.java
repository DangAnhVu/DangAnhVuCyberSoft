import java.util.Scanner;

public class TinhTong {

	final static Scanner sc =new Scanner(System.in);
	
	public static void main(String[] args) {
		int n;
		n=Nhapn();
		float x;
		x=Nhapx();
		
		System.out.println("Tổng của n = "+ n +" và x = "+ x +"là:"+ TinhTongMu(n, x));
	}
	
	public static int Nhapn() {
		int soN;
        do {
            System.out.print("Vui lòng nhập số nguyên dương n: ");
            soN = sc.nextInt();
            if (soN <= 0) {
                System.out.println("Giá trị n phải lớn hơn 0. Hãy thử lại.");
            }
        } while (soN <= 0);
        
        return soN;
	}
	
	public static float Nhapx() {
		float soX;
        do {
            System.out.print("Vui lòng nhập số nguyên thực x: ");
            soX = sc.nextFloat();
            if (soX <= 0) {
                System.out.println("Giá trị x phải lớn hơn 0. Hãy thử lại.");
            }
        } while (soX <= 0);
        
        return soX;
	}
	
	public static double TinhTongMu(int n, float x) {
		double res = 0;
        for (int i = 1; i <= n; i++) {
            res += Math.pow(x, i);
        }
        return res;
	}

}
