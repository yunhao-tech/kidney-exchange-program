
public class DonorPatientPair {
	//int number;
	Kidney donor;
	Patient patient;
	
	DonorPatientPair(Patient patient){
		//this.number = number;
		this.patient = patient;
		this.donor = patient.paired_kidney;
	}
	
	
}
