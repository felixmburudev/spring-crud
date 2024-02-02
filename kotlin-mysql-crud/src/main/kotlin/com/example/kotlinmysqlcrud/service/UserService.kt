package com.example.kotlinmysqlcrud.service

import com.example.kotlinmysqlcrud.entity.User
import com.example.kotlinmysqlcrud.repository.UserRepository
import jakarta.annotation.PostConstruct
import org.springframework.stereotype.Service

@Service
class UserService(private val userRepository: UserRepository) {
    @PostConstruct
    fun init() {
        println("Connected to MySQL database")
    }

    fun getAllUsers(): List<User> {
        return userRepository.findAll()
    }

    fun addUser(userName: String): User {
        val user = User(username = userName.trim())
        return userRepository.save(user)
    }
}