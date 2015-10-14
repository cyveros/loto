/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 *
 * @author rynox_000
 */
@Retention( RetentionPolicy.RUNTIME )
public @interface NumericFormat {
    public int column() default 0;
    
    public int size() default 0;
    
    public int[] pool() default {};
}
