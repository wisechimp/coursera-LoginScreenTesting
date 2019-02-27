package com.wisechimp.vdbsoftwareengloginscreen;

import com.wisechimp.vdbsoftwareengloginscreen.screens.LoginUtils;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class LoginUtilsTest {

    private LoginUtils utils;

    @Before
    public void setUp(){
        utils = new LoginUtils();
    }

    @Test
    public void validEmailAddressPasses() throws Exception {
        assertTrue(utils.isEmailAddressValid("test@testing.com"));
    }

    @Test
    public void invalidEmailAddressFails() throws Exception {
        assertTrue(!utils.isEmailAddressValid("invalid"));
    }

    @Test
    public void localPartLengthForValidEmailAddress() throws Exception {
        assertEquals(1, utils.getLocalPartLength("a@b.com"));
    }
}