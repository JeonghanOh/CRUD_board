package com.example.test.dto;

import java.sql.Date;

import lombok.Data;

@Data
public class BoardDto {
	private int boardId;
	private String boardTitle;
	private String boardContent;
	private String boardImgpath;
	private String userEmail;
	private Date boardDate;
	private int boardViews;
	private int boardLike;
}
