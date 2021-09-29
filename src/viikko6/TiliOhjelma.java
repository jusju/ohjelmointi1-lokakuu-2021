package viikko6;
// PROGRAM CLASS ELI OHJELMALUOKKA
public class TiliOhjelma {
	// PÄÄOHJELMA
	public static void main(String[] args) {
		// LUODAAN TILI OLIO
		// OLION LUONTI PARAMETRILLISEN KONSTRUKTORIN
		// AVULLA
		Tili tili = new Tili(500000);
		// KUTSUTAAN OLION TALLETA-METODIA ARVOLLA 200
		tili.talleta(200.0);
		// HAETAAN TILIN SALDO TALLETUKSEN JÄLKEEN
		// JA TULOSTETAAN ARVO NÄYTÖLLE
		System.out.println("Saldo: " + tili.haeSaldo());
		// KUTSUTAAN NOSTO METODIA ARVOLLA 50
		tili.nosta(50);
		// TULOSTETAAN TILIN SALDO NOSTON JÄLKEEN
		System.out.println("Saldo: " + tili.haeSaldo());
	}
}
