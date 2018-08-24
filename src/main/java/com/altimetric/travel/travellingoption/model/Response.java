package src.main.java.com.altimetric.travel.travellingoption.model;

public class Response {
	
	public TripOption fastest;
	public TripOption cheapest;
	public TripOption mostComfortable;

	Response(){
		
	}
	
	Response(TripOption fastest, TripOption cheapest,TripOption mostComfortable){
		this.fastest = fastest;
		this.cheapest = cheapest;
		this.mostComfortable = mostComfortable;
	}
	
}
