
package com.rsmaxwell.diaries.request;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

import com.rsmaxwell.diaries.common.config.Config;

class DiaryTest {
	@Test
	void appHasAGreeting() {
		Config classUnderTest = new Config();
		assertNotNull(classUnderTest);
	}

	@Test
	void appCanRead() {

		Config config = assertDoesNotThrow(() -> {
			return Config.read();
		});

		System.out.printf("Diaries.path: %s\n", config.getDiaries().getPath());
	}
}
