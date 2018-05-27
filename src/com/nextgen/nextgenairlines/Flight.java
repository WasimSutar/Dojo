package com.nextgen.nextgenairlines;

public class Flight {
	
	private int bookingFrom;
	
	private int bookingTill;

	public int getBookingFrom() {
		return bookingFrom;
	}
	
	public Flight(int bookingFrom, int bookingTill) {
		super();
		this.bookingFrom = bookingFrom;
		this.bookingTill = bookingTill;
	}

	public void setBookingFrom(int bookingFrom) {
		this.bookingFrom = bookingFrom;
	}

	public int getBookingTill() {
		return bookingTill;
	}

	public void setBookingTill(int bookingTill) {
		this.bookingTill = bookingTill;
	}
}
