package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {

    @Test
    public void shouldSetStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(5);
        int expected = 5;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldSetToMaxVolume() {
        Radio radio = new Radio();
        radio.getMaxVolume();
        int expected = 100;
        int actual = radio.getMaxVolume();
        Assertions.assertEquals(expected,actual);
    }
    @Test
    public void shouldSetToMinVolume() {
        Radio radio = new Radio();
        radio.getMinVolume();
        int expected = 0;
        int actual = radio.getMinVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetToMaxRadiostation() {
        Radio radio = new Radio();
        radio.getMaxRadioStation();
        int expected = 9;
        int actual = radio.getMaxRadioStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetToMinRadiostation() {
        Radio radio = new Radio();
        radio.getMinRadioStation();
        int expected = 0;
        int actual = radio.getMinRadioStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldNotSetVolumeAboveMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(101);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolumeOnOne() {
        Radio radio = new Radio();
        radio.setCurrentVolume(99);
        radio.increaseVolume();
        int expected = 100;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolumeOnOne() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        radio.belowVolumeToMax();
        int expected = 99;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void stationOfMaxBorder() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        radio.increaseStation();
        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void stationBelowMax() {
        Radio radio = new Radio();
        radio.setCurrentStation(2);
        radio.increaseStation();
        int expected = 3;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void ifCurrentStationLessThanZero() {
        Radio radiostation = new Radio();
        radiostation.setCurrentStation(-1);
        int expected = 0;
        int actual = radiostation.getCurrentStation();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void ifCurrentStationMoreThanNine() {
        Radio radio = new Radio();
        radio.setCurrentStation(11);
        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void buttonPrevStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(2);
        radio.prevStation();
        int expected = 1;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void buttonPrevFromZero() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        radio.prevStation();
        int expected = 9;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void stationOfLowerBorder() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        radio.increaseStation();
        int expected = 1;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void stationMax() {
        Radio radio = new Radio();
        radio.setToMaxStation();
        int expected = 9;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void ifCurrentVolumeLessThanZero() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void ifCurrentVolumeMoreThanTen() {
        Radio radio = new Radio();
        radio.setCurrentVolume(12);
        int expected = 12;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void volumeMax() {
        Radio radio = new Radio();
        radio.setToMaxVolume();
        int expected = 10;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void buttonVolumeBelowMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        radio.increaseVolume();
        int expected = 100;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void buttonPrevVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(4);
        radio.belowVolumeToMax();
        int expected = 3;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void buttonPrevVolumeFromZero() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.belowVolumeToMax();
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void buttonPrevVolumeFromLowerBorder() {
        Radio radio = new Radio();
        radio.setCurrentVolume(1);
        radio.belowVolumeToMax();
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void buttonPrevVolumeFromUpperBorder() {
        Radio radio = new Radio();
        radio.setCurrentVolume(10);
        radio.belowVolumeToMax();
        int expected = 9;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }


}