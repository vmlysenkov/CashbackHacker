package ru.netology.unit;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackerTestNG {

    @Test
    public void shouldCalculateRemainTo1000() {

        CashbackHacker service = new CashbackHacker();

        int amount = 900;

        int actual = service.remain(amount);
        int expected = 100;

        assertEquals(actual, expected);
    }
    @Test
    public void shouldCalculateRemain() {

        CashbackHacker service = new CashbackHacker();

        int amount = 1000;

        int actual = service.remain(amount);
        int expected = 0;

        assertEquals(actual, expected);
    }
}