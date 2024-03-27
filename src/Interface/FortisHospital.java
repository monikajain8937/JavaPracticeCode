package Interface;

public class FortisHospital implements UsMedical,UkMedical, IndianMedical {


	@Override
	public void pediaservices() {
		System.out.println("Fh----pediaservices");
		
	}

	@Override
	public void pysioservices() {
System.out.println("Fh---pysioservices");		
	}

	@Override
	public void orthodservices() {
System.out.println("Fh---Orthroservices");		
	}

	@Override
	public void Entservices() {
		
		System.out.println("Fh---ENTservices");
	}

	@Override
	public void cardioservices() {
		System.out.println("Fh---Cardioservices");
		
	}

	@Override
	public void oncologyservices() {
		System.out.println("Fh---oncologyservices");
		
	}

	@Override
	public void neuroservices() {
		System.out.println("Fh---neuroservices");
	}
//Individual
	public void OPDservices() {
		System.out.println("Fh---OPDservices");
	}
//CommonInterface method
	@Override
	public void emergencyservices() {
		// TODO Auto-generated method stub
		
	}
	
}
