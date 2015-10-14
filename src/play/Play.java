/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package play;


/**
 *
 * @author rynox_000
 */
public class Play extends Pick {    
    
    public static PickFormat generatePickFormat(Class<PickFormat> p) 
            throws InstantiationException, IllegalAccessException {
        
        PickFormat pf = p.newInstance();
        
        
        
        return pf;
    }
    
    public Play() {
        super();
    }
    
}
