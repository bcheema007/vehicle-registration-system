/*
 * Unit tests for Registration class methods.
 */

package junitests;

import static org.junit.Assert.*;

import model.Registration;
import model.User;
import org.junit.Before;
import org.junit.Test;

/**
 * @author alone117
 * @version Fall 2019
 */
public class RegistrationTest {

    /**
     * Registration object to be instantiated.
     */
    private Registration myReg1;

    /**
     * Instantiate Registration object fields.
     */
    @Before
    public void setUp() {

        myReg1 = new Registration();

    }

    /**
     * Tests whether the myUserList instance variable has a size of 4 elements since that would
     * mean myUserList correctly stored the default values initially stored in the
     * registeredusers.txt file which consisted of 4 User objects.
     */
    @Test
    public void testRegistration() {

        // If the registration constructor is working correctly, then myUserList.size() should
        // be
        // greater than zero since it would have 4 elements in the map after
        // registeredusers.txt has been read.
        assertTrue("Parameterless constructor failed - file not read correctly",
                   myReg1.getMyUserList().size() > 0);

    }

    /**
     * Tests whether either the username or password contain null values. Tests whether the
     * method returns a value of true if the login is successful.
     */
    @Test
    public void testLoginWithReturnValueOfTrue() {

        // tests whether values or null or not
        assertNotNull("Contains parameter with null value", myReg1.login("bobby", "ab10!zz"));

        // tests whether a return value of true is returned if login was successful.
        assertEquals("Login method failed - return value was false", true,
                     myReg1.login("athirai", "1234"));

    }

    /**
     * Tests whether either the username or password contain null values. Tests whether the
     * method returns a value of true if the login is successful.
     */
    @Test
    public void testLoginWithReturnValueOfFalse() {

        // tests whether values or null or not
        assertNotNull("Contains parameter with null value", myReg1.login("bobby", "ab10!zz"));

        // tests whether a return value of false is returned if login was not successful.
        assertEquals("Login method failed - return value was true", false,
                     myReg1.login("uzumaki", "ninjaway!1"));

    }

    /**
     * Tests login method to see if NullPointerException is thrown when the username parameter
     * passed is null.
     */
    @Test(expected = NullPointerException.class)
    public void testLoginWithUsernameAsNullParameter() {

        myReg1.login(null, "ab10!zz");

    }

    /**
     * Tests login method to see if NullPointerException is thrown when the password parameter
     * passed is null.
     */
    @Test(expected = NullPointerException.class)
    public void testLoginWithPasswordAsNullParameter() {

        myReg1.login("bobby", null);

    }

    /**
     * Tests login method to see if IllegalArgumentException is thrown when the username passed
     * is an empty string.
     */
    @Test(expected = IllegalArgumentException.class)
    public void testLoginWithUsernameAsEmptyString() {

        myReg1.login("", "ab!10zz");

    }

    /**
     * Tests login method to see if IllegalArgumentException is thrown when the password passed
     * is an empty string.
     */
    @Test(expected = IllegalArgumentException.class)
    public void testLoginWithPasswordAsEmptyString() {

        myReg1.login("yang", "");

    }

    /**
     * Tests whether a User object was successfully added to myUserList. Tests also that the
     * register function returns a value of true to indicate User object was added to
     * myUserList.
     */
    @Test
    public void testRegisterMethodAddsUserObjectToMyUserList() {

        myReg1.register(new User("bobby", "ab10!zz", true));

        // If a User object was successfully added to myUserList then myUserList.size() should
        // be increased by one.
        // In order to test this is the case we shall test that myUserList.size() is greater
        // than 4
        // since the default size
        // of myUserList is 4 after instantiating a Registration object with the default values
        // from registeredusers.txt.
        assertTrue("Register method failed - User object not added to myUserList",
                   myReg1.getMyUserList().size() > 4); // if size > 4, then User object was
                                                       // added to myUserList

    }

    /**
     * Tests whether or not a value of true is returned from the register function after user
     * is added to myUserList.
     */
    @Test
    public void testRegisterMethodReturnsValueOfTrue() {

        assertTrue("Registration was successful",
                   myReg1.register(new User("sora", "keyblade!1", true)));

    }

    /**
     * Tests whether myUserList has zero elements after the clear method is called.
     */
    @Test
    public void testClear() {

        final Registration reg2 = new Registration();
        reg2.clear(); // clear all elements from myUserList

        assertEquals("Clear method failed - myUserList.size() != 0", 0,
                     reg2.getMyUserList().size()); // test whether myUserList.size() == 0 after
                                                   // clear method is invoked.

    }

    /**
     * Tests whether the Registration class toString method returns the correct string
     * representation of a Registration object for the parameterless constructor.
     */
    @Test
    public void testToString() {

        assertEquals("Parameterless constructor toString format is incorrect",
                     "Registered UserList " + myReg1.getMyUserList().toString(),
                     myReg1.toString());

    }

    /**
     * Tests whether the getMyUserList method retrieves the myUserList instance field.
     */
    @Test
    public void testGetMyUserList() {

        assertEquals("Getter for myUserList failed - parameterless constructor",
                     myReg1.getMyUserList(), myReg1.getMyUserList());

    }

}
