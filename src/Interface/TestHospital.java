package Interface;

public class TestHospital {

	public static void main(String[] args) {
		FortisHospital fh=new FortisHospital();
		fh.cardioservices();
		fh.Entservices();
		fh.oncologyservices();

		
		//top Casting
		//Child class object can be referred by parent interface ref variable
		UsMedical us= new FortisHospital();
		us.emergencyservices();
		us.pediaservices();
	}

}
