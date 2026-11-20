public class FantasyDodgeballTeam {
   //instance variables
   private String ownerName;
   private String coachName;
   private String player1Name;
   private String player2Name;
   private String player3Name;
   private String teamName;
   private int teamPoints;
   private int teamRank;
   //static double totalMoneyPot;
   //static int totalTeams;
   private double teamWinnings;
   
   // constructors
   public FantasyDodgeballTeam(){
      teamName = "Grande Armée";
      ownerName = "French Empire";
      coachName = "Napoleon Bonaparte";
      player1Name = "Joachim Murat";
      player2Name = "Michel Ney";
      player3Name = "André Masséna";
      teamPoints = 420;
      teamRank = 3;
      teamWinnings = 67;
   }
   
   public FantasyDodgeballTeam(String coachName, String player1Name, String player2Name, String player3Name, String teamName, int teamPoints, int teamRank, double teamWinnings){
      this.coachName = coachName;
      this.player1Name = player1Name;
      this.player2Name = player2Name;
      this.player3Name = player3Name;
      this.teamName = teamName;
      this.teamPoints = teamPoints;
      this.teamWinnings = teamWinnings;
      this.teamRank = teamRank;
      }
      
      
   //methods
   public static int rankTeam(int teamPoints){
   // will rank teams based on their points
      return 0;
   }
   public static int getTeamPoints(){
   // will get the private teamPoints variable
      return 0;
   }
   public static int addPoints(int points){
   // will add points to a team's teamPoints variable
      return 0;
   }
   public static int removePoints(){
   // will remove points to a team's teamPoints variable
      return 0;
   }
   public static double rewardCash(){
   // will calculate how many winnings each team earns from the prize pool
   // teamWinnings = (totalMoneyPot * (1.5 - 1) * (Math.pow(1.5, (totalTeams - teamRank))))/(Math.pow(1.5, totalTeams) - 1);
      return 0;
   }
}