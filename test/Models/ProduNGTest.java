/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Models;

import javax.ejb.embeddable.EJBContainer;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author SERVIDOR
 */
public class ProduNGTest {
    
    public ProduNGTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }

    /**
     * Test of getId method, of class Produ.
     */
    @Test
    public void testGetId() throws Exception {
        System.out.println("getId");
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        Produ instance = (Produ)container.getContext().lookup("java:global/classes/Produ");
        int expResult = instance.getId();
        int result = instance.getId();
        assertEquals(result, expResult);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class Produ.
     */
    @Test
    public void testSetId() throws Exception {
        System.out.println("setId");
        int Id = 0;
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        Produ instance = (Produ)container.getContext().lookup("java:global/classes/Produ");
        instance.setId(Id);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of getMarca method, of class Produ.
     */
    @Test
    public void testGetMarca() throws Exception {
        System.out.println("getMarca");
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        Produ instance = (Produ)container.getContext().lookup("java:global/classes/Produ");
        String expResult = instance.getMarca();
        String result = instance.getMarca();
        assertEquals(result, expResult);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of setMarca method, of class Produ.
     */
    @Test
    public void testSetMarca() throws Exception {
        System.out.println("setMarca");
        String Marca = "";
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        Produ instance = (Produ)container.getContext().lookup("java:global/classes/Produ");
        instance.setMarca(Marca);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of getModelo method, of class Produ.
     */
    @Test
    public void testGetModelo() throws Exception {
        System.out.println("getModelo");
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        Produ instance = (Produ)container.getContext().lookup("java:global/classes/Produ");
        String expResult = instance.getModelo();
        String result = instance.getModelo();
        assertEquals(result, expResult);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of setModelo method, of class Produ.
     */
    @Test
    public void testSetModelo() throws Exception {
        System.out.println("setModelo");
        String Modelo = "";
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        Produ instance = (Produ)container.getContext().lookup("java:global/classes/Produ");
        instance.setModelo(Modelo);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of getCilindraje method, of class Produ.
     */
    @Test
    public void testGetCilindraje() throws Exception {
        System.out.println("getCilindraje");
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        Produ instance = (Produ)container.getContext().lookup("java:global/classes/Produ");
        int expResult = instance.getCilindraje();
        int result = instance.getCilindraje();
        assertEquals(result, expResult);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of setCilindraje method, of class Produ.
     */
    @Test
    public void testSetCilindraje() throws Exception {
        System.out.println("setCilindraje");
        int Cilindraje = 0;
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        Produ instance = (Produ)container.getContext().lookup("java:global/classes/Produ");
        instance.setCilindraje(Cilindraje);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of getPrecio method, of class Produ.
     */
    @Test
    public void testGetPrecio() throws Exception {
        System.out.println("getPrecio");
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        Produ instance = (Produ)container.getContext().lookup("java:global/classes/Produ");
        int expResult = instance.getPrecio();
        int result = instance.getPrecio();
        assertEquals(result, expResult);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of setPrecio method, of class Produ.
     */
    @Test
    public void testSetPrecio() throws Exception {
        System.out.println("setPrecio");
        int Precio = 0;
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        Produ instance = (Produ)container.getContext().lookup("java:global/classes/Produ");
        instance.setPrecio(Precio);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
    
}
