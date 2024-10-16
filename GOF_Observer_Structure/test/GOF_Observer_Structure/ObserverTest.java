/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package GOF_Observer_Structure;

import gof_observer_structure.Observer;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author aravi
 */
public class ObserverTest {
    
    public ObserverTest() {
    }

    /**
     * Test of update method, of class Observer.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        int x = 0;
        int y = 0;
        Observer instance = new ObserverImpl();
        instance.update(x, y);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class ObserverImpl extends Observer {

        public void update(int x, int y) {
        }
    }
    
}
