package org.tcs.in.test.login;
import java.util.List;
import java.util.ArrayList;

public class Matter {
	public static void main(String[] args) {
		List l=new ArrayList();
		l.add("sehariya");
		l.add(234);
		l.add(27367248l);
		l.add(2765358.4624f);
		l.add(234);
		System.out.println(l);
		int A=l.size();
		System.out.println(A);
		Object B = l.get(2);
		System.out.println(B);
		l.add(3,876);
		System.out.println(l);
		l.set(1,56);
		System.out.println(l);
		l.remove(2);
		System.out.println(l);
		Boolean C =l.isEmpty();
		System.out.println(C);
		Boolean D = l.contains(234);
		int E = l.indexOf(234);
		System.out.println(E);
		int F = l.lastIndexOf(234);
		System.out.println(F);
		l.clear();
		System.out.println(l);
		
		
	}

}
