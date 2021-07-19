package com.telerikacademy.core.strings;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class FirstIndexOf {
    
    @Test
    @DisplayName("findIndexOf() returns the index when the string contains the target character")
    public void firstIndexOf_exists() {
        //Arrange
        var word = "Telerik Academy";
        
        //Act
        var result = StringHelpers.firstIndexOf(word, 'k');
        
        //Assert
        Assertions.assertEquals(6, result);
    }
    
    @Test
    @DisplayName("findIndexOf() returns -1 when the string doesn't contain the target character")
    public void firstIndexOf_doesnt_exist() {
        //Arrange
        var word = "Telerik Academy";
        
        //Act
        var result = StringHelpers.firstIndexOf(word, 'w');
        
        //Assert
        Assertions.assertEquals(-1, result);
    }
    
    
    @Test
    @DisplayName("findIndexOf() returns -1 when the string is empty")
    public void firstIndexOf_empty() {
        //Arrange
        var word = "";
        
        //Act
        var result = StringHelpers.firstIndexOf(word, 'w');
        
        //Assert
        Assertions.assertEquals(-1, result);
    }
    
}
