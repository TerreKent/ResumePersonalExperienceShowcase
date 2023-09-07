package com.summer.test1.Triangle;

import org.junit.Test;
import static org.junit.Assert.*;

public class TriangleTest {
    Triangle T1 = new Triangle(2,3,4);
    Triangle T2 = new Triangle(6,6,6);
    Triangle T3 = new Triangle(5,5,6);
    Triangle T4 = new Triangle(1,1,5);
    Triangle T5 = new Triangle(-1,1,5);
    @Test
    public void testIsTriangle(){
        assertEquals(true,T1.isTriangle(T1));
        assertEquals(true,T2.isTriangle(T2));
        assertEquals(true,T3.isTriangle(T3));
        assertEquals(false,T4.isTriangle(T4));
        assertEquals(false,T5.isTriangle(T5));
    }

    @Test
    public void testGetType(){
        assertEquals("Scalene",T1.getType(T1));
        assertEquals("Regular",T2.getType(T2));
        assertEquals("Isosceles",T3.getType(T3));
        assertEquals("Illegal",T4.getType(T4));
        assertEquals("Illegal",T5.getType(T5));
    }

    @Test
    public void testDiffOfBorders(){
        assertEquals(1,T1.diffOfBorders(2,3));
    }

    @Test
    public void testGetBorders(){
        long[] borders = new long[3];
        borders[0]=2;
        borders[1]=3;
        borders[2]=4;
        assertArrayEquals(borders,T1.getBorders());
    }
}
