package ru.netology;

import static org.testng.Assert.assertEquals;

public class CashBackHackerJUnit4Test {
    @org.junit.Test
    public void testRemain() {
        CashBackHackerTest service = new CashBackHackerTest();
        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 0;
        assertEquals(actual, expected);
    }

    @org.junit.Test
    public void testRemainCashback() {

        CashBackHackerTest service = new CashBackHackerTest();
        int amount = 900;
        int actual = service.remain(amount);
        int expected = 100;
        assertEquals(actual, expected);
    }

    @org.junit.Test
    public void testRemainMoreCashback() {
        CashBackHackerTest service = new CashBackHackerTest();
        int amount = 1100;
        int actual = service.remain(amount);
        int expected = -100;
        assertEquals(actual, expected);
    }

    @org.junit.Test
    public void testRemainSmoothCashback() {
        CashBackHackerTest service = new CashBackHackerTest();
        int amount = 500;
        int actual = service.remain(amount);
        int expected = 500;
        assertEquals(actual, expected);
    }

    private int remain(int amount) {
        return 0;
    }
}

