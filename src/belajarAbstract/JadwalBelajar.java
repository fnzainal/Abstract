package belajarAbstract;

/**
 * Abstract java
 * @writer Zainal Fahrudin
 * Pondok Programmer, 22 Oct 2015
 */

public class JadwalBelajar {
	public static void main(String[] args){
		//inisiasi kelas Pondok 
		Pondok pondok = new Pondok();
		//inisiasi kelas Rumah
		Rumah rumah= new Rumah();
		
		//memanggil method setJam pada kelas Pondok dg parameter int
		pondok.setJam(10);
		//memanggil method setJam pada kelas Rumah dg parameter int
		rumah.setJam(2);
		//memanggil method setKelas pada kelas Pondok dg parameter string
		pondok.setKelas("Pondok Programmer");
		//memanggil method setKelas pada kelas Rumah dg parameter string
		rumah.setKelas("sendiri");
		
		//memanggil method belajar() di kelas Pondok
		pondok.belajar();
		
		//memanggil method belajara
		rumah.belajar();
	}
}