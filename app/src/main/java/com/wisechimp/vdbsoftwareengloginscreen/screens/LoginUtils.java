package com.wisechimp.vdbsoftwareengloginscreen.screens;

public class LoginUtils {

    /**
     * This method checks is the string provided is a valid email address
     * and returns true if it is
     *
     * @param email
     * @return
     */
    public boolean isEmailAddressValid(String email) {
        boolean hasAtSign = email.indexOf("@") > -1;
        return hasAtSign;
    }

    /**
     * This method returns the length of the local part of the email address
     * which is the part prior to the "@" in the email address
     *
     * @param email
     * @return
     */
    public int getLocalPartLength(String email){
        int end = email.indexOf("@");
        String localPart = email.substring(0, end);
        return localPart.length();
    }
}
