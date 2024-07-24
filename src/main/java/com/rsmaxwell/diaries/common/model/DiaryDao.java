package com.rsmaxwell.diaries.common.model;

import org.hibernate.annotations.processing.SQL;

public interface DiaryDao {

	@SQL("""
			CREATE TABLE diary (
				id INTEGER PRIMARY KEY GENERATED ALWAYS AS IDENTITY,
				path VARCHAR(1024) NOT NULL
			)""")
	void createDiaryTable(String playerWhite);

}
