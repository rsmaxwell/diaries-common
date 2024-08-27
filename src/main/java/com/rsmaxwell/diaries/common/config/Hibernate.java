package com.rsmaxwell.diaries.common.config;

import lombok.Data;

@Data
public class Hibernate {

	private String dialect;
	private Boolean show_sql;
	private Boolean format_sql;
	private String hbm2ddl_auto;
	private Boolean connection_autocommit;
	private Boolean connection_provider_disables_autocommit;
}
