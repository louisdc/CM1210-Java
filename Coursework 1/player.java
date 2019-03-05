public class player {

	private String playerName;
	private String playerID;
	private int careerTriesScored;
	private String teamName;
	private String teamID;
	private String homeStadiumStreet;
	private String homeStadiumTown;
	private String homeStadiumPostcode;

	public player( ) {
		playerName = "";
		playerID = "";
		careerTriesScored = 0;
		teamName = "";
		teamID = "";
		homeStadiumStreet = "";
		homeStadiumTown = "";
		homeStadiumPostcode = "";
	}

	public player( String inPlayerName, String inPlayerID, int inCareerTriesScored, String inTeamName, String inTeamID, String inHomeStadiumStreet, String inHomeStadiumTown, String inHomeStadiumPostcode ) {
		playerName = inPlayerName;
		playerID = inPlayerID;
		careerTriesScored = inCareerTriesScored;
		teamName = inTeamName;
		teamID = inTeamID;
		homeStadiumStreet = inHomeStadiumStreet;
		homeStadiumTown = inHomeStadiumTown;
		homeStadiumPostcode = inHomeStadiumPostcode;
	}

	public String getPlayerName( ) {
		return playerName;
	}

	public String getPlayerID( ) {
		return playerID;
	}

	public int getCareerTriesScored( ) {
		return careerTriesScored;
	}

	public String getTeamName( ) {
		return teamName;
	}

	public String getTeamID( ) {
		return teamID;
	}

	public String getHomeStadiumStreet( ) {
		return homeStadiumStreet;
	}

	public String getHomeStadiumTown( ) {
		return homeStadiumTown;
	}

	public String getHomeStadiumPostcode( ) {
		return homeStadiumPostcode;
	}

	public void setPlayerName( String inPlayerName ) {
		playerName = inPlayerName;
	}
 	
 	public void setPlayerID( String inPlayerID ) {
		playerID = inPlayerID;
	}

	public void setCareerTriesScored( int inCareerTriesScored ) {
		careerTriesScored = inCareerTriesScored;
	}

	public void setTeamName( String inTeamName ) {
		teamName = inTeamName;
	}

	public void setTeamID( String inTeamID ) {
		teamID = inTeamID;
	}

	public void setHomeStadiumStreet( String inHomeStadiumStreet ) {
		homeStadiumStreet = inHomeStadiumStreet;
	}

	public void setHomeStadiumTown( String inHomeStadiumTown ) {
		homeStadiumTown = inHomeStadiumTown;
	}

	public void setHomeStadiumPostcode( String inHomeStadiumPostcode ) {
		homeStadiumPostcode = inHomeStadiumPostcode;
	}

	public String toString( ) {
		return ( playerName + "\t" + playerID + "\t" + careerTriesScored + "\t" + teamName + "\t" + teamID + "\t" + homeStadiumStreet + "\t" + homeStadiumTown + "\t" + homeStadiumPostcode );
	}


}