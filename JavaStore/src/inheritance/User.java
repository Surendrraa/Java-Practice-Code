package inheritance;

public class User {

	public static void main(String[] args) {
		
		Guest guest = new Guest();
		guest.read();
		
		Developer dev = new Developer();
		dev.write();
		dev.read();
		
		Admin admin = new Admin();
		admin.manage();
		admin.write();
		admin.read();

	}

}
