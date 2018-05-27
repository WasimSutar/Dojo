package com.nextgen.nextgenairlines;

public class Request {

	private String corpName;
	private int startTime;
	private int duration;
	private int price;
	private int endTime;
	
	
	public Request(String corpName, int startTime, int duration, int price) {
		super();
		this.corpName = corpName;
		this.startTime = startTime;
		this.duration = duration;
		this.price = price;
		this.endTime=startTime+duration;
	}
	public String getCorpName() {
		return corpName;
	}
	public void setCorpName(String corpName) {
		this.corpName = corpName;
	}
	public int getStartTime() {
		return startTime;
	}
	public void setStartTime(int startTime) {
		this.startTime = startTime;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
		setEndTime();
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getEndTime() {
		return endTime;
	}
	private void setEndTime() {
		this.endTime = this.startTime+this.duration;
	}
	
	
	
}
