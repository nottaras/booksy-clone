package com.zadziarnouski.booksyclone

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
open class BooksyCloneApplication

fun main(args: Array<String>) {
	runApplication<BooksyCloneApplication>(*args)
}
