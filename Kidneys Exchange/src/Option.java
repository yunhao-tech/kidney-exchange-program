interface Option {
	
	//Option can be a kidney or the waitinglist
	boolean is_waitinglist(); //determine the type of the Option
	String toString();
}

