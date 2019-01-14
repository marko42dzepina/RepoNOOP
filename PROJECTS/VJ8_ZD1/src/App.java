
public class App {

	public static void main(String[] args) {
		
		
		Apartments apt = new Apartments("zadar");		
		apt.description();
		
		Categorize cat = new Categorize("5 star");
		
		
		User user = new User("Marko");
		user.reserveAccomodation();
		user.makeCommentOnAcc();
		user.payForAcc();
	
		
		
		

	}

}
