package com.codemate.cric.matchdetails;

import java.util.List;

import com.codemate.cric.enums.BallType;
import com.codemate.cric.users.Player;

public class Ball {
	private Player balledBy;
	private Player playedBy;
	private BallType type;

	private Wicket wicket;
	private List<Run> runs;
	private Commentary commentary;
}
