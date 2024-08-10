import java.util.Scanner;

public class TinhThueThuNhapCaNhan {

	final static Scanner sc = new Scanner(System.in);
	final static float ThueSuat60Trieu = 0.05f;
	final static float ThueSuat60_120Trieu = 0.1f;
	final static float ThueSuat120_210Trieu = 0.15f;
	final static float ThueSuat210_384Trieu = 0.20f;
	final static float ThueSuat384_624Trieu = 0.25f;
	final static float ThueSuat624_960Trieu = 0.3f;
	final static float ThueSuat960Trieu = 0.35f;
	final static float ThuePhuThuoc1Nguoi = 1.6f;
	final static float ThueMacDinh = 4.0f;
			
	public static void main(String[] args) {
		String HoTen = null;
		float TongThuNhapNam=0.0f;
		int SoNguoiPhuThuoc=0;
		HoTen=NhapHoTen(HoTen);
		TongThuNhapNam = NhapTongThuNhapNam(TongThuNhapNam);
		SoNguoiPhuThuoc = NhapSoNguoiPhuThuoc(SoNguoiPhuThuoc);
		System.out.println("Số thuế "+HoTen+" phải nộp là: "+TinhThuNhapChiuThue(TongThuNhapNam, SoNguoiPhuThuoc)+" triệu đồng");
	}
	
	public static String NhapHoTen(String hoTen) {
		System.out.println("Nhap ho ten: ");
		hoTen = sc.nextLine();
		return hoTen;
	}
	
	public static float NhapTongThuNhapNam(float tongThuNhapNam) {
		System.out.println("Nhap tong thu nhap nam: ");
		tongThuNhapNam = sc.nextFloat();
		return tongThuNhapNam;
	}
	
	public static int NhapSoNguoiPhuThuoc(int soNguoiPhuThuoc) {
		System.out.println("Nhap so nguoi phu thuoc: ");
		soNguoiPhuThuoc = sc.nextInt();
		return soNguoiPhuThuoc;
	}
	
	public static float TinhThuNhapChiuThue(float tongThuNhapNam, int soNguoiPhuThuoc) {
		float ThuNhapChiuThue=0.0f;
		if(soNguoiPhuThuoc<0 || tongThuNhapNam <=0) {
			return 0.0f;
		}
		else {
			float ThuNhapChuaThue = tongThuNhapNam - 4.0f - soNguoiPhuThuoc*ThuePhuThuoc1Nguoi;
			if(ThuNhapChuaThue<=60) {
				ThuNhapChiuThue = ThuNhapChuaThue*ThueSuat60Trieu;
			}
			else {
				if(ThuNhapChuaThue<=120) {
					ThuNhapChiuThue = ThuNhapChuaThue*ThueSuat60_120Trieu;
				}
				else {
					if(ThuNhapChuaThue<=210) {
						ThuNhapChiuThue = ThuNhapChuaThue*ThueSuat120_210Trieu;
					}
					else {
						if(ThuNhapChuaThue<=384) {
							ThuNhapChiuThue = ThuNhapChuaThue*ThueSuat210_384Trieu;
						}
						else {
							if(ThuNhapChuaThue<=624) {
								ThuNhapChiuThue = ThuNhapChuaThue*ThueSuat384_624Trieu;
							}
							else {
								if(ThuNhapChuaThue<=960) {
									ThuNhapChiuThue = ThuNhapChuaThue*ThueSuat624_960Trieu;
								}
								else {
									ThuNhapChiuThue = ThuNhapChuaThue*ThueSuat960Trieu;
								}
							}
						}
					}
				}
			}
		}
		return ThuNhapChiuThue;
	}	
}
