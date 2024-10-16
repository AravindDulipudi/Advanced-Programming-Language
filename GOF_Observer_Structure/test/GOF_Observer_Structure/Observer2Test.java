/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package GOF_Observer_Structure;

import gof_observer_structure.Observer2;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author aravi
 */
public class Observer2Test {
    
    public Observer2Test() {
    }

    /**
     * Test of update method, of class Observer2.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        int x = 0;
        int y = 0;
        Observer2 instance = null;
        instance.update(x, y);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
