package com.neutti.vo;

import lombok.Data;

@Data
public class WmsVO {
	private String key;
	private String layer;
	private String style;
	private String tilematrixset;
	private String service;
	private String request;
	private String version;
	private String format;
	private String tileMatrix;
	private String tileCol;
	private String tileRow;
}
