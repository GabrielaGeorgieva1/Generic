package com.telerikacademy.core.strings;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Contains {
    
    @Test
    @DisplayName("contains() returns true when the given string contains the character")
    public void contains_true() {
        //Arrange
        var word = "Telerik Academy";
        
        //Act, Assert
        Assertions.assertTrue(StringHelpers.contains(word, 'k'));
        
    }
    
    @Test
    @DisplayName("contains() returns false when the given string doesn't contain the character")
    public void contains_false() {
        //Arrange
        var word = "Telerik Academy";
        
        //Act, Assert
        Assertions.assertFalse(StringHelpers.contains(word, 'q'));
        
    }
    
    @Test
    @DisplayName("contains() returns false when string is empty")
    public void contains_empty() {
        //Arrange
        var word = "";
        
        //Act, Assert
        Assertions.assertFalse(StringHelpers.contains(word, 'q'));
        
    }
    
}
