
package com.rsmaxwell.diaries.request;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

import com.rsmaxwell.diaries.common.model.Diary;

class DiaryTest {
	@Test
	void appHasAGreeting() {
		Diary classUnderTest = new Diary();
		assertNotNull(classUnderTest);
	}
}
