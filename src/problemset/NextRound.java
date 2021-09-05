package problemset;

import java.util.Scanner;
import java.util.stream.Stream;

public class NextRound {

	public static void main(String[] args) {	
		Scanner in = new Scanner(System.in);
		String firstLine = in.nextLine();
		String secondLine = in.nextLine();
		String[] participantsScores = secondLine.split(" ");
		int kthPlace = Integer.parseInt(firstLine.split(" ")[1]);// k-th participant score
		int kthParticipantScore = Integer.parseInt(participantsScores[kthPlace-1]);// k-th participant score
		long numberParticipantsPasstoNextRound = Stream.of(participantsScores)
				.filter(v -> (Integer.valueOf(v) >= kthParticipantScore && Integer.valueOf(v) > 0)).count();
		System.out.println(numberParticipantsPasstoNextRound);
	}
}
