package Hewan;

public class main {
	
	public main() {
			System.out.println("Mamalia :");
			Mamalia mamal = new Mamalia();
			mamal.beranak();
			mamal.bertelur();
			
			System.out.println("Unggas : ");
			Unggas ung = new Unggas();
			ung.beranak();
			ung.bertelur();
	}
	
	public static void main(String[] args) {
		new main();
	}
}
