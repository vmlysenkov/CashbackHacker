package ru.netology.unit;

import org.junit.Test;

import static org.junit.Assert.*;

public class CashbackHackerTestJU4 {

    @Test
    public void shouldCalculateRemainTo1000() {
        CashbackHacker service = new CashbackHacker();

        int amount = 900;

        int actual = service.remain(amount);
        int expected = 100;

        assertEquals(expected, actual);
    }
}