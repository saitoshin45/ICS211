  
package edu.ics211.h02;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Test;

/**
 * Tests the IndiaPaleAle class.
 * @author Shinya Saito 
 * Got assistance from the Teaching Assistants and worked with Micheal Ito.
 */
public class IndiaPaleAleTest {
    /**
     * Test method for {@link edu.ics211.h02.IndiaPaleAle#IndiaPaleAle(java.lang.String)}.
     */
    @Test
    public void testIndiaPaleAleString() 
    {
        IndiaPaleAle ipa = new IndiaPaleAle("Warrior");
        assertNotNull("Should have created a IndiaPaleAle", ipa);
        assertEquals("Should have the right name", "Warrior", ipa.getName());
        assertEquals("Should have the right BeerType", BeerType.INDIA_PALE_ALE, ipa.getType());
        assertTrue("Should have valid IBU", ipa.getIbu() > 39 && ipa.getIbu() < 101);
        assertTrue("Should have valid ABV", ipa.getAbv() >= 5.0 && ipa.getAbv() <= 10.0);
    }

    /**
     * Test method for {@link edu.ics211.h02.IndiaPaleAle#IndiaPaleAle(java.lang.String, java.lang.Integer, java.lang.Double)}.
     */
    @Test
    public void testIndiaPaleAleStringIntegerDouble() 
    {
        IndiaPaleAle ipa = new IndiaPaleAle("Warrior", 55, 8.3);
        assertNotNull("Should have created a IndiaPaleAle", ipa);
        assertEquals("Should have the right name", "Warrior", ipa.getName());
        assertTrue("Should have the right IBU", 55 == ipa.getIbu());
        assertEquals("Should have the right ABV", 8.3, ipa.getAbv(), 0.0001);
        try {
            ipa = new IndiaPaleAle("Yikes", 243, 8.0);
            fail("Should not create IndiaPaleAle with that IBU");
        } catch (IllegalArgumentException iae) {
            // ??
        }
        try {
            ipa = new IndiaPaleAle("Yikes", 44, 12.4);
            fail("Should not create IndiaPaleAle with that ABV");
        } catch (IllegalArgumentException iae) {
            // do nothing 
        }

    }

    /**
     * Test method for {@link edu.ics211.h02.Beer#setName(java.lang.String)}.
     */
    @Test
    public void testSetName() 
    {
        IndiaPaleAle india = new IndiaPaleAle("Yikes India Pale Ale", 78, 7.8);
        assertEquals("Should have the right name", "Yikes India Pale Ale", india.getName());
        india.setName("Warrior");
        assertEquals("Should have the right name", "Warrior", india.getName());
    }

}