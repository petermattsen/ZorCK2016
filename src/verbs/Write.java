/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package verbs;
import core.Verb;
/**
 *
 * @author johnson5951a
 */
public class Write extends Verb{
    
    public Write(){
        super("write",
                new String[]{"inscribe", "draw", "transcribe"},
                new boolean[]{true, true, false});
    }
}