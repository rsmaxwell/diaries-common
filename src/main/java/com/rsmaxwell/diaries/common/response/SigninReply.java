package com.rsmaxwell.diaries.common.response;

import lombok.Data;

@Data
public class SigninReply {

	private String accessToken;
	private String refreshToken;
	private Integer refreshPeriod;
	private Long userId;
	private String username;
	private String knownAs;
	private String sessionId;

	public SigninReply(String accessToken, String refreshToken, Integer refreshPeriod, Long id, String username, String knownAs, String sessionId) {
		this.accessToken = accessToken;
		this.refreshToken = refreshToken;
		this.refreshPeriod = refreshPeriod;
		this.userId = id;
		this.username = username;
		this.knownAs = knownAs;
		this.sessionId = sessionId;
	}

}
