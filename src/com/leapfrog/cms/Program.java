/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.cms;

import com.leapfrog.cms.Course.Course;
import com.leapfrog.cms.CourseDao.CourseDao;
import com.leapfrog.cms.Courseimplement.CourseDaoImpl;
import java.util.Scanner;

/**
 *
 * @author Toshiba
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

// TODO code application logic here
        CourseDao courseDao = new CourseDaoImpl();
while(true){
        System.out.println("1. Add Course");
        System.out.println("2. Update Course");
        System.out.println("3. Delete Course");
        System.out.println("4. See all Courses");
        System.out.println("5. Search by ID");
        System.out.println("6. Exit");
        System.out.println("Enter your choice:[1-5]");

        switch (sc.nextInt()) {
            case 1:
                System.out.println("Add courses");
                Course c = new Course();
                System.out.println("Enter Course Id");
                c.setId(sc.nextInt());
                System.out.println("Enter Course Type");
                c.setType(sc.next());
                System.out.println("Enter Course Description");
                c.setDescription(sc.next());
                System.out.println("Enter available seats for the Course");
                c.setSeatsavailable(sc.nextInt());
                System.out.println("Enter total cost for the course");
                c.setPrice(sc.nextDouble());

                if (courseDao.insert(c)) {
                    System.out.println("Value Inserted!");
                } else {
                    System.out.println("Cannot Insert the value.");
                }

                break;

            case 2:
                
                
                break;

            case 3:
                Course[] courses1 = courseDao.getAll();
                
                for (int i = 0; i <= courses1.length; i++) {
                    Course course = courses1[i];
                    if (course != null) {
                        System.out.println("Choose  the course to delete:");
                        System.out.println("Course ID" + course.getId());
                        System.out.println("Course Type" + course.getType());
                        
                    }
                    else{
                        System.out.println("No data found");
                        
                    }
                    
                    if(courseDao.delete(sc.nextInt())){
                        System.out.println("Course Deleted.");
                    }
                    else{
                        System.out.println("No course ID selected");
                    }
                }

                
                
                
                break;
            case 4:
                System.out.println("Details of available courses:");
                Course[] courseList = courseDao.getAll();
               
                for (int i = 0; i < courseList.length; i++) {
                    Course course = courseList[i];
                    if (course!= null) {
                        System.out.println("shjdfb");
                        System.out.println("Course ID" + course.getId());
                        System.out.println("Course Type" + course.getType());
                        System.out.println("Course Description" + course.getDescription());
                        System.out.println("Seats Available" + course.getSeatsavailable());
                        System.out.println("Cost of the Course" + course.getPrice());
                    }
                }

                break;
            case 5:
                System.out.print("Enter id to be searched: ");
                int id=sc.nextInt();
                Course course= courseDao.getById(id);
                Course courses=course;
                if(courses!=null){
                System.out.println("Course id: "+ courses.getId());
                System.out.println("course Type: "+courses.getType());
                System.out.println("Course Description "+courses.getDescription());
                System.out.println("Seats Available "+courses.getSeatsavailable());
                System.out.println("Total cost of the courses "+courses.getPrice());
                
                }
                break;
                
            case 6:
                System.out.println("Do you want to exit?[Y/N]");
                if(sc.next().equalsIgnoreCase("y")){
                    System.exit(0);
                }
                break;
        }

    }

}
}