package domain;

public class Admin {
	private String ime;
	private String prezime;
	private String korisnicko;
	private String sifra;
	private Role role;

	public Admin(String ime, String prezime, String korisnicko, String sifra, Role role) {
		super();
		this.ime = ime;
		this.prezime = prezime;
		this.korisnicko = korisnicko;
		this.sifra = sifra;
		this.role = role;
	}

	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public String getPrezime() {
		return prezime;
	}

	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}

	public String getKorisnicko() {
		return korisnicko;
	}

	public void setKorisnicko(String korisnicko) {
		this.korisnicko = korisnicko;
	}

	public String getSifra() {
		return sifra;
	}

	public void setSifra(String sifra) {
		this.sifra = sifra;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "Admin [ime=" + ime + ", prezime=" + prezime + ", korisnicko=" + korisnicko + ", sifra=" + sifra
				+ ", role=" + role + "]";
	}

}
