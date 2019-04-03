package rmiPrac5.classes;

import java.io.Serializable;
import java.util.List;


public class StudentData implements Serializable {

    private static final long serialVersionUID = 1L;


    private int stdID;
    private String stdName;
    private List<StudentData> studentList;


    public StudentData(int id, String name) {
        this.stdID = id;
        this.stdName = name;
    }

    public  StudentData(List list) {
        this.studentList=list;
    }





    public List<StudentData> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<StudentData> studentList) {
        this.studentList = studentList;
    }

    public int getStdID() {
        return stdID;
    }

    public void setStdID(int stdID) {
        this.stdID = stdID;
    }

    public String getStdName() {
        return stdName;
    }

    public void setStdName(String stdName) {
        this.stdName = stdName;
    }
}