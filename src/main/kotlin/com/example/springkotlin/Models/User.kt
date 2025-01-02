package com.example.springkotlin.Models

import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.Table

@Entity
@Table(name = "tb_user")
data class User (@Id var id: Long, var name: String, var email: String)