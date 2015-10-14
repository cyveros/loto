/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package play;

import annotations.NumericFormat;

/**
 *
 * @author rynox_000
 */
public abstract class PickFormat implements Format {
    
    protected int size, column;
    protected int[] pool;
    
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
