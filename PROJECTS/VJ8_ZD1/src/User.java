
public class User {
	
	
	String nme;
	
	private Booking book;
	private Payment pay;
	private Apartments apt;
	
	
	public User(String name) {
		
		book = new Booking();
		pay = new Payment();
		apt = new Apartments();
		
	}
	
	public void reserveAccomodation() {
		book.makeBooking(apt);
	}
	
	public void payForAcc() {
		pay.makePayment();
	}
	
	public void makeCommentOnAcc() {
				
		System.out.println("Comenting about appartments ");
	}
	
	public void cancelAccomodation(Apartments apt) {
		book.cancelBooking(apt);
	}
	
	
	
	public void getName(String name) {
		
		System.out.print("User "+name);
	}

}
