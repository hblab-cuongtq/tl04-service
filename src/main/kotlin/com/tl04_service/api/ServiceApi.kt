package com.tl04_service.api

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/service-b/service")
class ServiceApi {
    @GetMapping
    fun connect(): ResponseEntity<String> = ResponseEntity.ok().body("connected service successfully")
}
