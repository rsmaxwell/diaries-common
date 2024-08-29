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
	private String secret;
	private Diaries diaries;

	public static Config read(String filename) throws StreamReadException, DatabindException, IOException {
		File file = new File(filename);
		return mapper.readValue(file, Config.class);
	}
}
