package viikko6;
// PROGRAM CLASS ELI OHJELMALUOKKA
public class TiliOhjelma {
	// P��OHJELMA
	public static void main(String[] args) {
		// LUODAAN TILI OLIO
		// OLION LUONTI PARAMETRILLISEN KONSTRUKTORIN
		// AVULLA
		Tili tili = new Tili(500000);
		// KUTSUTAAN OLION TALLETA-METODIA ARVOLLA 200
		tili.talleta(200.0);
		// HAETAAN TILIN SALDO TALLETUKSEN J�LKEEN
		// JA TULOSTETAAN ARVO N�YT�LLE
		System.out.println("Saldo: " + tili.haeSaldo());
		// KUTSUTAAN NOSTO METODIA ARVOLLA 50
		tili.nosta(50);
		// TULOSTETAAN TILIN SALDO NOSTON J�LKEEN
		System.out.println("Saldo: " + tili.haeSaldo());
	}
}
