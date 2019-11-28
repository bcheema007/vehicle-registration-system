/**
 * Generates the bill for the vehicle registration system.
 */

package model;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Locale;
import model.vehicles.Vehicle;

/**
 * @author alone117
 * @version Fall 2019
 *
 */
public class Bill {

    /**
     * Displays an amount fashioned on the US currency system.
     */
    public static final NumberFormat NF = NumberFormat.getCurrencyInstance(Locale.US);

    /**
     * A unique integer value.
     */
    private final int myBillID;

    /**
     * A User object.
     */
    private final User myPrimaryUser;

    /**
     * A Vehicle object.
     */
    private final Vehicle myVehicle;

    /**
     * An integer representing the number of days Vehicle is rented.
     */
    private final int myNumDays;

    /**
     * Total bill amount.
     */
    private BigDecimal myBillAmount;

    /**
     * Parameterized constructor for the Bill class. Initializes relevant instance fields.
     * 
     * @param theBillID A unique integer value assigned to the bill.
     * @param thePrimaryUser A User object.
     * @param theVehicle A Vehicle object.
     * @param theNumDays An integer representing the number of days Vehicle is rented.
     */
    public Bill(final int theBillID, final User thePrimaryUser, final Vehicle theVehicle,
                final int theNumDays) {

        this.myBillID = theBillID;
        this.myPrimaryUser = thePrimaryUser;
        this.myVehicle = theVehicle;
        this.myNumDays = theNumDays;
        this.myBillAmount = new BigDecimal("0.0");

    }

    /**
     * Computes and prints the total bill amount.
     */
    public void computeAndPrintAmount() {

        System.out.println("----Cost Information----");
        System.out.println("RentalPerDay:");
        final BigDecimal calculateRent = myVehicle.calculateRentalAmount();
        System.out.println("Cost per day: " + NF.format(calculateRent));
        System.out.println("No. of Rental days: " + myNumDays);
        final BigDecimal numOfDays = new BigDecimal(myNumDays);
        final BigDecimal totalAmountBefore = calculateRent.multiply(numOfDays);
        System.out.println("Total Amount: " + NF.format(totalAmountBefore));
        final BigDecimal onePercentRate = new BigDecimal("0.01");
        final BigDecimal insurance = totalAmountBefore.multiply(onePercentRate);
        System.out.println("Insurance: " + NF.format(insurance));
        BigDecimal vipStatus = new BigDecimal("0.00");
        if (myPrimaryUser.getMyVIPStatus()) {

            vipStatus = totalAmountBefore.multiply(onePercentRate);
            System.out.println("VIPDiscount: -" + NF.format(vipStatus));

        } else {

            System.out.println("VIPDiscount: " + NF.format(vipStatus));
        }

        final BigDecimal tax = totalAmountBefore.multiply(new BigDecimal("0.1"));
        System.out.println("Tax: " + NF.format(tax));

        myBillAmount = totalAmountBefore.add(insurance).subtract(vipStatus).add(tax);
        System.out.println("Total Rent: " + NF.format(myBillAmount));
        System.out.println("Rent Successful");
        System.out.println("**********************");

    }

    /**
     * Who is the User renting the Vehicle?
     * 
     * @return the User object renting the Vehicle.
     */
    public User getMyPrimaryUser() { // need this method in order to do extra credit.

        return myPrimaryUser;

    }

    /**
     * How many days is the Vehicle being rented for?
     * 
     * @return The number of days vehicle is being rented for.
     */
    public int getMyNumDays() { // need this method in order to do extra credit

        return myNumDays;

    }

    /**
     * What is the total cost for renting this Vehicle?
     * 
     * @return The total bill amount.
     */
    public BigDecimal getMyBillAmount() { // need this method in order to do extra-credit

        return myBillAmount;

    }

}
