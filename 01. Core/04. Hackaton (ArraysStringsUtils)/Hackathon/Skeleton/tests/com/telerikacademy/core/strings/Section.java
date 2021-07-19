package com.telerikacademy.core.strings;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Section {
    
    @Test
    @DisplayName("section() returns the correct part of the source string")
    public void section() {
        //Arrange
        var source = "xxTelerik Academyxx";
        var expected = "Telerik Academy";
        
        //Act
        var result = StringHelpers.section(source, 2, 16);
        
        //Assert
        Assertions.assertEquals(expected, result);
    }
    
}
