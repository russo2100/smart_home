package ru.netology.radio;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadioTest {


    Radio radio = new Radio();

    @Test
    public void shouldSetStation() {
        radio.setCurrentStation(9);
        assertEquals(9, radio.getCurrentStation());
    }

    @Test
    public void shouldNotSetStationOverMax() {
        radio.setCurrentStation(12);
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void shouldNotSetStationUnderMin() {
        radio.setCurrentStation(-12);
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void shouldIncreaseStation() {
        radio.setCurrentStation(8);
        radio.shouldIncreaseStation();
        assertEquals(9, radio.getCurrentStation());
    }

    @Test
    public void shouldIncreaseStation0() {
        radio.setCurrentStation(9);
        radio.shouldIncreaseStation();
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void shouldDecreaseStation() {
        radio.setCurrentStation(1);
        radio.shouldDecreaseStation();
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void shouldDecreaseStationWhenCurrent0() {
        radio.shouldDecreaseStation();
        assertEquals(9, radio.getCurrentStation());
    }

    @Test
    public void shouldNotDecreaseVolume0() {
        radio.shouldDecreaseVolume();
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void shouldDecreaseVolume() {
        radio.setCurrentVolume(1);
        radio.shouldDecreaseVolume();
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void shouldIncreaseVolume() {
        radio.setCurrentVolume(9);
        radio.shouldIncreaseVolume();
        assertEquals(10, radio.getCurrentVolume());
    }

    @Test
    public void shouldNotIncreaseVolume() {
        radio.setCurrentVolume(10);
        radio.shouldIncreaseVolume();
        assertEquals(10, radio.getCurrentVolume());
    }

    @Test
    public void shouldNotSetVolumeUnderMinimum() {
        radio.setCurrentVolume(-11);
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void shouldNotSetVolumeOverMaximum() {
        radio.setCurrentVolume(11);
        assertEquals(0, radio.getCurrentVolume());
    }
}
