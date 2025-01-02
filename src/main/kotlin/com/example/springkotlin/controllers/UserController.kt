package com.example.springkotlin.controllers

import com.example.springkotlin.Models.User
import com.example.springkotlin.Repository.UserRepository
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class UserController(private val userRepository: UserRepository) {

    @GetMapping("/users")
    fun getUsers() = userRepository.findAll()

    @GetMapping("/users/{id}")
    fun getUser(@PathVariable id: Long) = userRepository.findById(id)

    @PostMapping("/users")
    fun createUser(@RequestBody user: User ) =userRepository.save(user)

}