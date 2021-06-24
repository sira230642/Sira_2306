package com.example.Sira_2306.studen;

public class Student {
    private long id;
    private String studentnumber;
    private String name;
    private String lastname;
    private String dateofbirth;

    public Student(long id, String studentnumber, String name, String lastname, String dateofbirth) {
        this.id = id;
        this.studentnumber = studentnumber;
        this.name = name;
        this.lastname = lastname;
        this.dateofbirth = dateofbirth;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getStudentnumber() {
        return studentnumber;
    }

    public void setStudentnumber(String studentnumber) {
        this.studentnumber = studentnumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getDateofbirth() {
        return dateofbirth;
    }

    public void setDateofbirth(String dateofbirth) {
        this.dateofbirth = dateofbirth;
    }

}
