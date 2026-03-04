package com.example.lab08;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class CustomList {
    private List<City> cities;

    public CustomList() {
        this.cities = new ArrayList<>();
    }

    public void addCity(City city) {
        cities.add(city);
    }

    // Will be implemented later using TDD (leave blank for now)
    // public boolean hasCity(City city) { ... }
    public boolean hasCity(City city) {
        return cities.contains(city);
    }

    public void deleteCity(City city) {
        for (int i = 0; i < cities.size(); i++) {
            if ((city.hashCode() == cities.get(i).hashCode()) && city.equals(cities.get(i))) {
                cities.remove(cities.get(i));
                return;
            }
        }
        throw new NoSuchElementException();
    }

    public int countCities() {
        return cities.size();
    }
}
