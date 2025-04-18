package com.rsmaxwell.diaries.common.config;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

import lombok.Data;

@Data
public class Config {

	static private ObjectMapper mapper = new ObjectMapper();

	private MqttConfig mqtt;
	private DbConfig db;
	private DiariesConfig diaries;
	private String refreshPeriod;
	private String refreshExpiration;
	private String secret;

	public static Config read(String filename) throws StreamReadException, DatabindException, IOException {
		File file = new File(filename);
		return mapper.readValue(file, Config.class);
	}

	public Integer getRefreshPeriodSeconds() {
		return TimeParser.parseTimeToSeconds(this.refreshPeriod);
	}

	public Integer getRefreshExpirationSeconds() {
		return TimeParser.parseTimeToSeconds(this.refreshExpiration);
	}
}
