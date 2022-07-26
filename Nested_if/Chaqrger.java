package tamata;

public class Chaqrger {
	public static void main(String[] args) {
		int age=23 , ht=123 , wt = 70;
		if (age>18 ) {
			System.out.println("AGE : "+age);
			if (ht==123) {
				System.out.println("Height : "+ht);
				if (wt!=80) {
					System.out.println("Weight : "+wt);
					System.out.println("Eligible to Donate Blood");
					
				} else {
					System.out.println("Not Eligible");

				}
				
			} else {
				System.out.println("Not Eligible");

			}
			
		} else {
			System.out.println("Less Age");

		}
	}

}
