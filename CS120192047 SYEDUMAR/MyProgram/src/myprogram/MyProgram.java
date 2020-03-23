/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myprogram;
import java.util.Scanner;

/**
 *
 * @author NooOOooRRii
 */
public class MyProgram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Paper paper_1,paper_2,paper_3;
     
     Course course_1,course_2;
     
    
     
     paper_1 = new Paper(1,"cs213",100);
      paper_2 = new Paper(2,"cs214",80);
       paper_3 = new Paper(3,"cs215",70);
    
        course_1 = new Course("Opp",paper_1.getCourse_code());
        course_2 = new Course("JAVA",paper_2.getCourse_code());
       System.out.println(paper_1.toString());
       System.out.println(paper_2.toString());
       System.out.println(paper_3.toString());
        System.out.println(course_1.toString());
        System.out.println(course_2.toString());
    }
    
}
