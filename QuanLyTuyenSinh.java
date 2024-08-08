import java.util.Scanner;

public class QuanLyTuyenSinh {
	
	final static char KhuVucA = 'A';
	final static char KhuVucB = 'B';
	final static char KhuVucC = 'C';
	final static char KhongKhuVuc = 'X';
	final static float DiemKhuVucA = 2.0f;
	final static float DiemKhuVucB = 1.0f;
	final static float DiemKhuVucC = 0.5f;
	final static int DoiTuong1 = 1;
	final static int DoiTuong2 = 2;
	final static int DoiTuong3 = 3;
	final static int KhongDoiTuong = 0;
	final static float DiemDoiTuong1 = 2.5f;
	final static float DiemDoiTuong2 = 1.5f;
	final static float DiemDoiTuong3 = 1.0f;
	final static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		char khuVuc;
		int doiTuong;
		float diem1, diem2, diem3;
		System.out.println("Nhap vao diem 1: ");
		diem1=sc.nextFloat();
		System.out.println("Nhap vao diem 2: ");
		diem2=sc.nextFloat();
		System.out.println("Nhap vao diem 3: ");
		diem3=sc.nextFloat();
		System.out.println("Nhap vao khu vuc: ");
		khuVuc=sc.next().charAt(0);
		System.out.println("Nhap vao doi tuong du thi: ");
		doiTuong=sc.nextInt();
		System.out.println("\n"+diem1+"\t" +diem2+"\t"+diem3+"\t"+khuVuc+"\t"+doiTuong);
		float diemtrungbinh = TinhDiemTrungBinh(diem1, diem2, diem3);
		float diemCongTheoKhuVuc = DiemCongTheoKhuVuc(khuVuc);
		float diemCongTheoDoiTuong = DiemCongTheoDoiTuong(doiTuong);
		float dtb = diemCongTheoDoiTuong + diemCongTheoKhuVuc + diemtrungbinh;
		XetDiem(dtb);
	}
	
	public static float TinhDiemTrungBinh(float a, float b, float c) {
		return (a+b+c)/3;
	}
	
	public static float DiemCongTheoKhuVuc(char khuVuc) {
		float diemcong=0.0f;
		switch (khuVuc) {
		case KhuVucA:
				diemcong=DiemKhuVucA;
			break;
		case KhuVucB:
			diemcong=DiemKhuVucB;
			break;
		case KhuVucC:
			diemcong=DiemKhuVucC;
			break;
		default:
			break;
		}
		return diemcong;
	}
	public static float DiemCongTheoDoiTuong(int doituong) {
		float diemcong=0.0f;
		switch (doituong) {
		case DoiTuong1:
				diemcong=DiemDoiTuong1;
			break;
		case DoiTuong2:
			diemcong=DiemDoiTuong2;
			break;
		case DoiTuong3:
			diemcong=DiemDoiTuong3;
			break;
		default:
			break;
		}
		return diemcong;
	}
	public static void XetDiem(float dtb) {
		if(dtb>=5) {
			System.out.println("Diem cua ban la: "+dtb+". Ban da dau.");
		}
		else {
			System.out.println("Diem cua ban la: "+dtb+". Ban da rot.");
		}
	}
}
