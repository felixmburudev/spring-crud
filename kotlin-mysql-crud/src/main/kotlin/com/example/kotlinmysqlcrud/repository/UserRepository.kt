package com.example.kotlinmysqlcrud.repository

import com.example.kotlinmysqlcrud.entity.User
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface UserRepository : JpaRepository<User, Long>