package com.protonema.restapi.entity;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "tb_student")
public class Student {


    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long studentId;

    @Column(name ="fullname")
    private String fullname;

    private Integer age;
    
    private String addres;
    
}
