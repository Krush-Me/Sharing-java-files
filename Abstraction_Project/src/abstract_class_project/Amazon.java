package abstract_class_project;

public class Amazon extends AmAbs {

	@Override
	public boolean loginCheck(String uname, int pass) {
		if (uname == "ABC" && pass == 1234) {
			return true;
		} else {
			return false;
		}
		
	}

	@Override
	public void addCart() {
		
		
	}

	@Override
	void getPrice() {
		
		
	}

	@Override
	void wishlist() {
		
		
	}

	@Override
	void buyNow() {
		
		
	}

	

	
	
}
