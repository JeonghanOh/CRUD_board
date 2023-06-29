package com.example.test.entity;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

import com.example.test.dto.BoardDto;

@Entity
public class boardtbl {
	@Id
	private int boardId;
	private String boardTitle;
	private String boardContent;
	private String boardImgpath;
	private String userEmail;
	private Date boardDate;
	private int boardViews;
	private int boardLike;
	
	public boardtbl() {
		
	}
	
	public boardtbl(BoardDto boardDto) {
		this.boardId = boardDto.getBoardId();
		this.boardTitle = boardDto.getBoardTitle();
		this.boardContent = boardDto.getBoardContent();
		this.boardImgpath = boardDto.getBoardImgpath();
		this.userEmail = boardDto.getUserEmail();
		this.boardDate = boardDto.getBoardDate();
		this.boardViews = boardDto.getBoardViews();
		this.boardLike = boardDto.getBoardLike();
	}
}
