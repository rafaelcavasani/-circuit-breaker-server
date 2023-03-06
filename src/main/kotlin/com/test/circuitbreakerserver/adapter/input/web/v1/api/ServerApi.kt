package com.test.circuitbreakerserver.adapter.input.web.v1.api

import com.test.circuitbreakerserver.adapter.input.web.v1.api.response.ServerResponse
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping

@RequestMapping("/v1/server")
interface ServerApi {


    @GetMapping
    fun get(): ResponseEntity<List<ServerResponse>>

}