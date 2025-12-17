package com.example.demo.entity;

importjava.sql.Date;
@Entity
public class StudentEntity{
   private String name;
   private Integer id;  
   private String email;
   private String password;
//    private Date createAt;
  //ID
   public String getId(){
    return id;
   }
   public void setId(Integer id){
    this.id=id;
   }
   //Name
   public String getName(){
    return name;
   }
   public void setName(String name){
    this.name=name;
   }
 
   //Email
   public String getEmail(){
    return email;
   }
   public void setEmail(String email){
    this.email=email;
   }
   //Password
   public String getPassword(){
    return password;
   }
   public void setPassword(String password){
    this.password=password;
   }
    
//Parameter constructor
public StudentEntity(Integer id,String name,String email,String Password){
    this.id=id;
    this.name=name;
    this.email=email;
    this.password=password;
}
//Default Constructor
public StudentEntity(){
    
}
}