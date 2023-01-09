package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadiostationTest {
    @Test
    public void shouldSetStation() {
        Radiostation radiostation = new Radiostation();
        radiostation.setCurrentStation(5);
        int expected = 5;
        int actual = radiostation.getCurrentStation();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldSetToMaxVolume() {
        Radiostation radiostation = new Radiostation();
        radiostation.getMaxVolume();
        int expected = 100;
        int actual = radiostation.getMaxVolume();
        Assertions.assertEquals(expected,actual);
    }
    @Test
    public void shouldSetToMinVolume() {
        Radiostation radiostation = new Radiostation();
        radiostation.getMinVolume();
        int expected = 0;
        int actual = radiostation.getMinVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetToMaxRadiostation() {
        Radiostation radiostation = new Radiostation();
        radiostation.getMaxRadioStation();
        int expected = 9;
        int actual = radiostation.getMaxRadioStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetToMinRadiostation() {
        Radiostation radiostation = new Radiostation();
        radiostation.getMinRadioStation();
        int expected = 0;
        int actual = radiostation.getMinRadioStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldNotSetVolumeAboveMax() {
        Radiostation radiostation = new Radiostation();
        radiostation.setCurrentVolume(101);
        int expected = 0;
        int actual = radiostation.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolumeOnOne() {
        Radiostation radiostation = new Radiostation();
        radiostation.setCurrentVolume(99);
        radiostation.increaseVolume();
        int expected = 100;
        int actual = radiostation.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolumeOnOne() {
        Radiostation radiostation = new Radiostation();
        radiostation.setCurrentVolume(100);
        radiostation.belowVolumeToMax();
        int expected = 99;
        int actual = radiostation.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void stationOfMaxBorder() {
        Radiostation radiostation = new Radiostation();
        radiostation.setCurrentStation(9);
        radiostation.increaseStation();
        int expected = 0;
        int actual = radiostation.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void stationBelowMax() {
        Radiostation radiostation = new Radiostation();
        radiostation.setCurrentStation(2);
        radiostation.increaseStation();
        int expected = 3;
        int actual = radiostation.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void ifCurrentStationLessThanZero() {
        Radiostation radiostation = new Radiostation();
        radiostation.setCurrentStation(-1);
        int expected = 0;
        int actual = radiostation.getCurrentStation();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void ifCurrentStationMoreThanNine() {
        Radiostation radiostation = new Radiostation();
        radiostation.setCurrentStation(11);
        int expected = 0;
        int actual = radiostation.getCurrentStation();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void buttonPrevStation() {
        Radiostation radiostation = new Radiostation();
        radiostation.setCurrentStation(2);
        radiostation.prevStation();
        int expected = 1;
        int actual = radiostation.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void buttonPrevFromZero() {
        Radiostation radiostation = new Radiostation();
        radiostation.setCurrentStation(0);
        radiostation.prevStation();
        int expected = 9;
        int actual = radiostation.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void stationOfLowerBorder() {
        Radiostation radiostation = new Radiostation();
        radiostation.setCurrentStation(0);
        radiostation.increaseStation();
        int expected = 1;
        int actual = radiostation.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void stationMax() {
        Radiostation radiostation = new Radiostation();
        radiostation.setToMaxStation();
        int expected = 9;
        int actual = radiostation.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void ifCurrentVolumeLessThanZero() {
        Radiostation radiostation = new Radiostation();
        radiostation.setCurrentVolume(-1);
        int expected = 0;
        int actual = radiostation.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void ifCurrentVolumeMoreThanTen() {
        Radiostation radiostation = new Radiostation();
        radiostation.setCurrentVolume(12);
        int expected = 12;
        int actual = radiostation.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void volumeMax() {
        Radiostation radiostation = new Radiostation();
        radiostation.setToMaxVolume();
        int expected = 10;
        int actual = radiostation.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void buttonVolumeBelowMax() {
        Radiostation radiostation = new Radiostation();
        radiostation.setCurrentVolume(100);
        radiostation.increaseVolume();
        int expected = 100;
        int actual = radiostation.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void buttonPrevVolume() {
        Radiostation radiostation = new Radiostation();
        radiostation.setCurrentVolume(4);
        radiostation.belowVolumeToMax();
        int expected = 3;
        int actual = radiostation.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void buttonPrevVolumeFromZero() {
        Radiostation radiostation = new Radiostation();
        radiostation.setCurrentVolume(0);
        radiostation.belowVolumeToMax();
        int expected = 0;
        int actual = radiostation.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void buttonPrevVolumeFromLowerBorder() {
        Radiostation radiostation = new Radiostation();
        radiostation.setCurrentVolume(1);
        radiostation.belowVolumeToMax();
        int expected = 0;
        int actual = radiostation.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void buttonPrevVolumeFromUpperBorder() {
        Radiostation radiostation = new Radiostation();
        radiostation.setCurrentVolume(10);
        radiostation.belowVolumeToMax();
        int expected = 9;
        int actual = radiostation.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

}
