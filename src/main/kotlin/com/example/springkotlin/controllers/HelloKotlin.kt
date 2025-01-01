package com.example.springkotlin.controllers

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloKotlin {

    @GetMapping("/hello")
    fun hello(): String {
        return "Hello, Kotlin!"
    }
}