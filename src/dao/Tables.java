/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.Connection;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Harindu
 */
public class Tables {
    
    public static void main(String[] args) {
        
    
    Connection con=null;
    Statement st = null;
    
    try{
        con = ConnectionProvider.getCon();
        st = con.createStatement();
        //st.executeUpdate("create table appuser(appuser_pk int AUTO_INCREMENT primary key,userRole varchar(50),name varchar(200),email varchar(200),password varchar(50),userName varchar(50),status varchar(50))");
        //st.executeUpdate("insert into appuser(userRole,name,email,password,userName,status) values('SuperAdmin2','Super Admin 2','superadmin2@testgmail.com','admin','Super Admin','true')");
        //st.executeUpdate("create table teams(team_pk int AUTO_INCREMENT primary key,teameName varchar(50),teamOwner varchar(80),teamCode varchar(20))");
        //st.executeUpdate("create table schedule(match_pk int AUTO_INCREMENT primary key,teams varchar(50),date varchar(80),venue varchar(20))");
        //st.executeUpdate("create table result(result_pk int AUTO_INCREMENT primary key,teams varchar(80),score varchar(20),result varchar(200))");
        //st.executeUpdate("create table point(point_pk int AUTO_INCREMENT primary key,position varchar(80),team varchar(20),lost varchar(20),won varchar(20),nrr varchar(20),point varchar(10))");
        st.executeUpdate("create table members(team_pk int AUTO_INCREMENT primary key,team varchar(80),member1 varchar(20),member2 varchar(20),member3 varchar(20),member4 varchar(20),member5 varchar(20),member6 varchar(20))");
        
        JOptionPane.showMessageDialog(null, "Table created successfully");
    }
    catch(Exception e){
        JOptionPane.showMessageDialog(null, e);
    }
    finally{
        try{
            con.close();
            st.close();
        }
        catch(Exception e){}
    }
    }
}
