package uni.sofia.fmi.master.tzi.football;

public class FootbalTeamMemberTest {

	public static void main(String[] args) {

		FootbalTeamMember.changeBoss("Alex");
		FootbalTeamMember player1 = new FootbalTeamMember("Petar");
		System.out.println("Trenner:"+FootbalTeamMember.whoIsBoss());
		FootbalTeamMember player2 = new FootbalTeamMember("Hristo");
		System.out.println("Trenner:"+FootbalTeamMember.whoIsBoss());
		FootbalTeamMember player3 = new FootbalTeamMember("Dimitar");
		System.out.println("Trenner:"+FootbalTeamMember.whoIsBoss());
		FootbalTeamMember.changeBoss("Stoycho");
		System.out.println("Trenner:"+FootbalTeamMember.whoIsBoss());
		int playersCount = FootbalTeamMember.countPlayers();
		System.out.printf("%d players has as boss %s",
							FootbalTeamMember.countPlayers(),
							FootbalTeamMember.whoIsBoss());
	}

}
