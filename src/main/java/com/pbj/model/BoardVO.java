package com.pbj.model;

import java.sql.Date;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
@ToString
public class BoardVO {
	
	private int bno;
	
	private String title;
	
	private String content;
	
	private String writer;
	
	private Date regdate;
	
	private Date updatedate;
	

}
