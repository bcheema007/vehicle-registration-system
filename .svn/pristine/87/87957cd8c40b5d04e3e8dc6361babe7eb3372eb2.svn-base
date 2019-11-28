/**
 * JUnit test for BiCycle class.
 */

package junitests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Objects;
import model.vehicles.BiCycle;
import org.junit.Before;
import org.junit.Test;

/**
 * @author alone117
 * @version Fall 2019
 *
 */
public class BiCycleTest {

    /**
     * First BiCycle object to be instantiated.
     */
    private BiCycle myBC1;

    /**
     * Second BiCycle object to be instantiated.
     */
    private BiCycle myBC2;

    /**
     * Instantiate BiCycle objects.
     */
    @Before
    public void setUp() {

        myBC1 = new BiCycle(1, "Bicycle1", "R100", true, "Mountain");
        myBC2 = new BiCycle(2, "Bicycle2", "R101", false, "Hybrid");

    }

    /**
     * Tests whether hashcode for two equal BiCycle objects are equivalent. Test method for
     * {@link model.vehicles.BiCycle#hashCode()}.
     */
    @Test
    public void testHashCode() {

        assertEquals("HashCode method failed - values",
                     Objects.hash(myBC1.getMyVehicleID(), myBC1.getMyName(), myBC1.getMyVIN(),
                                  myBC1.isMyRent(), myBC1.getMyCycleType()),
                     myBC1.hashCode());

        final BiCycle bc3 = new BiCycle(1, "Bicycle1", "R100", true, "Mountain");
        assertEquals("HashCode method failed - equals constraint", myBC1.hashCode(),
                     bc3.hashCode());

    }

    /**
     * Test whether correct rental amount is returned from calculateRentalAmount method in the
     * BiCycle class. Test method for {@link model.vehicles.BiCycle#calculateRentalAmount()}.
     */
    @Test
    public void testCalculateRentalAmount() {

        final BiCycle bc0 = new BiCycle(3, "Bicycle3", "R103", true, "Road");
        final BiCycle bc10 = new BiCycle(4, "Bicycle4", "R104", true, "Cruiser");

        final BigDecimal rent0 = bc0.calculateRentalAmount();
        final BigDecimal rent10 = bc10.calculateRentalAmount();
        final BigDecimal rent1 = myBC1.calculateRentalAmount();
        final BigDecimal rent2 = myBC2.calculateRentalAmount();

        // with myCycleType having a value of "Mountain"
        assertEquals("Incorrect rental amount - calculateRentalAmount failed",
                     myBC1.getMyRentalAmount(), rent1);

        // with myCycleType having a value of "Road"
        assertEquals("Incorrect rental amount - calculateRentalAmount failed",
                     bc0.getMyRentalAmount(), rent0);

        // with myCycleType having a value of "Cruiser"
        assertEquals("Incorrect rental amount - calculateRentalAmount failed",
                     bc10.getMyRentalAmount(), rent10);

        // with myCycleType having a value of "Hybrid"
        assertEquals("Incorrect rental amount - calculateRentalAmount failed",
                     myBC2.getMyRentalAmount(), rent2);

    }

    /**
     * Test whether correct string representation of BiCycle object is produced once toString
     * is called. Test method for {@link model.vehicles.BiCycle#toString()}.
     */
    @Test
    public void testToString() {

        assertEquals("Parameterized constructor,two parameters toString format is incorrect",
                     "BiCycle (ID:1, Name:Bicycle1, VIN:R100, CanRent?:true, CycleType:Mountain)",
                     myBC1.toString());

    }

    /**
     * Tests whether two BiCycle objects are equal by positive tests which include reflexive,
     * and same value comparison tests. Also test BiCycle objects by negative tests which
     * include checking for null value, different value comparison, and different object class
     * tests. Test method for {@link model.vehicles.BiCycle#equals(java.lang.Object)}.
     */
    @Test
    public void testEqualsObjectPositive() {

        final BiCycle bc0 = new BiCycle(1, "Bicycle1", "R100", true, "Mountain");

        // reflexive property is satisfied
        assertEquals("Equals failed - reflexive", myBC1, myBC1);

        // if both MotorBike objects have the same vehicleID, name, VIN, canRent, and isTouring
        // values.
        assertEquals("Equals failed - value equality", myBC1, bc0);

    }

    /**
     * Tests whether two BiCycle objects are equal by positive tests which include reflexive,
     * and same value comparison tests. Also test BiCycle objects by negative tests which
     * include checking for null value, different value comparison, and different object class
     * tests. Test method for {@link model.vehicles.BiCycle#equals(java.lang.Object)}.
     */
    @Test
    public void testEqualsObjectNegative() {

        // null object
        assertNotEquals("Equals failed - null", myBC1, null);

        // other MotorBike object has different vehicleID, name, VIN, canRent, and isTouring
        // values.
        assertNotEquals("Equals failed - different values", myBC1, myBC2);

        // other object is of a different class
        assertNotEquals("Equals failed - different class", myBC1, new ArrayList<Integer>());

    }

    /**
     * Test for BiCycle constructor that takes in five parameters. Checks to see expected and
     * actual values are equal when the fields are initialized, and checks for null values.
     * Test method for
     * {@link model.vehicles.BiCycle#BiCycle(int, java.lang.String, java.lang.String, boolean, java.lang.String)}.
     */
    @Test
    public void testBiCycleIntStringStringBooleanString() {

        assertNotNull("Value for vehicleID is null", myBC1.getMyVehicleID());
        assertNotNull("Value for name is null", myBC1.getMyName());
        assertNotNull("Value for VIN is null", myBC1.getMyVIN());
        assertNotNull("Value for CycleType is null", myBC1.getMyCycleType());
        assertEquals("vehicleID does not match", 1, myBC1.getMyVehicleID());
        assertEquals("Name does not match", "Bicycle1", myBC1.getMyName());
        assertEquals("VIN does not match", "R100", myBC1.getMyVIN());
        assertEquals("Value for myRent does not match", true, myBC1.isMyRent());
        assertEquals("Value for myCycleType does not match", "Mountain",
                     myBC1.getMyCycleType());

    }

    /**
     * Test getter for what type of BiCycle object it is. Test method for
     * {@link model.vehicles.BiCycle#getMyCycleType()}.
     */
    @Test
    public void testGetMyCycleType() {

        assertEquals("Getter for myCycleType failed - parameterized constructor", "Mountain",
                     myBC1.getMyCycleType());

    }

}
