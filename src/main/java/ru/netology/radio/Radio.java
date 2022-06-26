package ru.netology.radio;


public class Radio {



    private int maxStation = 10;
    private int minStation = 0;
    private int maxVolume = 100;
    private int minVolume = 0;
    private int currentVolume = minVolume;
    private int currentStation = minStation;

    public Radio() {
        this.minStation = minStation;
        this.maxStation = maxStation;
        this.minVolume = minVolume;
        this.maxVolume = maxVolume;
    }


    public int getMaxVolume() {

        return maxVolume;
    }


    public int getMinVolume() {

        return minVolume;
    }


    public int getCurrentStation() {

        return currentStation;
    }

    public void setCountStation(int maxStation) {
        if (1 > maxStation) {
            return;
        }

        this.maxStation = maxStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation > maxStation) {
            return;
        }
        if (currentStation < minStation) {
            return;
        }
        this.currentStation = currentStation;
    }

    public void setNextStation() {
        if (currentStation == maxStation) {      // Круговая зависимость. После 9 будет номер 0
            currentStation = minStation;
            return;
        }
        currentStation += 1;
    }

    public void setPrevStation() {
        if (currentStation == minStation) {      // Круговая зависимость. После 9 будет номер 0
            currentStation = maxStation;
            return;
        }
        currentStation -= 1;
    }

    public int getMaxStation() {

        return maxStation;
    }


    public int getMinStation() {

        return minStation;
    }


    public int getCurrentVolume() {

        return currentVolume;
    }

    public void setIncreaseVolume() {

        if (currentVolume == maxVolume) {
            return;
        }
        currentVolume += 1;
    }

    public void setDecreaseVolume() {

        if (currentVolume == minVolume) {
            return;
        }
        currentVolume -= 1;
    }

    public void setVolume(int currentVolume) {

        if (currentVolume < minVolume) {
            return;
        }
        if (currentVolume > maxVolume) {
            return;
        }
        this.currentVolume = currentVolume;
    }
}
