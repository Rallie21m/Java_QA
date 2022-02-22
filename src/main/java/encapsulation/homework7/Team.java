package encapsulation.homework7;

import java.util.LinkedList;

public class Team {
    private String teamName;
    public double statTeam;
    private LinkedList<Player> teamPlayers = new LinkedList<>();


    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        if (!teamName.trim().isEmpty()) {
            this.teamName = teamName;
        } else {
            System.out.println("A name should not be empty.");
        }
    }

    public Team(String teamName){
        setTeamName(teamName);
    }

    public LinkedList<Player> getTeamPlayers() {
        return teamPlayers;
    }

    public void addPlayer (Player player) {
        if (player.getEndurance() > 0 && player.getDribble() > 0 && player.getPassing() > 0 && player.getShooting() > 0 && player.getSprint() > 0) {
            this.teamPlayers.add(player);
            statTeam += player.stat;

        }
    }

    public void removePlayer (Player player) {
        if (this.teamPlayers.contains(player)) {
            this.teamPlayers.remove(player);
            statTeam -= player.stat;
        } else {
            System.out.printf("Player %s is not in %s team", player.getName(),this.teamName);
        }
    }

    public void printTeam(){

        System.out.printf("%n%s - %d", this.teamName, Math.round(statTeam));
    }
}
