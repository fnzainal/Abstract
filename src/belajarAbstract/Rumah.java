package belajarAbstract;
//kelas Rumah mengextend kelas Belajar
public class Rumah extends Belajar{
	//method setJam dengan parameter Int
	public void setJam(int jam){
		jamBelajar = jam;
	}
	//method setKelas dengan parameter string
	public void setKelas(String cabang){
		tempat = cabang;
	}
	//method belajar
	public void belajar(){
		System.out.println("Belajar java di Rumah "+tempat
				+" selama "+jamBelajar+" jam");
	}
}