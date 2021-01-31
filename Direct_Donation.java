import java.util.HashSet;
import java.util.LinkedList;

public class Direct_Donation {
	public static void main(String[] args) {
		int N = 10;
		HashSet<Donor>[] list_of_preference = new HashSet<Donor>[N]; // remain to be done
		Donor[] list_of_donor = new Donor[N];
		Patient[] list_of_patient = new Patient[N];
		
		for (int i = 0; i < N; i++) {
			list_of_patient[i] = new Patient(i, list_of_preference[i]);
			if (list_of_preference[i].contains(list_of_donor[i])) {
				list_of_patient[i].add_donor(list_of_donor[i]);
			} 
			else {
				list_of_patient[i].wait_for_cadaver();
			}
		}
	}
}
