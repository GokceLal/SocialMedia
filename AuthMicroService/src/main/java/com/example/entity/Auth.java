package com.example.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tbl_auth")
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Auth {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;
private String username;
private String password;
private String email;
private boolean isActive;
private Long createAt;

}
