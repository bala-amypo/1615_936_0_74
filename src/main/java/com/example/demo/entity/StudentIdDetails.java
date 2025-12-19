package com.example.demo.entity;

import java.util.Date;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.OneToOne;
import jakarta.persistence.JoinC;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.Getter;
import lombok.Data;
@Entity
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor


public class StudentIdDetails{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
   private Integer id;
   private String idcardnumber;
   private String student_id;
  @OneToOne
  private StudentIdDetails
  }