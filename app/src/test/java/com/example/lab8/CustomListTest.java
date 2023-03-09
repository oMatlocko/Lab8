package com.example.lab8;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


//import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class CustomListTest {

    private CustomList list;
    /**
     * create a mocklist for my citylist
     * @return
     */
    public CustomList MockCityList(){
        list = new CustomList(null,new ArrayList<>());
        return list;
    }

    /**
     * get the size of the list
     * increase the list by adding a new city
     * check if our current size matches the initial size plus
     one
     */
    @Test
    public void addCityTest(){
        list = MockCityList();
        int listSize = list.getCount();
        list.addCity(new City("Estevan", "SK"));
        assertEquals(list.getCount(),listSize + 1);
    }

    /**
     * create a new city
     * add it to the list
     * check if the list contains the city
     */
    @Test
    public void hasCityTest(){
        list = MockCityList();
        City city = new City("Estevan", "SK");
        list.addCity(city);
        assertEquals(list.hasCity(city),true);
    }

    /**
     * create a new city
     * add it to the list
     * check check if the list contains the city
     * check if the list size is 1
     * remove the city from the list
     * check if the list contains the city
     * check if the list size is 0
     */
    @Test
    public void deleteCitiesTest(){
        list = MockCityList();
        City city = new City("Estevan", "SK");
        list.addCity(city);
        assertEquals(list.countCities(),1);
        list.deleteCity(city);
        assertEquals(list.countCities(),0);
    }


    /**
     * create a new city
     * add it to the list
     * check if the list contains the city
     * check if the list size is 1
     * remove the city from the list
     * check if the list contains the city
     * check if the list size is 0
     */
    @Test
    public void countCitiesTest(){
        list = MockCityList();
        City city = new City("Estevan", "SK");
        list.addCity(city);
        assertEquals(list.getCount(),1);
    }


}
