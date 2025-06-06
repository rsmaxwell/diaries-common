package com.rsmaxwell.diaries.common.response;

import lombok.Data;

@Data
public class RefreshTokenReply {

	private String accessToken;
	private Integer refreshPeriod;

	public RefreshTokenReply(String accessToken, Integer refreshPeriod) {
		this.accessToken = accessToken;
		this.refreshPeriod = refreshPeriod;
	}

}
