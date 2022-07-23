package org.Charger.com;

public class SystemExit {
	public static void main(String[] args) {
		for(int x=34;x<41;x++) {
			if(x==39) {
				System.exit(0);
				//continue;
			}
			System.out.println(x);
		}System.out.println("OK");
	}

}
