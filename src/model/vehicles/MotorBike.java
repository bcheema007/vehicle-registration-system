/**
 * Sub-class of Vehicle class.
 */

package model.vehicles;

import java.math.BigDecimal;
import java.util.Objects;

/**
 * @author alone117
 * @version Fall 2019
 *
 */
public class MotorBike extends Vehicle {

    /**
     * Boolean instance field for whether MotorBike can tour or not.
     */
    private final boolean myTouring;

    /**
     * Parameterized constructor for MotorBike object.
     * 
     * @param theVehicleID Unique ID generated by rental manager when creating inventory.
     * @param theName Name of the vehicle.
     * @param theVIN Unique Vehicle Identification Number.
     * @param theRent Whether or not the object is available for rent.
     * @param theTouring Whether or not object has touring capability.
     */
    public MotorBike(final int theVehicleID, final String theName, final String theVIN,
                     final boolean theRent, final boolean theTouring) {

        super(theVehicleID, theName, theVIN, theRent);
        this.myTouring = theTouring;

    }

    /**
     * Is MotorBike of type touring?
     * 
     * @return True or false on whether MotorBike can tour.
     */
    public boolean isMyTouring() {

        return myTouring;

    }

    /**
     * What is the rental amount for a Bike1 MotorBike object?
     * 
     * @return A BigDecimal number representing rental amount for Bike1 MotorBike object.
     */
    public BigDecimal calculateRentalAmount() {

        myRentalAmount = new BigDecimal(BASE_FARE * 2);

        if (this.isMyTouring()) {

            final int magicNumber = 5;

            myRentalAmount = new BigDecimal((BASE_FARE * 2) + magicNumber);

        }

        return myRentalAmount;

    }

    /**
     * Returns a string representation of a MotorBike object.
     * 
     * @return The string representation of the MotorBike object.
     */
    @Override
    public String toString() {

        final String start = " (";
        final String comma = ", ";
        final StringBuilder sb = new StringBuilder(33);
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
        sb.append(comma);
        sb.append("IsTouring?:");
        sb.append(isMyTouring());
        sb.append(')');

        return sb.toString();

    }

    /**
     * Compares two types of MotorBike objects to see if they are equal.
     * 
     * @param theOtherBike The MotorBike object to be compared for equality.
     * @return true or false on whether two MotorBike type objects are equal.
     */
    @Override
    public boolean equals(final Object theOtherBike) {

        final boolean result;

        if (this == theOtherBike) {

            result = true;

        } else if (theOtherBike == null) {

            result = false;

        } else if (this.getClass() != theOtherBike.getClass()) {

            result = false;

        } else {

            final MotorBike someBike = (MotorBike) theOtherBike;
            result = this.getMyVehicleID() == someBike.getMyVehicleID()
                     && this.getMyName().equals(someBike.getMyName())
                     && this.getMyVIN().equals(someBike.getMyVIN())
                     && this.isMyRent() == someBike.isMyRent()
                     && this.isMyTouring() == someBike.isMyTouring();
        }

        return result;

    }

    /**
     * Generates the hashcode using myVehicleID, myName, myVIN, myRent, and myTouring as
     * values.
     * 
     * @return the hashcode represented by the instance field values.
     */
    @Override
    public int hashCode() {

        return Objects.hash(myVehicleID, myName, myVIN, myRent, myTouring);

    }

}
