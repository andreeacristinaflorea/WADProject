/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

public class Course {
    private int id;
    private String courseName;
    private String faculty;
    private String proffessor;
    private int schedule;
    private String building;
    private String room;
    private int start;
    private int end;

    public void setStart(int start) {
        this.start = start;
    }

    public void setEnd(int end) {
        this.end = end;
    }

    public int getStart() {
        return start;
    }

    public int getEnd() {
        return end;
    }

    public Course(int id, String courseName, String faculty, String proffessor, int schedule, String building, String room) {
        this.id = id;
        this.courseName = courseName;
        this.faculty = faculty;
        this.proffessor = proffessor;
        this.schedule = schedule;
        this.building = building;
        this.room = room;
    }
    
   public Course(int id, String courseName, String faculty, String proffessor, String building, String room) {
        this.id = id;
        this.courseName = courseName;
        this.faculty = faculty;
        this.proffessor = proffessor;
        this.schedule = schedule;
        this.building = building;
        this.room = room;
        this.start=start;
        this.end=end;
    }
   
   public Course(String courseName, String proffessor, String building, String room,int start,int end) {
        this.courseName = courseName;
        this.faculty = faculty;
        this.proffessor = proffessor;
        this.schedule = schedule;
        this.building = building;
        this.room = room;
        this.start=start;
        this.end=end;
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

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getProffessor() {
        return proffessor;
    }

    public void setProffessor(String proffessor) {
        this.proffessor = proffessor;
    }

    public int getSchedule() {
        return schedule;
    }

    public void setSchedule(int schedule) {
        this.schedule = schedule;
    }

    public String getBuilding() {
        return building;
    }

    public void setBuilding(String building) {
        this.building = building;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }
    
   
    @Override
    public String toString(){
        return this.courseName+","+this.proffessor+","+this.building+","+this.room+","+this.start+","+this.end;
    }
    
}


