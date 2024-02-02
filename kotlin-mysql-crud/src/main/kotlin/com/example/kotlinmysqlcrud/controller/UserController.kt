package com.example.kotlinmysqlcrud.controller

import com.example.kotlinmysqlcrud.entity.User
import com.example.kotlinmysqlcrud.service.UserService
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/")
class UserController(private val userService: UserService) {
    @GetMapping("/")
    fun getAllUsers(): List<User> = userService.getAllUsers()
    @PostMapping("/add")
    fun addUser(@RequestParam username: String): ResponseEntity<User>{
        val newUser = userService.addUser(username)
        println(newUser )
        return ResponseEntity(newUser, HttpStatus.CREATED)
    }
}