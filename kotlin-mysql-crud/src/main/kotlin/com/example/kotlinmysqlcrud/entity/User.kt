package com.example.kotlinmysqlcrud.entity

import jakarta.persistence.*

@Entity
@Table(name = "usertable")
class User(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long =0,
    val username: String

)