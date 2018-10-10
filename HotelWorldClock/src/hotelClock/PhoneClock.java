package hotelClock;

/**
 * Created by Mia on 2018/10/4.
 */
public class PhoneClock extends Clock {
	HotelWorldClockSystem hotelWorldClockSystem;

	public PhoneClock(int offset, HotelWorldClockSystem hotelWorldClockSystem) {
		super(offset);
		this.hotelWorldClockSystem = hotelWorldClockSystem;
	}

	public int getTime() {
		return (localTime + 24) % 24;
	}

	public void setTime(int time) {
		this.localTime = time;
		this.hotelWorldClockSystem.setUtcZeroTime((time - this.utcOffset) % 24);
	}
	
	public void setHotelWorldClockSystem(HotelWorldClockSystem hotelWorldClockSystem) {
		this.hotelWorldClockSystem = hotelWorldClockSystem;
	}
    
}
