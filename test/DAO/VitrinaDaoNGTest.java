/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DAO;

import java.util.List;
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
public class VitrinaDaoNGTest {
    
    public VitrinaDaoNGTest() {
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
     * Test of consultarProdById method, of class VitrinaDao.
     */
    @Test
    public void testConsultarProdById() {
        System.out.println("consultarProdById");
        int Id = 0;
        VitrinaDao instance = new VitrinaDao();
        List expResult = instance.consultarProdById(Id);
        List result = instance.consultarProdById(Id);
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of consultarProdByMarca method, of class VitrinaDao.
     */
    @Test
    public void testConsultarProdByMarca() {
        System.out.println("consultarProdByMarca");
        String Marca = "";
        VitrinaDao instance = new VitrinaDao();
        List expResult = instance.consultarProdByMarca(Marca);
        List result = instance.consultarProdByMarca(Marca);
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of update method, of class VitrinaDao.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        String Marca = "";
        String Modelo = "";
        int Cilindraje = 0;
        int Precio = 0;
        int Id = 0;
        VitrinaDao instance = new VitrinaDao();
        instance.update(Marca, Modelo, Cilindraje, Precio, Id);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
    
}
