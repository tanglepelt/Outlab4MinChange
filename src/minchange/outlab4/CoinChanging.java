/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minchange.outlab4;

import java.util.ArrayList;
import java.util.Arrays;

import java.util.List;

public class CoinChanging 
{
    private static int smallNum = 100;
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
                
                //System.out.println(result);
     
            }
        }
    }

    private static void getSmall(int[] values)
    {
        if(values.length > 0)
        {
            if(values.length < smallNum)
            {
                //System.out.println("test");
                smallNum = values.length;
                smallest = values;
            }
                    
            //System.out.println(Arrays.toString(smallest)); 
        }
        
        
    }

    public static int[] run(int[] coins,int total)
    {
        //CoinChanging cc = new CoinChanging();

        //cc.printCoinChangingSolution(total, coins);
        System.out.print("test"+Arrays.toString(smallest));
        
        return smallest;
    }
    
    /*  //tester to be removed
    public static void main(String args[])
    {
    CoinChanging cc = new CoinChanging();
    int total = 42;
    int coins[] = {1,5,10,25};
    cc.printCoinChangingSolution(total, coins);
    System.out.print("test"+Arrays.toString(smallest));
    }*/

}

