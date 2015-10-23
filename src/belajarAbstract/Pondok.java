package belajarAbstract;

//kelas Pondok mengextends kelas Belajar
public class Pondok extends Belajar{
	//method setJam dengan parameter int
	public void setJam(int jam){
		jamBelajar = jam;
	}
	//method setKelas dengan parameter int
	public void setKelas(String sekolah){
		tempat = sekolah;
	}
	//method belajar no parameter;
	public void belajar(){
		System.out.println("Belajar java di "+tempat+" selama "+jamBelajar+" jam");
	}
}