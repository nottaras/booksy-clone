package com.zadziarnouski.booksyclone.user

import org.springframework.graphql.data.method.annotation.Argument
import org.springframework.graphql.data.method.annotation.QueryMapping
import org.springframework.stereotype.Controller

@Controller
class UserController(private val userService: UserService) {

    @QueryMapping
    fun userById(@Argument id: Long): User? {
        return userService.findById(id)
    }
}