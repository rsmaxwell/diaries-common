package com.rsmaxwell.diaries.common.config;

import java.util.List;
import java.util.Map;

import lombok.Data;

@Data
public class DbConfig {

	private Go go;
	private Jdbc jdbc;
	private Map<String, String> additionalConnectionProperties;
	private String host;
	private int port;
	private String database;
	private User admin;
	private List<User> users;

	public String getJdbcUrl() {
		return String.format("jdbc:%s://%s:%d/", jdbc.getDbms(), host, port);
	}

	public String getJdbcUrlWithDatabase() {
		return String.format("jdbc:%s://%s:%d/%s", jdbc.getDbms(), host, port, database);
	}
}
