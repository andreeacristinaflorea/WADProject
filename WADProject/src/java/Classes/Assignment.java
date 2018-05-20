/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

public class Assignment {
    String course;
    String title;
    String description;

    public Assignment(String course, String title, String description) {
        this.course = course;
        this.title = title;
        this.description = description;
    }

    public String getCourse() {
        return course;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return course + "," + title + "," + description ;
    }
    
    
}
