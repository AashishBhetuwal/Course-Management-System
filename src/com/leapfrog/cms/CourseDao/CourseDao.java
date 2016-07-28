/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.cms.CourseDao;

import com.leapfrog.cms.Course.Course;

/**
 *
 * @author Toshiba
 */
public interface CourseDao {
    
        boolean insert(Course c);
        boolean update(Course c);
        boolean delete(int id);
        Course getById(int id);
        Course[] getAll();
        
    
} 
 