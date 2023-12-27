import java.util.Scanner;

public class Main {
	//Banka hesabına giriş: 3 yanlış denemede hesap bloke olur
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("*****Kullanıcı Login Uygulamasına Hoşgeldiniz*****");
		int girisHakki =3;
		while (girisHakki>0) {
			Scanner scanner = new Scanner(System.in);
			System.out.print("Kullanıcı adınızı giriniz: ");
			String girilenkullaniciAdi = scanner.next();
			System.out.print("Parolanızı giriniz: ");
			String girilenParola = scanner.next();
			if(login(girilenkullaniciAdi, girilenParola)) {
				System.out.println("Sisteme başarı ile giriş yaptınız");
				break;
			}else {
				System.out.println("Kullanıcı adı veya parola yanlıştır!!");
				girisHakki--;
			}
			
		}//while 
		
		if(girisHakki==0) {
			System.out.println("Hesabınız bloke edilmiştir");
		}

	}
	
	public static boolean login(String kullaniciAdi, String parola) {
		if(kullaniciAdi.equals("Sumeyye")&& parola.equals("123")) {
			return true;
		}else {
			return false;
		}
	}
	
	
	
}
