/**
 * Vehicle is the parent class.
 */

package model.vehicles;

import java.math.BigDecimal;
import java.util.Objects;

/**
 * @author alone117
 * @version Fall 2019
 */
public class Vehicle {

    /**
     * The minimum amount of money for renting any Vehicle.
     */
    public static final double BASE_FARE = 10.00;

    /**
     * Unique ID generated by rental manager during inventory creation. Starts at 1 and then
     * generates numbers sequentially.
     */
    protected int myVehicleID;

    /**
     * The name of the vehicle.
     */
    protected String myName;

    /**
     * Unique Vehicle Identification Number.
     */
    protected String myVIN;

    /**
     * Is the Vehicle available to rent?
     */
    protected boolean myRent;

    /**
     * Every Vehicle has a certain rental amount per day.
     */
    protected BigDecimal myRentalAmount;

    /**
     * Parameterized constructor to initialize instance fields.
     * 
     * @param theVehicleID Unique ID generated by rental manager when creating inventory.
     * @param theName Name of the vehicle.
     * @param theVIN Unique Vehicle Identification Number.
     * @param theRent Whether or not the Vehicle is available for rent.
     */
    public Vehicle(final int theVehicleID, final String theName, final String theVIN,
                   final boolean theRent) {

        this.myVehicleID = theVehicleID;
        this.myName = theName;
        this.myVIN = theVIN;
        this.myRent = theRent;

    }

    /**
     * What is the ID of the vehicle?
     * 
     * @return the ID of the Vehicle
     */
    public int getMyVehicleID() {

        return myVehicleID;

    }

    /**
     * What is the name of the Vehicle?
     * 
     * @return The name of the Vehicle.
     */
    public String getMyName() {

        return myName;

    }

    /**
     * What is the Unique Vehicle Identification Number?
     * 
     * @return the Unique Vehicle Identification Number.
     */
    public String getMyVIN() {

        return myVIN;

    }

    /**
     * Can you rent the Vehicle?
     * 
     * @return True or false on whether Vehicle is available to rent.
     */
    public boolean isMyRent() {

        return myRent;

    }

    /**
     * What is the rental amount for a specific Vehicle?
     * 
     * @return The rental amount for a certain Vehicle.
     */
    public BigDecimal getMyRentalAmount() {

        return myRentalAmount;

    }

    /**
     * Ability to change the value of whether Vehicle is available for rent or not.
     * 
     * @param theRent A true or false value on whether Vehicle is available to rent.
     */
    public void setMyRent(final boolean theRent) {

        this.myRent = theRent;

    }

    /**
     * What is the rental amount for a certain Vehicle?
     * 
     * @return A BigDecimal number representing rental amount for a certain Vehicle.
     */
    public BigDecimal calculateRentalAmount() {

        myRentalAmount = new BigDecimal(BASE_FARE);

        return myRentalAmount;

    }

    /**
     * Returns a string representation of a Vehicle object.
     * 
     * @return The string representation of specified Vehicle object.
     */
    @Override
    public String toString() {

        final String start = " (";
        final String comma = ", ";
        final StringBuilder sb = new StringBuilder(22);
        sb.append(getClass().getSimpleName());
        sb.append(start);
        sb.append("ID:");
        sb.append(getMyVehicleID());
        sb.append(comma);
        sb.append("Name:");
        sb.append(getMyName());
        sb.append(comma);
        sb.append("VIN:");
        sb.append(getMyVIN());
        sb.append(comma);
        sb.append("CanRent?:");
        sb.append(isMyRent());
        sb.append(')');

        return sb.toString();

    }

    /**
     * Compares two types of Vehicle objects to see if they are equal.
     * 
     * @param theOtherVehicle The Vehicle object to be compared for equality.
     * @return True or false on whether two Vehicle type objects are equal.
     */
    @Override
    public boolean equals(final Object theOtherVehicle) {

        final boolean result;

        if (this == theOtherVehicle) {

            result = true;

        } else if (theOtherVehicle == null) {

            result = false;

        } else if (this.getClass() != theOtherVehicle.getClass()) {

            result = false;

        } else {

            final Vehicle someVehicle = (Vehicle) theOtherVehicle;
            result = this.getMyVehicleID() == someVehicle.getMyVehicleID()
                     && this.getMyName().equals(someVehicle.getMyName())
                     && this.getMyVIN().equals(someVehicle.getMyVIN())
                     && this.myRent == someVehicle.isMyRent();
        }

        return result;

    }

    /**
     * Generates the hashcode using myVehicleID, myName, myVIN, and myRent as values.
     * 
     * @return the hashcode represented by the instance field values.
     */
    @Override
    public int hashCode() {

        return Objects.hash(myVehicleID, myName, myVIN, myRent);

    }

}