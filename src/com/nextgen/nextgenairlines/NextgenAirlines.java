package com.nextgen.nextgenairlines;

import java.util.List;

public class NextgenAirlines {
	
	private Flight flight = new Flight(0, 0);

	/*public int getPrice(List<Request> requestList){
		int sum = 0;
		if(requestList != null){		
			for(Request requestData :requestList){
				if(flight.getBookingTill() <= requestData.getStartTime()){
					flight.setBookingTill(requestData.getEndTime());
					sum+=requestData.getPrice();
				}

			}
		}

		return sum;
	}*/
	
	public int getPrice(List<Request> requestList){
		if(requestList == null || requestList.isEmpty()) 
			return 0;
		
		int len = requestList.size();
		int temp [] = new int[len];
		temp[0] = requestList.get(0).getPrice();
		for (int i = 1; i < requestList.size(); i++) {
			temp[i] = Math.max(temp[i-1], requestList.get(i).getPrice());
			for(int j = i -1 ; j >= 0 ; j--){
				if(requestList.get(i).getStartTime() >= requestList.get(j).getEndTime()){
					temp[i] = Math.max(temp[i], requestList.get(i).getPrice() + temp[j]);
					break;
				}
			}
		}
		return temp[len-1];
	}
}
