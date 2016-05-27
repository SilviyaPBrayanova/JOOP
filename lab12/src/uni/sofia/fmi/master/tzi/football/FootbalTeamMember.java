package uni.sofia.fmi.master.tzi.football;

public class FootbalTeamMember {

	public static String boss;
	public static int countPlayers = 0;
	private String name;
	
	public FootbalTeamMember(String name){
		this.name = name;
		countPlayers += 1;
	}
	
	public static void changeBoss(String bossName) {
		boss = bossName;
	}
		
	public static String whoIsBoss() {
		return boss;
	}

	public static int countPlayers() {
		return countPlayers;
	}
}
