package com.tns.abstractionprogram;

abstract class Series{
	abstract void tvseries(String name);
}

class SeriesGenure extends Series{

	@Override
	void tvseries(String name) {
		String seriesname = "East place";
		System.out.println("Loading the series...");
		System.out.println("Series name.." + seriesname);
		System.out.println("genre of sewries : " + name);
		
	}
	
}

public class Webseries {
public static void main(String[] args) {
	SeriesGenure seriesGenure = new SeriesGenure();
	seriesGenure.tvseries("crime");
}
}
