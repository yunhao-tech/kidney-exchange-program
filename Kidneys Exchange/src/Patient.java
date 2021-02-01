import java.util.HashSet;
import java.util.LinkedList;


public class Patient {
	
	final int number; //the signature of a patient
	final Kidney paired_kidney;
	Option opt;
	final HashSet<Kidney> compatible_kidneys;
	final LinkedList<Option> preference_list;
	
	public Patient(int number, Kidney paired_kidney, HashSet<Kidney> compatiple_kidneys, LinkedList<Option> preference_list) {
		this.number = number;
		this.paired_kidney = paired_kidney;
		this.compatible_kidneys = compatiple_kidneys;
		this.opt = null; // when create a patient, its option is not decided.
		this.preference_list = preference_list;
	}
	
	boolean isMatched() {
		return (this.opt != null);
	}
	
	void set_donor(Kidney donor) {
		this.opt = donor; //this patient is matched to this donor.
		donor.assigned = true;
	}
	void wait_for_cadaver(Waiting_list W) {
		this.opt = W; // remain to be modified according to the program
	}
	
	
}
