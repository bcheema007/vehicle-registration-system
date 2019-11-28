/**
 * JUnit test for Car class.
 */

package junitests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Objects;
import model.vehicles.Car;
import org.junit.Before;
import org.junit.Test;

/**
 * @author alone117
 * @version Fall 2019
 *
 */
public class CarTest {

    /**
     * First Car object to be instantiated.
     */
    private Car myCar1;

    /**
     * Second Car object to be instantiated.
     */
    private Car myCar2;

    /**
     * Instantiates Car objects.
     */
    @Before
    public void setUp() {

        myCar1 = new Car(1, "Car1", "C100", true, true, true, true);
        myCar2 = new Car(2, "Car2", "C101", true, false, false, false);

    }

    /**
     * Tests whether hashcode for two equal Car objects are equivalent. Test method for
     * {@link model.vehicles.Car#hashCode()}.
     */
    @Test
    public void testHashCode() {

        assertEquals("HashCode method failed - values",
                     Objects.hash(myCar1.getMyVehicleID(), myCar1.getMyName(),
                                  myCar1.getMyVIN(), myCar1.isMyRent(), myCar1.isMyLuxury(),
                                  myCar1.isMyNavigation(), myCar1.isMyDrivingAssistance()),
                     myCar1.hashCode());

        final Car car3 = new Car(1, "Car1", "C100", true, true, true, true);
        assertEquals("HashCode method failed - equals constraint", myCar1.hashCode(),
                     car3.hashCode());

    }

    /**
     * Test whether correct rental amount is returned from calculateRentalAmount method in the
     * Car class. Test method for {@link model.vehicles.Car#calculateRentalAmount()}.
     */
    @Test
    public void testCalculateRentalAmount() {

        final Car car3 = new Car(3, "Car3", "C102", true, true, false, false);
        final Car car4 = new Car(4, "Car4", "C103", true, false, true, false);
        final Car car5 = new Car(5, "Car5", "C104", true, false, false, true);

        final BigDecimal rent1 = car3.calculateRentalAmount();
        final BigDecimal rent2 = car4.calculateRentalAmount();
        final BigDecimal rent3 = car5.calculateRentalAmount();
        final BigDecimal rent4 = myCar1.calculateRentalAmount();
        final BigDecimal rent5 = myCar2.calculateRentalAmount();

        // with myLuxury having a value as true
        assertEquals("Incorrect rental amount - calculateRentalAmount failed",
                     car3.getMyRentalAmount(), rent1);

        // with myNavigation having a value as true
        assertEquals("Incorrect rental amount - calculateRentalAmount failed",
                     car4.getMyRentalAmount(), rent2);

        // with myDrivingAssistance having a value as true
        assertEquals("Incorrect rental amount - calculateRentalAmount failed",
                     car5.getMyRentalAmount(), rent3);

        // with myLuxury having a value as false
        assertEquals("Incorrect rental amount - calculateRentalAmount failed",
                     car4.getMyRentalAmount(), rent2);

        // with myNavigation having a value as false
        assertEquals("Incorrect rental amount - calculateRentalAmount failed",
                     car3.getMyRentalAmount(), rent1);

        // with myDrivingAssistance having a value as true
        assertEquals("Incorrect rental amount - calculateRentalAmount failed",
                     car3.getMyRentalAmount(), rent1);

        // with myLuxury, myNavigation, and myDrivingAssistance having all values as true
        assertEquals("Incorrect rental amount - calculateRentalAmount failed",
                     myCar1.getMyRentalAmount(), rent4);

        // with myLuxury, myNavigation, and myDrivingAssistance having all values as false
        assertEquals("Incorrect rental amount - calculateRentalAmount failed",
                     myCar2.getMyRentalAmount(), rent5);

    }

    /**
     * Test whether correct string representation of Car object is produced once toString is
     * called. Test method for {@link model.vehicles.Car#toString()}.
     */
    @Test
    public void testToString() {

        assertEquals("Parameterized constructor,two parameters toString format is incorrect",
                     "Car (ID:1, Name:Car1, VIN:C100, CanRent?:true, IsLuxury?:true, " + "HasNavigation?:true, HasAssistance?:true)",
                     myCar1.toString());

    }

