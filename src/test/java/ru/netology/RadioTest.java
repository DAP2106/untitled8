
package ru.netology;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadioTest {


    Radio RadioFm = new Radio();

    //тестируем станции
    @Test
    public void shouldGetCurrentStation() {
        RadioFm.setCurrentStation(0);
        RadioFm.setCurrentStation(-1);
        RadioFm.setCurrentStation(11);
        Assertions.assertEquals(0, RadioFm.getCurrentStation());
    }

    @Test
    public void shouldPressNextStation() {
        RadioFm.setCurrentStation(0);
        RadioFm.pressNextStation();
        Assertions.assertEquals(1, RadioFm.getCurrentStation());
        RadioFm.setCurrentStation(10);
        RadioFm.pressNextStation();
        Assertions.assertEquals(0, RadioFm.getCurrentStation());
        RadioFm.setCurrentStation(-1);
        RadioFm.pressNextStation();
        Assertions.assertEquals(0, RadioFm.getCurrentStation());
        RadioFm.setCurrentStation(11);
        RadioFm.pressNextStation();
        Assertions.assertEquals(1, RadioFm.getCurrentStation());
    }

    @Test
    public void shouldPressPrevStation() {
        RadioFm.setCurrentStation(0);
        RadioFm.pressPrevStation();
        Assertions.assertEquals(10, RadioFm.getCurrentStation());
        RadioFm.setCurrentStation(10);
        RadioFm.pressPrevStation();
        Assertions.assertEquals(9, RadioFm.getCurrentStation());
    }

    @Test
    public void shouldGetToMaxStation() {
        Assertions.assertEquals(10, RadioFm.getMaxRadioStation());
    }

    @Test
    public void shouldSetMaxStation() {
        RadioFm.setMaxRadioStation(-1);
        RadioFm.setMaxRadioStation(0);
        RadioFm.setMaxRadioStation(11);
        Assertions.assertEquals(11, RadioFm.getMaxRadioStation());
    }

    @Test
    public void shouldGetToMinStation() {
        Assertions.assertEquals(0, RadioFm.getMinRadioStation());
    }

    @Test
    public void shouldSetMinStation() {
        RadioFm.setMinRadioStation(-1);
        RadioFm.setMinRadioStation(0);
        RadioFm.setMinRadioStation(11);
        Assertions.assertEquals(11, RadioFm.getMinRadioStation());
    }

    //тестируем громкость
    @Test
    public void shouldSetCurrentVolume() {
        RadioFm.setCurrentVolume(101);
        Assertions.assertEquals(0, RadioFm.getCurrentVolume());
        RadioFm.setCurrentVolume(-1);
        Assertions.assertEquals(100, RadioFm.getCurrentVolume());
        RadioFm.setCurrentVolume(8);
        Assertions.assertEquals(8, RadioFm.getCurrentVolume());
    }

    @Test
    public void shouldGetMinVolume() {
        Assertions.assertEquals(0, RadioFm.getMinVolume());
    }

    @Test
    public void shouldGetMaxVolume() {
        Assertions.assertEquals(100, RadioFm.getMaxVolume());
    }

    @Test
    public void shouldSetMinVolume() {
        RadioFm.setMaxVolume(100);
        RadioFm.setMinVolume(1);
        Assertions.assertEquals(1, RadioFm.getMinVolume());
    }

    @Test
    public void shouldSetMaxVolume() {
        RadioFm.setMinVolume(1);
        RadioFm.setMaxVolume(101);
        Assertions.assertEquals(101, RadioFm.getMaxVolume());
    }

    @Test
    public void shouldPressVolumeUp() {
        RadioFm.setCurrentVolume(4);
        RadioFm.pressVolumeUp();
        Assertions.assertEquals(5, RadioFm.getCurrentVolume());
        RadioFm.setCurrentVolume(100);
        RadioFm.pressVolumeUp();
        Assertions.assertEquals(0, RadioFm.getCurrentVolume());
    }

    @Test
    public void shouldPressVolumeDown() {
        RadioFm.setCurrentVolume(4);
        RadioFm.pressVolumeDown();
        assertEquals(3, RadioFm.getCurrentVolume());
        RadioFm.setCurrentVolume(0);
        RadioFm.pressVolumeDown();
        Assertions.assertEquals(100, RadioFm.getCurrentVolume());
    }

    //тестируем  количество радиостанций
    @Test
    public void shouldCreateStationsWithLimits() {
        Radio radio = new Radio(1);
        assertEquals(0, radio.getMaxRadioStation());

        Radio radio1 = new Radio(100);
        assertEquals(99, radio1.getMaxRadioStation());

        Radio radio2 = new Radio(10);
        assertEquals(0, radio2.getMinRadioStation());
    }
}
