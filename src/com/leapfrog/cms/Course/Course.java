/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.cms.Course;

/**
 *
 * @author Toshiba
 */
public class Course {
        private int id;
        private String type, description;
        private int seatsavailable;
        private double price;

    public Course() {
    }

    public Course(int id, String type, String description, int seatsavailable, double price) {
        this.id = id;
        this.type = type;
        this.description = description;
       
        this.seatsavailable = seatsavailable;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

   

    public int getSeatsavailable() {
        return seatsavailable;
    }

    public void setSeatsavailable(int seatsavailable) {
        this.seatsavailable = seatsavailable;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
        
    
        
        
    
}
