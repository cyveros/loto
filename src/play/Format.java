/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package play;

/**
 *
 * @author rynox_000
 * @param <T>
 */
public interface Format<T> {
    
    public int getSize();
    
    public int[] getPool();
    
    public int getColumn();
}
