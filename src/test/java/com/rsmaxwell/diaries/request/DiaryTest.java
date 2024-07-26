
package com.rsmaxwell.diaries.request;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

import com.rsmaxwell.diaries.common.config.Config;

class DiaryTest {
	@Test
	void appHasAGreeting() {
		Config classUnderTest = new Config();
		assertNotNull(classUnderTest);
	}
}
