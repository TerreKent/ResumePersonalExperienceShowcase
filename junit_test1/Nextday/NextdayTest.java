package com.summer.test1.Nextday;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.matchers.JUnitMatchers.containsString;

public class NextdayTest {
    @Test
    public void test(){
        Date date=new Date(6,1,2023);
        Date d = Nextday.nextDay(date);
        String s= d.toString();
        Assert.assertEquals("6/2/2023",s);
    }
    @Test
    public void test01(){
        Date date=new Date(2,28,2023);
        Date d = Nextday.nextDay(date);
        String s= d.toString();
        Assert.assertEquals("3/1/2023",s);
    }

    @Test
    public void test02(){
        Date date=new Date(2,29,2024);
        Date d = Nextday.nextDay(date);
        String s= d.toString();
        Assert.assertEquals("3/1/2024",s);
    }

    @Test
    public void test03(){
        Date date=new Date(1,31,2023);
        Date d = Nextday.nextDay(date);
        String s= d.toString();
        Assert.assertEquals("2/1/2023",s);
    }

    @Test
    public void test04(){
        Date date=new Date(6,30,2023);
        Date d = Nextday.nextDay(date);
        String s= d.toString();
        Assert.assertEquals("7/1/2023",s);
    }
    @Test
    public void test05(){
        Date date=new Date(12,31,2023);
        Date d = Nextday.nextDay(date);
        String s= d.toString();
        Assert.assertEquals("1/1/2024",s);
    }
    @Test
    public void testDate01(){
        try{
            Date date=new Date(-1,1,2023);
            Nextday n=new Nextday();
            Date d=Nextday.nextDay(date);
        }catch(IllegalArgumentException e){
            assertThat(e.getMessage(),containsString("Not a valid month"));
        }
    }
    @Test
    public void testDate02(){
        try{
            Date date=new Date(13,1,2023);
            Nextday n=new Nextday();
            Date d=Nextday.nextDay(date);
        }catch(IllegalArgumentException e){
            assertThat(e.getMessage(),containsString("Not a valid month"));
        }
    }
    @Test
    public void testDate03(){
        try{
            Date date=new Date(1,-1,2023);
            Nextday n=new Nextday();
            Date d=Nextday.nextDay(date);
        }catch(IllegalArgumentException e){
            assertThat(e.getMessage(),containsString("Not a valid day"));
        }
    }
    @Test
    public void testDate04(){
        try{
            Date date=new Date(2,29,2023);
            Nextday n=new Nextday();
            Date d=Nextday.nextDay(date);
        }catch(IllegalArgumentException e){
            assertThat(e.getMessage(),containsString("Not a valid day"));
        }
    }
    @Test
    public void testDate05(){
        try{
            Date date=new Date(3,32,2023);
            Nextday n=new Nextday();
            Date d=Nextday.nextDay(date);
        }catch(IllegalArgumentException e){
            assertThat(e.getMessage(),containsString("Not a valid day"));
        }
    }
    @Test
    public void testDate06(){
        try{
            Date date=new Date(6,31,2023);
            Nextday n=new Nextday();
            Date d=Nextday.nextDay(date);
        }catch(IllegalArgumentException e){
            assertThat(e.getMessage(),containsString("Not a valid day"));
        }
    }


}
