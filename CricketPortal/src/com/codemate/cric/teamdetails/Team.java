package com.codemate.cric.teamdetails;

import java.util.List;

import com.codemate.cric.users.Player;

public class Team {
	  private String name;
	  private List<Player> players;
	  private List<News> news;
	  private Coach coach;

	  public boolean addTournamentSquad(TournamentSquad tournamentSquad);
	  public boolean addPlayer(Player player);
	  public boolean addNews(News news);	
}
