package com.telerikacademy.core.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Section {
    
    @Test
    @DisplayName("subArray() returns modified array")
    public void subArray_returns_modifiedArray() {
        //Arrange
        var source = new int[]{1, 2, 3, 4, 5, 6};
        var expected = new int[]{2, 3, 4, 5};
        
        //Act
        var result = ArrayHelpers.section(source, 1, 4);
        
        //Assert
        Assertions.assertArrayEquals(expected, result);
    }
    
    @Test
    @DisplayName("subArray() returns modified array starting from 0")
    public void subArray_returns_modifiedArray_start_head() {
        //Arrange
        var source = new int[]{1, 2, 3, 4, 5, 6};
        var expected = new int[]{1, 2, 3, 4, 5};
        
        //Act
        var result = ArrayHelpers.section(source, 0, 4);
        
        //Assert
        Assertions.assertArrayEquals(expected, result);
    }
    
    @Test
    @DisplayName("subArray() returns empty array")
    public void subArray_returns_modifiedArray_empty_source() {
        //Arrange
        var source = new int[]{};
        var expected = new int[]{};
        
        //Act
        var result = ArrayHelpers.section(source, 0, 4);
        
        //Assert
        Assertions.assertArrayEquals(expected, result);
    }
    
    @Test
    @DisplayName("subArray() takes all remaining when given longer length")
    public void subArray_returns_modifiedArray_longerLength() {
        //Arrange
        var source = new int[]{1, 2, 3, 4, 5, 6};
        var expected = new int[]{3, 4, 5, 6};
        
        //Act
        var result = ArrayHelpers.section(source, 2, 10);
        
        //Assert
        Assertions.assertArrayEquals(expected, result);
    }
    
    @Test
    @DisplayName("subArray() returns source array when given invalid startIndex")
    public void subArray_returns_sourceArray_invalidIndex() {
        //Arrange
        var source = new int[]{1, 2, 3};
        var expected = new int[]{1, 2, 3};
        
        //Act
        var result = ArrayHelpers.section(source, 10, 1);
        
        //Assert
        Assertions.assertArrayEquals(expected, result);
    }
    
}
