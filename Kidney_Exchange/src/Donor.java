class Kidney implements Option{
	final int number; // the only parameter of kidney is its number
	boolean assigned;
	Kidney(int number) {
		this.number = number;
		this.assigned = false;
	}

	public boolean is_waitinglist() {
		// a kidney is not waiting list
		return false;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "k"+Integer.toString(this.number);
	}
}

class Waiting_list implements Option{
	final String name = "w";
	
	public Waiting_list() {
		
	}
	public boolean is_waitinglist() {
		// a waiting list is a waiting list
		return true;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "w";
	}
	
}