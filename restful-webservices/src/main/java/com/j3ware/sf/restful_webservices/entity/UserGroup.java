package com.j3ware.sf.restful_webservices.entity;


import jakarta.persistence.*;
import lombok.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name="user_group")
@Getter
@Setter
@Builder
public class UserGroup {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String groupName;
    private String description;
    @Column(name= "user_id",insertable=false, updatable=false)
    private Integer userId;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name= "user_id")
    private User user;



}