    /**
     * Tests whether two Car objects are equal by positive tests which include reflexive, and
     * same value comparison tests. Also test Car objects by negative tests which include
     * checking for null value, different value comparison, and different object class tests.
     * Test method for {@link model.vehicles.Car#equals(java.lang.Object)}.
     */
    @Test
    public void testEqualsObjectPositive() {

        final Car car = new Car(1, "Car1", "C100", true, true, true, true);

        // reflexive property is satisfied
        assertEquals("Equals failed - reflexive", myCar1, myCar1);

        // if both Car objects have the same vehicleID, name, VIN, canRent, myLuxury,
        // myNavigation, and myDrivingAssistance
        // values.
        assertEquals("Equals failed - value equality", myCar1, car);

    }

    /**
     * Tests whether two Car objects are equal by positive tests which include reflexive, and
     * same value comparison tests. Also test Car objects by negative tests which include
     * checking for null value, different value comparison, and different object class tests.
     * Test method for {@link model.vehicles.Car#equals(java.lang.Object)}.
     */
    @Test
    public void testEqualsObjectNegative() {

        // null object
        assertNotEquals("Equals failed - null", myCar1, null);

        // other MotorBike object has different vehicleID, name, VIN, canRent, myLuxury,
        // myNavigation, and myDrivingAssistance
        // values.
        assertNotEquals("Equals failed - different values", myCar1, myCar2);

        // other object is of a different class
        assertNotEquals("Equals failed - different class", myCar1, new ArrayList<Integer>());

    }

    /**
     * Test for Car constructor that takes in seven parameters. Checks to see expected and
     * actual values are equal when the fields are initialized, and checks for null values.
     * Test method for
     * {@link model.vehicles.Car#Car(int, java.lang.String, java.lang.String, boolean, boolean, boolean, boolean)}.
     */
    @Test
    public void testCarIntStringStringBooleanBooleanBooleanBoolean() {

        assertNotNull("Value for vehicleID is null", myCar1.getMyVehicleID());
        assertNotNull("Value for name is null", myCar1.getMyName());
        assertNotNull("Value for VIN is null", myCar1.getMyVIN());
        assertEquals("vehicleID does not match", 1, myCar1.getMyVehicleID());
        assertEquals("Name does not match", "Car1", myCar1.getMyName());
        assertEquals("VIN does not match", "C100", myCar1.getMyVIN());
        assertEquals("Value for myRent does not match", true, myCar1.isMyRent());
        assertEquals("Value for myLuxury does not match", true, myCar1.isMyLuxury());
        assertEquals("Value for myNavigation does not match", true, myCar1.isMyNavigation());
        assertEquals("Value for myDrivingAssistance does not match", true,
                     myCar1.isMyDrivingAssistance());

    }

    /**
     * Test getter for whether Car object has luxury features or not. Test method for
     * {@link model.vehicles.Car#isMyLuxury()}.
     */
    @Test
    public void testIsMyLuxury() {

        assertEquals("Getter for myLuxury failed - parameterized constructor", true,
                     myCar1.isMyLuxury());

    }

    /**
     * Test getter for whether Car object has navigation features. Test method for
     * {@link model.vehicles.Car#isMyNavigation()}.
     */
    @Test
    public void testIsMyNavigation() {

        assertEquals("Getter for myNavigation failed - parameterized constructor", true,
                     myCar1.isMyNavigation());

    }

    /**
     * Test getter for whether Car object has driving assistance features. Test method for
     * {@link model.vehicles.Car#isMyDrivingAssistance()}.
     */
    @Test
    public void testIsMyDrivingAssistance() {

        assertEquals("Getter for myDrivingAssistance failed - parameterized constructor", true,
                     myCar1.isMyDrivingAssistance());

    }

}
