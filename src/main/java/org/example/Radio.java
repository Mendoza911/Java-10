package org.example;

public class Radio {

    private int currentChannel = 0;
    private int currentVolume = 0;
    private int amountChannels = 10;

    public Radio(int amountChannels) {
        this.amountChannels = amountChannels;
    }

    public Radio() {
    }

    public void setCurrentChannel(int newCurrentChannel) {
        if (newCurrentChannel >= amountChannels) {
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
        if (currentChannel >= amountChannels) {
            currentChannel = 0;
        }
    }

    public void prev() {
        currentChannel--;
        if (currentChannel < 0) {
            currentChannel = amountChannels - 1;
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


