package com.example.userscache;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor


public class Users {
    private Integer Id;
    private String  u_name;
    private String u_dept;
    private String date;
    public Users(String u_dept){
        this.u_dept=u_dept;
    }

    @Override
    public String toString(){
        return "Department "+u_dept;
    }
}
