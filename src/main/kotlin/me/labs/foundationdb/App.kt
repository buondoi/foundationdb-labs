package me.labs.foundationdb

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class App

fun main(args: Array<String>) {
    SpringApplication(App::class.java).run(*args)
}
