import java.util.Random;
import java.util.Scanner;

public class OanTuTi {

	final static Random rd = new Random();
	final static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int chon;
		boolean flag = true;
		int AI_Score=0;
		int Player_Score=0;
		do {
			Menu();
			chon = sc.nextInt();
			int AIChon;
			switch (chon) {
			case 0:
				flag = false;
				if(AI_Score == Player_Score) {
					System.out.println("Cả hai hòa nhau");
				}
				else if(AI_Score > Player_Score) {
					System.out.println("AI thắng nhiều nhất");
					System.out.println("Tỷ số là : "+ "Người chơi:"+Player_Score+"----"+"AI:"+AI_Score);
				}
				else {
					System.out.println("Người chơi thắng nhiều nhất");
					System.out.println("Tỷ số là : "+ "Người chơi:"+Player_Score+"----"+"AI:"+AI_Score);
				}
				break;
			case 1:
				AIChon = rd.nextInt(3)+1;
				switch (AIChon) {
				case 1:
					System.out.println("Hai bên cùng chọn Kim");
					break;
				case 2:
					System.out.println("Người chơi chọn Kim");
					System.out.println("AI chọn Bao");
					AI_Score+=1;
					break;
				default:
					System.out.println("Người chơi chọn Kim");
					System.out.println("AI chọn Kéo");
					Player_Score+=1;
					break;
				}
				break;
			case 2:
				AIChon = rd.nextInt(3)+1;
				switch (AIChon) {
				case 1:
					System.out.println("Người chơi chọn Bao");
					System.out.println("AI chọn Kim");
					Player_Score+=1;
					break;
				case 2:
					System.out.println("Hai bên cùng chọn Bao");
					break;
				default:
					System.out.println("Người chơi chọn Bao");
					System.out.println("AI chọn Kéo");
					AI_Score+=1;
					break;
				}
				break;
			case 3:
				AIChon = rd.nextInt(3)+1;
				switch (AIChon) {
				case 1:
					System.out.println("Người chơi chọn Kéo");
					System.out.println("AI chọn Kim");
					AI_Score+=1;
					break;
				case 2:
					System.out.println("Người chơi chọn Kéo");
					System.out.println("AI chọn Bao");
					Player_Score+=1;
					break;
				default:
					System.out.println("Hai bên cùng chọn Kéo");
					break;
				}
				break;
			default:
				System.out.println("Nhap lai");
				
			}
		} while (flag);
	}
	
	public static void Menu() {
		System.out.println("1. Kim");
		System.out.println("2. Bao");
		System.out.println("3. Kéo");
		System.out.println("0. Nghỉ chơi");
	}
	
	

}
