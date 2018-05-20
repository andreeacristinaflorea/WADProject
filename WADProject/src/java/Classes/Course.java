/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

public class Course {
    private int id;
    private String courseName;
    private int faculty;
    private int proffessor;
    private int schedule;
    private int building;
    private int room;

    public Course(int id, String courseName, int faculty, int proffessor, int schedule, int building, int room) {
        this.id = id;
        this.courseName = courseName;
        this.faculty = faculty;
        this.proffessor = proffessor;
        this.schedule = schedule;
        this.building = building;
        this.room = room;
    }
   
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getFaculty() {
        return faculty;
    }

    public void setFaculty(int faculty) {
        this.faculty = faculty;
    }

    public int getProffessor() {
        return proffessor;
    }

    public void setProffessor(int proffessor) {
        this.proffessor = proffessor;
    }

    public int getSchedule() {
        return schedule;
    }

    public void setSchedule(int schedule) {
        this.schedule = schedule;
    }

    public int getBuilding() {
        return building;
    }

    public void setBuilding(int building) {
        this.building = building;
    }

    public int getRoom() {
        return room;
    }

    public void setRoom(int room) {
        this.room = room;
    }
    
    
}


