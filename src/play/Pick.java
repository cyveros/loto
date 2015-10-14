/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package play;

import java.lang.reflect.Field;
import java.util.Arrays;

/**
 *
 * @author rynox_000
 */
public abstract class Pick implements Numbers {
    protected int[] numbers;
    
    public static Pick getQuickPlay(Class<Play> play)
        throws IllegalAccessException, InstantiationException, NoSuchFieldException {
        
        Play pick = play.newInstance();
        Field f = Pick.class.getDeclaredField("numbers");
        
        
        int[] num = {1,2,3,4,5,6};

        f.setAccessible(true); 
        f.set(pick, num);
        
        return pick;
    }
    
    public void setNumbers(int[] numbers)
    {
        this.numbers = numbers;
    }
    
    @Override
    public int[] getNumbers() {
        return this.numbers;
    }
    
    @Override
    public String toString()
    {
        return Arrays.toString(this.numbers);
    }
    
}
