package com.codemate.cric.matchdetails;

import java.util.Date;
import java.util.List;

import com.codemate.cric.enums.MatchResult;
import com.codemate.cric.teamdetails.Playing11;
import com.codemate.cric.users.Commentator;
import com.codemate.cric.users.Referee;
import com.codemate.cric.users.Umpire;

public abstract class Match {
	private int number;
	private Date startTime;
	private MatchResult result;
	private Playing11[] teams;
	private List<Inning> innings;
	private List<Umpire> umpires;
	private Referee referee;
	private List<Commentator> commentators;
	private List<MatchStat> matchStats;

	public boolean assignStadium(Stadium stadium) {}

	public boolean assignReferee(Referee referee) {}
}
