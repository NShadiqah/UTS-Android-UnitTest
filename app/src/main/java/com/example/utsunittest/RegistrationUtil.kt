package com.example.utsunittest

class RegistrationUtil {
    fun validateUsername(username: String): Boolean {
        return username.isNotEmpty() && username.length >= 3
    }

    fun validatePassword(password: String): Boolean {
        return password.length >= 6 && password.any { it.isDigit() }
    }
}