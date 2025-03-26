package studio7;

public class Die {
	private int side; 

	public Die (int n) {
		this.side = (int) Math.round(n*Math.random() + 1);  
	}
	
	public int size( ) {
		return side;
	}
	
	public static void main(String[] args) {
		Die bob = new Die(8);
		System.out.println(bob.size());

	}

}
