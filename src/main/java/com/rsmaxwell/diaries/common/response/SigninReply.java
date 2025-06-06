package com.rsmaxwell.diaries.common.response;

import lombok.Data;

@Data
public class SigninReply {

	private String accessToken;
	private String refreshToken;
	private Integer refreshPeriod;
	private Long id;

	public SigninReply(String accessToken, String refreshToken, Integer refreshPeriod, Long id) {
		this.accessToken = accessToken;
		this.refreshToken = refreshToken;
		this.refreshPeriod = refreshPeriod;
		this.id = id;
	}

}
