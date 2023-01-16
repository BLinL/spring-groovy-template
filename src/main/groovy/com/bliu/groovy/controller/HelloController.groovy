package com.bliu.groovy.controller

import groovy.json.JsonOutput
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RequestMapping("/api/hello")
@RestController
class HelloController {

    @GetMapping("/world")
    String hello() {
        JsonOutput.toJson(['code': 200, data: 'hello groovy'])
    }
}
