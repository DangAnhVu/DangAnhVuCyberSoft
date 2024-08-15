import java.util.Scanner;

public class TinhSoNamDoi {

	final static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		float tiengui = 0.0f;
		tiengui = NhapSoTienGuiVao(tiengui);
		float tienmong = 0.0f;
		tienmong = NhapSoTienMongMuon(tienmong);
		int laisuat = 0;
		laisuat = NhapLaiSuat(laisuat);
		System.out.println(SoNamCho(tiengui, tienmong, laisuat));
	}
	
	public static float NhapSoTienGuiVao(float n) {
		System.out.println("Vui lòng nhập số tiền gửi (tr) vào: ");
		n = sc.nextInt();
		return n;
	}
	
	public static float NhapSoTienMongMuon(float n) {
		System.out.println("Vui lòng nhập số tiền mong muốn (tr) vào: ");
		n = sc.nextInt();
		return n;
	}
	
	public static int NhapLaiSuat(int n) {
		System.out.println("Vui lòng nhập lãi suất gửi (%) từ 0-100 vào: ");
		n = sc.nextInt();
		return n;
	}
	
	public static int SoNamCho(float tienVao, float tienMongMuon, int Lai) {
		int nam=0;
		while(tienVao<tienMongMuon) {
			nam++;
			tienVao += tienVao*Lai/100;
		}
		return nam;
	}

}
