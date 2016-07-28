/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.cms.Courseimplement;

import com.leapfrog.cms.Course.Course;
import com.leapfrog.cms.CourseDao.CourseDao;

/**
 *
 * @author Toshiba
 */
public class CourseDaoImpl implements CourseDao {

    private int counter = 0;
    private Course[] courseList = new Course[5];

    @Override
    public boolean insert(Course c) {
        
        if (counter == courseList.length) {
            return false;
        }
        courseList[counter] = c;
        counter++;

        return true;
    }

    @Override
    public boolean update(Course c) {
        return true;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(int id) {
        for (int i = 0; i < courseList.length; i++) {
            Course c = courseList[i];
            if (c != null && c.getId() == id) {
                courseList[i] = null;
                return true;
            }
        }
        return false;
    }

    @Override
    public Course getById(int id) {
        for (int i = 0; i < courseList.length; i++) {
            Course c = courseList[i];
            if (c != null && c.getId() == id) {

                return c;
            }
        }

        return null;
    }

    @Override
    public Course[] getAll() {
        return courseList;
    }

}
