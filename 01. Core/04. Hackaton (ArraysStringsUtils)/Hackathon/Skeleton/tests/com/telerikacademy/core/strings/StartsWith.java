package com.telerikacademy.core.strings;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class StartsWith {
    
    @Test
    @DisplayName("startsWith() returns true when strings starts with target")
    public void startsWith_true() {
        //Arrange
        var word = "Telerik Academy";
        
        //Act
        var result = StringHelpers.startsWith(word, 'T');
        
        //Assert
        Assertions.assertTrue(result);
    }
    
    @Test
    @DisplayName("startsWith() returns false when strings doesn't start with target")
    public void startsWith_false() {
        //Arrange
        var word = "Telerik Academy";
        
        //Act
        var result = StringHelpers.startsWith(word, 'q');
        
        //Assert
        Assertions.assertFalse(result);
    }
    
    @Test
    @DisplayName("startsWith() returns false when given empty string")
    public void startsWith_empty() {
        //Arrange
        var word = "";
        
        //Act
        var result = StringHelpers.startsWith(word, 'q');
        
        //Assert
        Assertions.assertFalse(result);
    }
    
}
