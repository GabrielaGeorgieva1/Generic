package com.telerikacademy.core.strings;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Concat {
    
    @Test
    @DisplayName("concat() concatenates two strings")
    public void concat_concatenates() {
        //Arrange
        var word1 = "Telerik";
        var word2 = " Academy";
        var expected = "Telerik Academy";
        
        //Act
        var result = StringHelpers.concat(word1, word2);
        
        //Assert
        Assertions.assertEquals(expected, result);
    }
    
    @Test
    @DisplayName("concat() returns only second string if first is empty")
    public void concat_empty() {
        //Arrange
        var word1 = "";
        var word2 = "Academy";
        var expected = "Academy";
        
        //Act
        var result = StringHelpers.concat(word1, word2);
        
        //Assert
        Assertions.assertEquals(expected, result);
    }
    
}
