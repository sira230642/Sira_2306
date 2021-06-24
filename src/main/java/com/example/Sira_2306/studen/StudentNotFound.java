package com.example.Sira_2306.studen;

public class StudentNotFound extends RuntimeException{
    public StudentNotFound(){

    }
    public StudentNotFound(long id){
        super("Could not find Todo " + id);
    }
}
