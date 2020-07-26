package Collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Mycollections {

	@SuppressWarnings("finally")
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>(10);
		Scanner sc = new Scanner(System.in);
		System.out.println("\tElements\nadd\nfetch\nremove");
		String input;
		for(int i = 0;; ++i) {
			
			input = sc.nextLine();
			if(input.equals("exit") == true) break;
			switch(input) {
			case "add" : list.add(sc.nextInt());sc.nextLine();break;
			case "fetch" : try{
						int x = list.get(sc.nextInt());
						System.out.println("Fetched ELEMENT:"+x);
						sc.nextLine(); 
						
						}
						catch(Exception e) {
							System.out.println("No such element");
							
						}	
						break;
			case "remove": try{
						int x = list.remove(sc.nextInt());
						System.out.println("Removed ELEMENT:"+x);
						sc.nextLine(); 
				
						}
						catch(Exception e) {
							System.out.println("No such element");
					
						}	
						break;
			default: System.out.println("INVALID INPUT");break;
			}
		}
		
		System.out.println("Printing Elements:");
		
		for(int i : list) System.out.println(i);
		sc.close();
	}

}
