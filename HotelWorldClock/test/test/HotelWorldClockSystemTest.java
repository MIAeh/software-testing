package test;

import static org.junit.jupiter.api.Assertions.*;
import hotelClock.*;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

/**
 * Created by Ed_Strickland on 2018/10/10.
 */
class HotelWorldClockSystemTest {
    private HotelWorldClockSystem system;
    private PhoneClock phone;
    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        ArrayList<CityClock> clocks = new ArrayList<CityClock>();
        this.system = new HotelWorldClockSystem(0, clocks);
        this.phone = new PhoneClock(8, this.system);
    }
    @Test
    public void london_clock_should_be_3_am_after_phone_changed_to_11am() {
        CityClock londonClock = new CityClock(0, "London");
        system.attach(londonClock);
        phone.setTime(11);
        assertEquals(3, londonClock.getLocalTime());

    }

    @Test
    public void newyork_clock_should_be_22pm_am_after_phone_changed_to_11am() {
        CityClock newyorkClock = new CityClock(-5, "NewYork");
        system.attach(newyorkClock);
        phone.setTime(11);
        assertEquals(22, newyorkClock.getLocalTime());
    }

    @Test
    public void moscow_clock_should_be_7_am_after_phone_changed_to_11am() {
        CityClock moscowClock = new CityClock(4, "Moscow");
        system.attach(moscowClock);
        phone.setTime(11);
        assertEquals(7, moscowClock.getLocalTime());
    }

    @Test
    public void sydney_clock_should_be_17_pm_after_phone_changed_to_11am() {
        CityClock sydneyClock = new CityClock(10, "Sydney");
        system.attach(sydneyClock);
        phone.setTime(11);
        assertEquals(13, sydneyClock.getLocalTime());
    }

    @Test
    public void beijing_clock_should_be_11_am_after_phone_changed_to_11am() {
        CityClock beijingClock = new CityClock(8, "Beijing");
        system.attach(beijingClock);
        phone.setTime(11);
        assertEquals(11, beijingClock.getLocalTime());
    }


}