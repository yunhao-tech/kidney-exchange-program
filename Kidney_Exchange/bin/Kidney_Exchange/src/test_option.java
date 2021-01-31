
class test_option {
	public static void main(String[] args) {
		Kidney k1 = new Kidney(1);
		Kidney k2 = new Kidney(2);
		Kidney k3 = new Kidney(3);
		Waiting_list w = new Waiting_list();
		System.out.println(k1);
		System.out.println(k2);
		System.out.println(w);
		
		Patient p1 = new Patient(1, k1, null, null);
		p1.set_donor(k2);
		System.out.println("p1.opt is " + p1.opt);
		
		System.out.println(p1.opt.is_waitinglist());
		
		Patient p2 = new Patient(2, k2, null, null);
		p2.set_donor(k3);
		System.out.println("p2.opt is " + p2.opt);
		
		Patient p3 = new Patient(3, k3, null, null);
		p3.wait_for_cadaver(w);
		System.out.println("p3.opt is " + p3.opt);
		System.out.println(p3.opt.is_waitinglist());
	}
}
