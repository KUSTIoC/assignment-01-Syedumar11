/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myprogram;

import java.sql.Time;
import java.util.Date;

/**
 *
 * @author NooOOooRRii
 */
public class Paper {
    private String paper_tilte;
    private int papers_id;
    private String course_code;
    private String course_incharge;
    private String samester_name;
    private String program_name;
    private Date date;
    private Time time;
    
    private String exam_type;
    private String invigilator_name;
    private String paper_location;
    private final int number_of_student;
     
    private final boolean isPaperCollected= false;
    
    public Paper(int paper_id,String course_code,int number_of_students){
    this.course_code =course_code;
    this.papers_id = paper_id;
    this.number_of_student = number_of_students;
    }

    public String getPaper_tilte() {
        return paper_tilte;
    }

    public void setPaper_tilte(String paper_tilte) {
        this.paper_tilte = paper_tilte;
    }

    public int getPapers_id() {
        return papers_id;
    }

    public void setPapers_id(int papers_id) {
        this.papers_id = papers_id;
    }

    public String getCourse_code() {
        return course_code;
    }

    public void setCourse_code(String course_code) {
        this.course_code = course_code;
    }

    public String getCourse_incharge() {
        return course_incharge;
    }

    public void setCourse_incharge(String course_incharge) {
        this.course_incharge = course_incharge;
    }

    public String getSamester_name() {
        return samester_name;
    }

    public void setSamester_name(String samester_name) {
        this.samester_name = samester_name;
    }

    public String getProgram_name() {
        return program_name;
    }

    @Override
    public String toString() {
        return "Paper{" + "paper_tilte=" + paper_tilte + ", papers_id=" + papers_id + ", course_code=" + course_code + ", course_incharge=" + course_incharge + ", samester_name=" + samester_name + ", program_name=" + program_name + ", date=" + date + ", time=" + time + ", exam_type=" + exam_type + ", invigilator_name=" + invigilator_name + ", paper_location=" + paper_location + ", number_of_student=" + number_of_student + ", isPaperCollected=" + isPaperCollected + '}';
    }

    public void setProgram_name(String program_name) {
        this.program_name = program_name;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public String getExam_type() {
        return exam_type;
    }

    public void setExam_type(String exam_type) {
        this.exam_type = exam_type;
    }

    public String getInvigilator_name() {
        return invigilator_name;
    }

    public void setInvigilator_name(String invigilator_name) {
        this.invigilator_name = invigilator_name;
    }

    public String getPaper_location() {
        return paper_location;
    }

    public void setPaper_location(String paper_location) {
        this.paper_location = paper_location;
    }
    
    
}
