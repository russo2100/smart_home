package ru.netology.radio;


public class Radio {

    private int currentStation;
    private int currentVolume;

    public void shouldIncreaseVolume() {
        int maxVolume = 10;
        if (currentVolume == maxVolume) {
            return;
        }
        ++currentVolume;
    }

    public void shouldDecreaseVolume() {
        int minVolume = 0;
        if (currentVolume == minVolume) {
            return;
        }
        --currentVolume;
    }

    public void shouldIncreaseStation() {
        int maxStation = 9;
        int minStation = 0;
        if (currentStation == maxStation) {
            currentStation = minStation;
            return;
        }
        ++currentStation;
    }

    public void shouldDecreaseStation() {
        int maxStation = 9;
        int minStation = 0;
        if (currentStation == minStation) {
            currentStation = maxStation;
            return;
        }
        --currentStation;
    }

    public int getCurrentStation() {
        return currentStation;
    }


    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentStation(int currentStation) {
        int maxStation = 9;
        int minStation = 0;
        if (currentStation > maxStation || currentStation < minStation) {
            this.currentStation = minStation;
            return;
        }
        this.currentStation = currentStation;
    }

    public void setCurrentVolume(int currentVolume) {
        int maxVolume = 10;
        int minVolume = 0;
        if (currentVolume > maxVolume || currentVolume < minVolume) {
            this.currentVolume = minVolume;
            return;
        }

        this.currentVolume = currentVolume;
    }
}