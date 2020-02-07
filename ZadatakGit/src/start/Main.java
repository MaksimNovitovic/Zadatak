package start;

import java.util.Scanner;


public class Main {

	private static Scanner scanner = new Scanner(System.in);
	private static DaoKorisnici daoKorisnici = new DaoKorisnici();
	

	public static void radSaKorisnicima() {
		
		System.out.println("Zaposleni");
		System.out.println("1. Unesi novog");
		System.out.println("2. Prikaz svih korisnika");
		System.out.println("3. Prikaz korisnika");
		System.out.println("4. Izmena korisnika");
		System.out.println("5. Brisanje korisnika");
		System.out.println("--->: ");
		int izbor = scanner.nextInt();
		switch (izbor) {
		case 1:
			unosKorisnika(daoKorisnik);
			break;
		case 2:
			try {
				izmenaPodatakaKorisnika(daoKorisnik);
			} catch (Exception e) {
				
				e.printStackTrace();
			}
			break;
		case 3:
			brisanjeKorisnika(daoKorisnik);
			radSaKorisnicima();
			break;
		case 4:
			daoKorisnik.prikazSvihKorisnika();
			break;
		case 5:
			main(null);
			break;

		default:
			break;
		}
	}
	
	private static void brisanjeKorisnika(DaoKorisnici daoKorisnici) {
		System.out.println("Unesite sifru:");
		String username = scanner.next();
		if(daoKorisnici.daLiPostoji(username)) {
			try {
				Korisnici korisnici= daoKorisnici.vratiKorisnika(username);
				korisnici.setStatus(false);
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
		radSaKorisnicima();
		
	}

	private static void izmenaPodatakaKorisnika(DaoKorisnici daoKorisnici) throws Exception {
		System.out.println("Uneti username zaposlenog za menjanje istog:");
		String username=scanner.next();
		if(daoKorisnik.daLiPostoji(username)) {
			Korisnik korisnikIzmena = daoKorisnik.vratiKorisnika(username);
			daoKorisnik.prikazKorisnik(username);
			System.out.println("Unesite ime:");
			String ime = scanner.next();
			if(ime.equals("\n")) { 
				radSaKorisnicima();
				return;}
			else {
			System.out.println("Unesite prezime: ");
			String prezime=scanner.next();
			korisnikIzmena.setUsername(username);
			korisnikIzmena.setIme(ime);
			korisnikIzmena.setPrezime(prezime);
			}
		}else {
			System.out.println("Nema tog zaposlenog");
		}
		radSaKorisnicima();
		
	}

	private static void unosZaposlenog(DaoKorisnici daoKorisnici) {
		System.out.println("Unesite sifru:");
		String username=scanner.next();
		if(daoKorisnici.daLiPostoji(username))
			System.out.println("Vec postoji zaposleni");
		else {
			System.out.println("Unesite ime:");
			String ime = scanner.next();
			System.out.println("Unesite prezime: ");
			String prezime = scanner.next();
			daoKorisnici.unosNovogKorisnika(new Korisnik(username, ime, prezime));
		
		}
		radSaKorisnicima();
		
	}

	
	public static void main(String[] args) {
		System.out.println("Izbori");
		System.out.println("1.Ulogujte se ");
		System.out.println("--->: ");
		
		int izbor = scanner.nextInt();
		switch (izbor) {
		case 1:
			radSaKorisnicima();
			break;
		case 2:
			
			break;
		case 3:
			
			break;

		default:
			break;
		}

	}
	

}
