package hotelClock;

/**
 * Created by Mia on 2018/10/4.
 */
public class CityClock extends Clock {
    private int utcZeroTime;
    private String cityName;

    public CityClock(int offset, String cityName) {
        super(offset);
        this.cityName = cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getCityName() {
        return cityName;
    }

    public int getTime() {
        return (utcZeroTime + utcOffset + 24) % 24;
    }
    
    public void setUtcZeroTime(int utcZeroTime) {
        this.utcZeroTime = utcZeroTime;
        this.localTime = utcZeroTime + this.utcOffset;
    }
}
