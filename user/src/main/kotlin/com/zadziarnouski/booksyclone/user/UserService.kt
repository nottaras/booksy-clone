package com.zadziarnouski.booksyclone.user

import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Service

@Service
class UserService(private val userRepository: UserRepository) {
    fun findById(id: Long?): User? = userRepository.findByIdOrNull(id)
}