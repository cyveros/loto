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
@NumericFormat(
    size = 6,
    pool = {
        1, 2, 3, 4, 5,
        6, 7, 8, 9, 10,
        11,12,13,14,15,
        16,17,18,19,20,
        21,22,23,24,25,
        26,27,28,29,30,
        31,32,33,34,35,
        36,37,38,39,40,
        41,42,43,44,45,
        46,47,48,49
    },
    column = 5
)
public class PickFormat649 extends PickFormat {
    
    public boolean inPool(int value)
    {
        return (value >= this.pool[0] || value <= this.pool[this.pool.length - 1]);
    }
    
    
}
