/*
 * Unit tests for User class methods.
 */

package junitests;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Objects;
import model.User;
import org.junit.Before;
import org.junit.Test;

/**
 * @author alone117
 * @version Fall 2019
 */
public class UserTest {

    /**
     * First User object to be instantiated.
     */
    private User myUser1;
    /**
     * Second User object to be instantiated.
     */
    private User myUser2;

    /**
     * Fourth User object to be instantiated.
     */
    private User myUser4;

    /**
     * Instantiate User object fields.
     */
    @Before
    public void setUp() {
        myUser1 = new User("bobby", "ab10!zz", true);
        myUser2 = new User("sora", "123!abc", false);
        myUser4 = new User("goro", "1010gs!");
    }

    /**
     * Tests whether hashcodes for two equal User objects are equivalent. Test method for
     * {@link model.User#hashCode()}.
     */
    @Test
    public void testHashCode() {

        assertEquals("HashCode method failed - values",
                     Objects.hash(myUser1.getMyName(), myUser1.getMyPassword(),
                                  myUser1.getMyVIPStatus()),
                     myUser1.hashCode());

        final User user3 = new User("bobby", "ab10!zz", true);
        assertEquals("HashCode method failed - equals constraint", myUser1.hashCode(),
                     user3.hashCode());

    }

    /**
     * Conducts a test for the User constructor which takes as parameters two strings which are
     * the user's username and password. Checks whether the expected and actual results are
     * equal. Tests whether username and password contains null values. Test whether the VIP
     * status is false. Test method for
     * {@link model.User#User(java.lang.String, java.lang.String)}.
     */
    @Test
    public void testUserStringString() {

        assertNotNull("Value for username is null", myUser4.getMyName());
        assertNotNull("Value for password is null", myUser4.getMyPassword());
        assertEquals("Username does not match", "goro", myUser4.getMyName());
        assertEquals("Password does not match", "1010gs!", myUser4.getMyPassword());
        assertFalse("Value for VIP status is null", myUser4.getMyVIPStatus());

    }

    /**
     * Tests to see if IllegalArgumentException is thrown if username is an empty string.
     */
    @Test(expected = IllegalArgumentException.class)
    public void testIfUsernameIsEmptyString() {

        new User("", "ab10!qq");

    }

    /**
     * Tests to see if IllegalArgumentException is thrown if password is an empty string.
     */
    @Test(expected = IllegalArgumentException.class)
    public void testIfPasswordIsEmptyString() {

        new User("naruto", "");

    }

    /**
     * Conducts a test for the User constructor which takes as parameters two strings and one
     * boolean value which are the user's username, password, and their VIP status. Checks
     * whether the expected and actual results are equal. Tests whether username and password
     * contains null values. Test method for
     * {@link model.User#User(java.lang.String, java.lang.String, boolean)}.
     */
    @Test
    public void testUserStringStringBoolean() {

        assertNotNull("Value for username is null", myUser2.getMyName());
        assertNotNull("Value for password is null", myUser2.getMyPassword());
        assertEquals("Username does not match", "sora", myUser2.getMyName());
        assertEquals("Password does not match", "123!abc", myUser2.getMyPassword());
        assertEquals("VIP status does not match", false, myUser2.getMyVIPStatus());

    }

    /**
     * Tests to see if IllegalArgumentException is thrown if username is an empty string.
     */
    @Test(expected = IllegalArgumentException.class)
    public void testIfUsernameIsEmptyStringThreeParameterConstructor() {

        new User("", "ab10!qq", true);

    }

    /**
     * Tests to see if IllegalArgumentException is thrown if password is an empty string.
     */
    @Test(expected = IllegalArgumentException.class)
    public void testIfPasswordIsEmptyStringThreeParameterConstructor() {

        new User("naruto", "", false);

    }

    /**
     * Tests whether the getMyName method in the User class returns the correct username for
     * the parameterized constructor with 2 parameters and for the parameterized constructor
     * with 3 parameters. Test method for {@link model.User#getMyName()}.
     */
    @Test
    public void testGetMyName() {

        assertEquals("Getter for myName failed - parameterized constructor,two parameter",
                     "goro", myUser4.getMyName());
        assertEquals("Getter for myName failed - parameterized constuctor,three parameter",
                     "sora", myUser2.getMyName());

    }

    /**
     * Tests whether the getMyPassword method in the User class returns the correct password
     * for the parameterized constructor with 2 parameters and for the parameterized
     * constructor with 3 parameters. Test method for {@link model.User#getMyPassword()}.
     */
    @Test
    public void testGetMyPassword() {

        assertEquals("Getter for myPassword failed - parameterized constructor,two parameter",
                     "1010gs!", myUser4.getMyPassword());
        assertEquals("Getter for myPassword failed - parameterized constuctor,three parameter",
                     "123!abc", myUser2.getMyPassword());

    }

    /**
     * Tests whether the getMyVIPStatus method in the User class returns the correct VIP status
     * of the user for the parameterized constructor with 2 parameters and for the
     * parameterized constructor with 3 parameters. Test method for
     * {@link model.User#getMyVIPStatus()}.
     */
    @Test
    public void testGetMyVIPStatus() {

        assertEquals("Getter for myVIPStatus failed - parameterized constructor,two parameter",
                     false, myUser4.getMyVIPStatus());
        assertEquals("Getter for myVIPStatus failed -parameterized constuctor,three parameter",
                     true, myUser1.getMyVIPStatus());

    }

    /**
     * Tests whether the User class toString method returns the correct string representation
     * of a User object for both parameterized constructors. Test method for
     * {@link model.User#toString()}.
     */
    @Test
    public void testToString() {

        assertEquals("Parameterized constructor,two parameters toString format is incorrect",
                     "User (goro, 1010gs!, false)", myUser4.toString());
        assertEquals("Parameterized constructor,three parameters toString format is incorrect",
                     "User (bobby, ab10!zz, true)", myUser1.toString());

    }

    /**
     * Tests whether two User objects are equal by positive tests which include reflexive, and
     * same value comparison tests. Also test User objects by negative tests which include
     * checking for null value, different value comparison, and different object class tests.
     * Test method for {@link model.User#equals(java.lang.Object)}.
     */
    @Test
    public void testEqualsObjectPositive() {

        final User sampleUser5 = new User("bobby", "ab10!zz", true);

        // reflexive property is satisfied
        assertEquals("Equals failed - reflexive", myUser1, myUser1);

        // if both User objects have the same username, password, and VIP status values
        assertEquals("Equals failed - value equality", myUser1, sampleUser5);

    }

    /**
     * Tests whether two User objects are equal by positive tests which include reflexive, and
     * same value comparison tests. Also test User objects by negative tests which include
     * checking for null value, different value comparison, and different object class tests.
     * Test method for {@link model.User#equals(java.lang.Object)}.
     */
    @Test
    public void testEqualsObjectNegative() {

        // null object
        assertNotEquals("Equals failed - null", myUser1, null);

        // other User object has different username, password, or VIP status values
        assertNotEquals("Equals failed - different values", myUser1, myUser4);

        // other object is of a different class
        assertNotEquals("Equals failed - different class", myUser1, new ArrayList<Integer>());

    }

}
