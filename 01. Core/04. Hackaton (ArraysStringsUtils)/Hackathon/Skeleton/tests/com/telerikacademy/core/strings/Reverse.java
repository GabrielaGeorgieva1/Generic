package com.telerikacademy.core.strings;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Reverse {
    
    @Test
    @DisplayName("reverse() reverses the given string")
    public void reverse() {
        //Arrange
        var word = "Telerik Academy";
        var expected = "ymedacA kireleT";
        
        //Act
        var result = StringHelpers.reverse(word);
        
        //Assert
        Assertions.assertEquals(expected, result);
    }
    
}
