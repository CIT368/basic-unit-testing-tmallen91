// Author:     Travis Allen
// Date:       25FEB2020
// Purpose:    Test cases for the Telephone.class format() method.

import static org.junit.Assert.*;


import org.junit.Test;

public class TelephoneTest{
    @Test //Test expected user input
    public void ChallengeNumbers(){
        assertEquals("(570)322-3128", Telephone.format("5703223128"));
    }

    @Test //Challenge if input is characters
    public void ChallengeChars(){
        assertEquals("(abc)def-ghij", Telephone.format("abcdefghij"));
    }

    @Test //Test if the function does not format strings longer than the UNFORMATTED_LENGTH 
    public void FailFormatting(){
        assertEquals("12345678901", Telephone.format("12345678901"));
    }

    @Test //Something other than assertEquals. Challenge that the formatted string is three extra characters long.
    public void ChallengeLength(){
        assertTrue(Telephone.format("1234567890").length() == 13);
    }

}