/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myprogram;

/**
 *
 * @author NooOOooRRii
 */
public class Course {
   private String course_name;
   private String course_code;
   private String  program_name;
   private String course_is_offered;

    public Course(String course_name, String course_code) {
        this.course_name = course_name;
        this.course_code = course_code;
    }

    public String getCourse_name() {
        return course_name;
    }

    public String getCourse_code() {
        return course_code;
    }

    public void setCourse_code(String course_code) {
        this.course_code = course_code;
    }

    @Override
    public String toString() {
        return "Course{" + "course_name=" + course_name + ", course_code=" + course_code + ", program_name=" + program_name + ", course_is_offered=" + course_is_offered + '}';
    }
   
}
