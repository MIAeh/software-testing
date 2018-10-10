package hotelClock;

public class Clock {
	protected int utcOffset;
	protected int localTime;
	
	public Clock(int offset) {
		this.utcOffset = offset;
	}
	
	public int getLocalTime() {
		return (localTime + 24) % 24;
	}
}
