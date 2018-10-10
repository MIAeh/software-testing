package hotelClock;

import hotelClock.CityClock;

import java.util.ArrayList;
import java.util.List;

public class HotelWorldClockSystem {
	private int utcZeroTime;
	private ArrayList<CityClock> clocks;

	public HotelWorldClockSystem(int utcZeroTime, ArrayList<CityClock> clocks) {
		this.utcZeroTime = utcZeroTime;
		this.clocks = clocks;
	}

	public void attach(CityClock cityClock) {
		clocks.add(cityClock);
	}

	public int getUtcZeroTime() {
		return utcZeroTime;
	}

	public List<CityClock> getClocks() {
		return clocks;
	}

	public void setUtcZeroTime(int utcZeroTime) {
		this.utcZeroTime = utcZeroTime;
		for(CityClock clock : clocks) {
			clock.setUtcZeroTime(utcZeroTime);
		}
	}
}
