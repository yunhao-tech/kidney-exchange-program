import java.util.HashSet;

public class Exchange_Program {

	//initialize all the kidneys and patients
	//indicate the number of patient-kidney pairs, which is public all over the program
	//the waiting list is also unique.
	
	int N; // number of patient-kidney pairs
	HashSet<Patient> patients; // Core data.
	HashSet<DonorPatientPair>list_of_DonorPatientPairs;
	Patient[] priority_list; // predefined order established by organ bank.
	final Waiting_list W = new Waiting_list(); // in such an exchange program, the waiting list is unique.
	
	Exchange_Program(int N, HashSet<Patient> patients, Patient[] priority_list){
		this.N = N;
		this.patients = patients;
		for (Patient p: patients) {
			this.list_of_DonorPatientPairs.add(new DonorPatientPair(p));
		}
		this.priority_list = priority_list;
	}
}
