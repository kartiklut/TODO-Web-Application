package com.entities;

import java.util.Date;

public class Todo {

	private Date date;
	private String todoTitle;
	private String todoContent;
	public Todo(Date date, String todoTitle, String todoContent) {
		super();
		this.date = date;
		this.todoTitle = todoTitle;
		this.todoContent = todoContent;
	}
	public Todo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getTodoTitle() {
		return todoTitle;
	}
	public void setTodoTitle(String todoTitle) {
		this.todoTitle = todoTitle;
	}
	public String getTodoContent() {
		return todoContent;
	}
	public void setTodoContent(String todoContent) {
		this.todoContent = todoContent;
	}
	@Override
	public String toString() {
		return this.getTodoTitle()+" : "+this.getTodoContent();
	}
	
	
}
