package com.rsmaxwell.diaries.common.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Image {

	public static final String TABLE_NAME = "image";

	private String path;

}
