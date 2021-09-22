package com.example.demo;

import java.util.ArrayList;

public class CityRepository {

    ArrayList<String> city = new ArrayList<>();

    public CityRepository(){
        this.city.add("Balti");
        this.city.add("Chisinau");
        this.city.add("Drochia");
        this.city.add("Soroca");
        this.city.add("Edinet");
    }
    public String create(String countryName){
        this.city.add(countryName);
        return "City created";
    }

    public String read(Integer id){
        try {
            return id + ":" + this.city.get(id);
        } catch (Exception exception){
            return "Not found";
        }
    }

    public String readAll(){
        return this.city.toString();
    }

    public String update(Integer id, String countryName){
        try {
            this.city.set(id, countryName);
            return "City updated";
        } catch (Exception exception){
            return "City not found";
        }
    }

    public String delete(Integer id){
        try {
            this.city.remove(this.city.get(id));
            return "City deleted";
        } catch (Exception exception){
            return "City not found";
        }

    }
}