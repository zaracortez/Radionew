package ru.netology;

public class Radiostation {
    private int minRadioStation = 0;
    private int maxRadioStation = 9;
    private int minVolume = 0;
    private int maxVolume = 100;
    private int currentStation = minRadioStation;
    private int currentVolume = minVolume;
    private int stationAmount;

    public Radiostation() {
        stationAmount = 10;
    }
    public Radiostation(int stationAmount) {
        this.stationAmount = stationAmount;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public int getMinRadioStation() {
        return minRadioStation;
    }

    public int getMaxRadioStation() {
        return maxRadioStation;
    }

    public int getMinVolume() {
        return minVolume;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation < minRadioStation) {
            return;
        }
        if (newCurrentStation > stationAmount - 1) {
            return;
        }
        currentStation = newCurrentStation;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < minVolume) {
            return;
        }
        if (newCurrentVolume > maxVolume) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void setToMaxStation() {
        currentStation = 9;
    }

    public void setToMaxVolume() {
        currentVolume = 10;
    }

    public void increaseStation() {
        if (currentStation < stationAmount - 1) {
            currentStation = currentStation + 1;
        } else {
            currentStation = minRadioStation;
        }
    }


    public void increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume++;
        }

    }


    public void prevStation() {
        if (currentStation == minRadioStation) {
            currentStation = stationAmount - 1;
        } else {
            currentStation--;

        }
    }


    public void belowVolumeToMax() {
        if (currentVolume <= minVolume) {
            currentVolume = 0;
        } else {
            currentVolume = currentVolume - 1;
        }
    }
}
