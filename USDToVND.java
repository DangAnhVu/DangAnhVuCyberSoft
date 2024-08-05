import java.util.Scanner;

public class baitap14 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int USD;
		System.out.println("Nhap so tien muon chuyen: ");
		USD=sc.nextInt();
		int VND = USD*23500;
		System.out.println("Ket qua: "+VND);
	}

}