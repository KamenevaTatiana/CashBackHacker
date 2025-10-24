package ru.netology.service;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CashbackHackServiceTest {

    @Test
    public void shouldAdvise100IfAmount900() {
        CashbackHackService service = new CashbackHackService();

        int amount = 900;

        int actual = service.remain(amount);
        int expected = 100;

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void shouldAdvise0IfAmount1000() {
        CashbackHackService service = new CashbackHackService();

        int amount = 1000;

        int actual = service.remain(amount);
        int expected = 0;

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void shouldAdvise1000IfAmount0() {
        CashbackHackService service = new CashbackHackService();

        int amount = 0;

        int actual = service.remain(amount);
        int expected = 1000;

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void shouldAdvise500IfAmount1500() {
        CashbackHackService service = new CashbackHackService();

        int amount = 1500;

        int actual = service.remain(amount);
        int expected = 500;

        Assert.assertEquals(actual, expected);
    }
}
