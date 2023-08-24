package ru.netology;

import static org.testng.Assert.assertEquals;

public class CashBackHackerTest {
    @org.testng.annotations.Test
    public void testRemain() {
        CashBackHackerTest service = new CashBackHackerTest();
        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 0;
        assertEquals(expected,actual);
    }

    @org.testng.annotations.Test
    public void testRemainCashback() {

        CashBackHackerTest service = new CashBackHackerTest();
        int amount = 900;
        int actual = service.remain(amount);
        int expected = 100;
        assertEquals(expected,actual);
    }

    @org.testng.annotations.Test
    public void testRemainMoreCashback() {
        CashBackHackerTest service = new CashBackHackerTest();
        int amount = 1100;
        int actual = service.remain(amount);
        int expected = -100;
        assertEquals(expected,actual);
    }

    @org.testng.annotations.Test
    public void testRemainSmoothCashback() {
        CashBackHackerTest service = new CashBackHackerTest();
        int amount = 500;
        int actual = service.remain(amount);
        int expected = 500;
        assertEquals(expected,actual);
    }

    int remain(int amount) {
        return 0;
    }
}











