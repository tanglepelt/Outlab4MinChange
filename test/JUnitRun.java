
/*
 *Brittany Couts, Gabby Strong, Brock Lehnen
 *4/20/2018
 *
 *This is the tester
*/

import minchange.outlab4.CoinChanging;
import org.junit.Assert;
import static org.junit.Assert.assertEquals;
import org.junit.Test;


public class JUnitRun 
{ 
    int[] UScoins = { 1, 5, 10, 25 };
    //test one test coins 42
    @Test //(expected = IllegalArgumentException.class)
    public void test1()
    {
        int[] expected = {1,1,5,10,25};
        int coins = 42;
        Assert.assertArrayEquals(expected,CoinChanging.run(UScoins,coins));
    }
    //test with 50 cents
    @Test //(expected = IllegalArgumentException.class)
    public void test2()
    {
        int[] expected = {25,25};
        int coins = 50;
        Assert.assertArrayEquals(expected,CoinChanging.run(UScoins,coins));
    } 
    //test of 5
    @Test //(expected = IllegalArgumentException.class)
    public void test3()
    {
        int[] expected = {5};
        int coins = 5;
        Assert.assertArrayEquals(expected,CoinChanging.run(UScoins,coins));
    }
   
    // test 112 coin
    @Test //(expected = IllegalArgumentException.class)
    public void bigCoinTest()
    {
        int[] expected = {1,1,10,25,25,25,25};
        int coins = 112;
        Assert.assertArrayEquals(expected,CoinChanging.run(UScoins,coins));
    }
    //test of 1016
    @Test //(expected = IllegalArgumentException.class)
    public void biggerCoinTest()
    {
        int[] expected = {1,5,10,25,25,25,25,25,25,25,25,25,25,25,25,25,25,25,25,25,25,25,25,25,25,25,25,25,25,25,25,25,25,25,25,25,25,25,25,25,25,25,25};
        int coins = 1016;
        Assert.assertArrayEquals(expected,CoinChanging.run(UScoins,coins));
    }
    @Test//(expected = IllegalArgumentException.class)
    public void NoCoins()
    {
        int coins = 0;
        Assert.assertArrayEquals(null,CoinChanging.run(UScoins,coins));
    }
    //testing empty array
     @Test//(expected = IllegalArgumentException.class)
    public void EmptyArray()
    {
        int array[] = {};
        int coins = 10;
        Assert.assertArrayEquals(null,CoinChanging.run(array,coins));
    }
}

