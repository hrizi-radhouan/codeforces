package problemset;

import java.util.Scanner;
import java.util.stream.Stream;

public class Team {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String[] problems = new String[in.nextInt()];
		in.nextLine();
		for (int i = 0; i < problems.length; i++) 
			problems[i] = in.nextLine();
		
		 long count = Stream.of(problems).filter(p -> Stream.of(p.split(" ")).filter(c-> "1".equals(c)).count() > 1).count();
		 System.out.println(count);
	}
	
	
	

}
