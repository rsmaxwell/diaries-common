
package com.rsmaxwell.diaries.request;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.nio.file.Path;
import java.nio.file.Paths;

import org.junit.jupiter.api.Test;

import com.rsmaxwell.diaries.common.config.Config;
import com.rsmaxwell.diaries.common.config.DbConfig;

class DiaryTest {
	@Test
	void appHasAGreeting() {
		Config classUnderTest = new Config();
		assertNotNull(classUnderTest);
	}

	@Test
	void appCanRead() {

		String home = System.getProperty("user.home");
		Path filePath = Paths.get(home, ".diaries", "test.json");
		String filename = filePath.toString();

		try {
			Config config = Config.read(filename);
			DbConfig dbConfig = config.getDb();

			System.out.printf("Diaries.path: %s\n", config.getDiaries().getOriginal());

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
