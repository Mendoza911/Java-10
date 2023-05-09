package org.example;

public class Radio {

    private int currentChannel = 0;
    private int currentVolume = 0;

    public void setCurrentChannel(int newCurrentChannel) {
        if (newCurrentChannel > 9) {
            return;
        }
        if (newCurrentChannel < 0) {
            return;
        }
        currentChannel = newCurrentChannel;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume > 100) {
            return;
        }
        if (newCurrentVolume < 0) {
            return;
        }
        currentVolume = newCurrentVolume;
    }



    public int getCurrentChannel() {
        return currentChannel;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void next() {
        currentChannel++;
        if (currentChannel > 9) {
            currentChannel = 0;
        }
    }

    public void prev() {
        currentChannel--;
        if (currentChannel < 0) {
            currentChannel = 9;
        }
    }

    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume++;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume--;
        }
    }
}


