import org.example.Radio;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldSetNextRadioChannel() {
        Radio radio = new Radio();
        radio.setCurrentChannel(8);

        radio.next();

        int expected = 9;
        int actual = radio.getCurrentChannel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetFirstRadioChannel() {
        Radio radio = new Radio();
        radio.setCurrentChannel(9);

        radio.next();

        int expected = 0;
        int actual = radio.getCurrentChannel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPrevRadioChannel() {
        Radio radio = new Radio();
        radio.setCurrentChannel(2);

        radio.prev();

        int expected = 1;
        int actual = radio.getCurrentChannel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetLastRadioChannel() {
        Radio radio = new Radio();
        radio.setCurrentChannel(0);

        radio.prev();

        int expected = 9;
        int actual = radio.getCurrentChannel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldtSetAfterLastRadioChannel() {
        Radio radio = new Radio();
        radio.setCurrentChannel(10);

        int expected = 0;
        int actual = radio.getCurrentChannel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldtSetBeforeFirstRadioChannel() {
        Radio radio = new Radio();
        radio.setCurrentChannel(-1);

        int expected = 0;
        int actual = radio.getCurrentChannel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldtSetRadioChannel() {
        Radio radio = new Radio();
        radio.setCurrentChannel(20);

        int expected = 0;
        int actual = radio.getCurrentChannel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(15);

        radio.increaseVolume();

        int expected = 16;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(15);

        radio.decreaseVolume();

        int expected = 14;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldtChangeVolumeFirstCase() {
        Radio radio = new Radio();
        radio.setCurrentVolume(50);

        int expected = 50;
        radio.setCurrentVolume(-1);
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldtChangeVolumeSecondCase() {
        Radio radio = new Radio();
        radio.setCurrentVolume(101);

        int expected = radio.getCurrentVolume();
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
        radio.setCurrentVolume(101);
        actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldGreaterThanMaxVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);

        radio.increaseVolume();

        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldLowerThanMinVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);

        radio.decreaseVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
}
