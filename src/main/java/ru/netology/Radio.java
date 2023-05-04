package ru.netology;

public class Radio {
    private int currentStation = 10;
    private int maxRadioStation = 10;
    private int minRadioStation = 0;
    private int currentVolume;
    private int maxVolume = 100;
    private int minVolume = 0;


    public Radio() {
    }

    public Radio(int currentStation) {
        this.currentStation = currentStation;
        maxRadioStation = currentStation - 1;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation > maxRadioStation) {
            currentStation = minRadioStation;
        }
        if (currentStation < minRadioStation) {
            currentStation = maxRadioStation;
        }
        this.currentStation = currentStation;
    }

    public void pressNextStation() {
        if (currentStation >= maxRadioStation) {
            setCurrentStation(minRadioStation);
        } else {
            setCurrentStation(currentStation + 1);
        }
    }

    public void pressPrevStation() {
        if (currentStation <= minRadioStation) {
            setCurrentStation(maxRadioStation);
        } else {
            setCurrentStation(currentStation - 1);
        }
    }

    public int getMaxRadioStation() {
        return maxRadioStation;
    }

    public void setMaxRadioStation(int maxRadioStation) {
        this.maxRadioStation = maxRadioStation;
    }

    public int getMinRadioStation() {
        return minRadioStation;
    }

    public void setMinRadioStation(int minRadioStation) {
        this.minRadioStation = minRadioStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > maxVolume) {
            currentVolume = minVolume;
        }
        if (currentVolume < minVolume) {
            currentVolume = maxVolume;
        }
        this.currentVolume = currentVolume;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public void setMaxVolume(int maxVolume) {
        this.maxVolume = maxVolume;
    }

    public int getMinVolume() {
        return minVolume;
    }

    public void setMinVolume(int minVolume) {
        this.minVolume = minVolume;
    }

    public void pressVolumeUp() {
        setCurrentVolume(currentVolume + 1);
    }

    public void pressVolumeDown() {
        setCurrentVolume(currentVolume - 1);
    }

}


