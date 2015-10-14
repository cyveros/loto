/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loto;

import play.*;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author rynox_000
 */
public class Loto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PickFormat649 rf = new PickFormat649();
        
        
        Pick p;
        
        try {
            p = Pick.getQuickPlay(Play.class);
//            int[] numbers = p.getNumbers();
            //System.out.println(numbers.length);
            //dump(numbers);
            System.out.println(p.toString());
        } catch (IllegalAccessException | InstantiationException | NoSuchFieldException ex) {
            Logger.getLogger(Loto.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        int[][] draws = getMap();
        int[] result = {8, 12, 22, 27, 35, 41};
        int[] matched = match(result);
        
        dump(matched);
        
    }
    
    public static int[][] getMap()
    {
        int[][] draws = new int[5][10];
        
        for (int i = 0; i < 5; i++) {
            int seed = i + 1;
            int iteration = 0;
            while (seed <= 49 && iteration < draws[i].length) {
                draws[i][iteration] = seed + 5 * iteration;
                iteration++;
            }
        }
        return draws;
    }
    
    public static int[] match(int[] result)
    {
        int[] distribution = new int[5];
        
        for (int i = 0; i < result.length; i++) {            
            distribution[(result[i] % 5 + 4) % 5] += 1;
        }
        
        return distribution;
    }
    
    public static void dump(int[] arr)
    {
        System.out.println(Arrays.toString(arr));
    }
    
    
    
}
