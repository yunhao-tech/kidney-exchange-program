public class Direct_Donation {

	void direct_donation(Exchange_Program exchange_program) {
		Exchange_Program program = exchange_program;
		for(Patient p: program.patients) {
			if (p.compatible_kidneys.contains(p.paired_kidney)) {
				p.set_donor(p.paired_kidney);
			}
			else {
				p.wait_for_cadaver(program.W);
			}
			System.out.println("(p"+ p.number + "," + p.opt + ")");
		}
		
	}
}
