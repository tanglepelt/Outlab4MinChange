/*
 *Brittany Couts, Gabby Strong, Brock Lehnen
 *4/20/2018
 *
 *This is the logic that runs the code
*/
package minchange.outlab4;

import java.util.ArrayList;
import java.util.Arrays;

import java.util.List;

public class CoinChanging 
{
    private static int smallNum = 10000;
    private static int[] smallest;
    //calls the method
    public void printCoinChangingSolution(int total,int coins[])
    {
        List<Integer> result = new ArrayList<>();
        printActualSolution(result, total, coins, 0);
        
    }
    //method to print the solution
    private void printActualSolution(List<Integer> result,int total,int coins[],int pos){    
        //if total is o
        if(total == 0)
        {
            //temp array to store values
            int[] tempArray = new int[result.size()];
            
            //for loop to set results to a temp Array
            for(int r = 0; r < result.size(); r++)
            {
               tempArray[r] = result.get(r);
            }
            getSmall(tempArray);
        }

        //for loop to get coin vaulues
        for(int i=pos; i < coins.length; i++)
        {
            //to find the next coin we can use
            if(total >= coins[i])
            {
                result.add(coins[i]);
                printActualSolution(result,total-coins[i],coins,i);
                result.remove(result.size()-1);
            }
        }
    }
    
    //readjusting parameters for the values 
    private static void getSmall(int[] values)
    {
        if(values.length > 0)
        {
            //checking for a smaller length of coins
            if(values.length < smallNum)
            {
                //System.out.println("test");
                smallNum = values.length;
                smallest = values;
            }           
        }         
    }

    public static int[] run(int[] coins,int total)
    {
        CoinChanging cc = new CoinChanging();
        
        //checking for an empty array
        if(coins.length == 0)
        {
            System.out.println("\nEntered an Empty array");
            return null;
        }
        //checkin for coin value of 0
        if(total == 0)
        {
            System.out.println("\nCoin value can not be 0");
            return null;
        }
        
        cc.printCoinChangingSolution(total, coins);
        System.out.println(Arrays.toString(smallest));
        
        return smallest;
    }
    

}



