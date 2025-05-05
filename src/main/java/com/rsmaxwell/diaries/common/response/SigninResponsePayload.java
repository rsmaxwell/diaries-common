package com.rsmaxwell.diaries.common.response;

import lombok.Data;

@Data
public class SigninResponsePayload {

	private String accessToken;
	private String refreshToken;
	private Integer refreshPeriod;
	private Long id;

	public SigninResponsePayload(String accessToken, String refreshToken, Integer refreshPeriod, Long id) {
		this.accessToken = accessToken;
		this.refreshToken = refreshToken;
		this.refreshPeriod = refreshPeriod;
		this.id = id;
	}

}
