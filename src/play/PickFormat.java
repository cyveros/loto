/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package play;

import annotations.NumericFormat;
import java.lang.reflect.Field;

/**
 *
 * @author rynox_000
 * @param <T>
 */
public abstract class PickFormat implements Format {
    
    protected int size, column;
    protected int[] pool;
    
    public static Format generatePickFormat(Class<Format> F)
        throws IllegalAccessException, InstantiationException, NoSuchFieldException {
        
        Format pf = F.asSubclass(F).newInstance();
        Field f = F.getDeclaredField("numbers");
        
        
        int[] num = {1,2,3,4,5,6};

        f.setAccessible(true); 
        f.set(pick, num);
        
        return pick;
    }
    
    public PickFormat()
    {
        NumericFormat format = this.getClass().getAnnotation(NumericFormat.class);
        this.size = format.size();
        this.pool = format.pool();
        this.column = format.column();
    }

    @Override
    public int getSize() {
        return this.size;
    }

    @Override
    public int[] getPool() {
        return this.pool;
    }
    
    @Override
    public int getColumn()
    {
        return this.column;
    }
    
    
}
