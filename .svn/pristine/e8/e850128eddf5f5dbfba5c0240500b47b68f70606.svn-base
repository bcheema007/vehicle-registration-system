/**
 * JUnit test for Vehicle class.
 */

package junitests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Objects;
import model.vehicles.Vehicle;
import org.junit.Before;
import org.junit.Test;

/**
 * @author alone117
 * @version Fall 2019
 *
 */
public class VehicleTest {

    /**
     * First Vehicle object to be instantiated.
     */
    private Vehicle myVehicle;

    /**
     * Second Vehicle object to be instantiated.
     */
    private Vehicle myVehicle2;

    /**
     * Instantiate Vehicle objects.
     */
    @Before
    public void setUp() {

        myVehicle = new Vehicle(1, "Tesla", "V100", true);
        myVehicle2 = new Vehicle(2, "Mercedes", "V101", false);

    }

    /**
     * Tests whether hashcode for two equal Vehicle objects are equivalent.
     */
    @Test
    public void testHashCode() {

        assertEquals("HashCode method failed - values",
                     Objects.hash(myVehicle.getMyVehicleID(), myVehicle.getMyName(),
                                  myVehicle.getMyVIN(), myVehicle.isMyRent()),
                     myVehicle.hashCode());

        final Vehicle vehicle3 = new Vehicle(1, "Tesla", "V100", true);
        assertEquals("HashCode method failed - equals constraint", myVehicle.hashCode(),
                     vehicle3.hashCode());

    }

    /**
     * Test for Vehicle constructor that takes in four parameters. Checks to see expected and
     * actual values are equal when the fields are initialized, and checks for null values.
     */
    @Test
    public void testVehicleIntStringStringBoolean() {

        assertNotNull("Value for vehicleID is null", myVehicle.getMyVehicleID());
        assertNotNull("Value for name is null", myVehicle.getMyName());
        assertNotNull("Value for VIN is null", myVehicle.getMyVIN());
        assertEquals("vehicleID does not match", 1, myVehicle.getMyVehicleID());
        assertEquals("Name does not match", "Tesla", myVehicle.getMyName());
        assertEquals("VIN does not match", "V100", myVehicle.getMyVIN());
        assertEquals("Value for myRent does not match", true, myVehicle.isMyRent());

    }

    /**
     * Test getter for vehicleID.
     */
    @Test
    public void testGetMyVehicleID() {

        assertEquals("Getter for myVehicleID failed - parameterized constructor", 1,
                     myVehicle.getMyVehicleID());

    }

    /**
     * Test getter for vehicle name.
     */
    @Test
    public void testGetMyName() {

        assertEquals("Getter for myName failed - parameterized constructor", "Tesla",
                     myVehicle.getMyName());

    }

    /**
     * Test getter for vehicle VIN.
     */
    @Test
    public void testGetMyVIN() {

        assertEquals("Getter for myVIN failed - parameterized constructor", "V100",
                     myVehicle.getMyVIN());

    }

    /**
     * Test getter for whether you can rent vehicle or not.
     */
    @Test
    public void testIsMyRent() {

        assertEquals("Getter for myRent failed - parameterized constructor", true,
                     myVehicle.isMyRent());

    }

    /**
     * Test getter for how much it costs to rent the vehicle.
     */
    @Test
    public void testGetMyRentalAmount() {

        final BigDecimal rent = myVehicle.calculateRentalAmount();

        assertEquals("Getter for myRentalAmount failed", rent, myVehicle.getMyRentalAmount());

    }

    /**
     * Test whether correct rental amount is returned from calculateRentalAmount method in the
     * Vehicle class.
     */
    @Test
    public void testCalculateRentalAmount() {

        final BigDecimal rent = myVehicle.calculateRentalAmount();

        assertEquals("Incorrect rental amount - calculateRentalAmount failed",
                     myVehicle.getMyRentalAmount(), rent);

    }

    /**
     * Test whether correct string representation of Vehicle object is produced once toString
     * is called.
     */
    @Test
    public void testToString() {

        assertEquals("Parameterized constructor,two parameters toString format is incorrect",
                     "Vehicle (ID:1, Name:Tesla, VIN:V100, CanRent?:true)",
                     myVehicle.toString());

    }

    /**
     * Tests whether two Vehicle objects are equal by positive tests which include reflexive,
     * and same value comparison tests. Also test Vehicle objects by negative tests which
     * include checking for null value, different value comparison, and different object class
     * tests.
     */
    @Test
    public void testEqualsObjectPositive() {

        final Vehicle vehicle5 = new Vehicle(1, "Tesla", "V100", true);

        // reflexive property is satisfied
        assertEquals("Equals failed - reflexive", myVehicle, myVehicle);

        // if both Vehicle objects have the same vehicleID, name, VIN, and canRent values.
        assertEquals("Equals failed - value equality", myVehicle, vehicle5);

    }

    /**
     * Tests whether two Vehicle objects are equal by positive tests which include reflexive,
     * and same value comparison tests. Also test Vehicle objects by negative tests which
     * include checking for null value, different value comparison, and different object class
     * tests.
     */
    @Test
    public void testEqualsObjectNegative() {

        // null object
        assertNotEquals("Equals failed - null", myVehicle, null);

        // other Vehicle object has different vehicleID, name, VIN, and canRent values.
        assertNotEquals("Equals failed - different values", myVehicle, myVehicle2);

        // other object is of a different class
        assertNotEquals("Equals failed - different class", myVehicle,
                        new ArrayList<Integer>());

    }

}
