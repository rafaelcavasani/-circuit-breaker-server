package com.test.circuitbreakerserver.adapter.input.web.v1.controller

import com.test.circuitbreakerserver.adapter.input.web.v1.api.ServerApi
import com.test.circuitbreakerserver.adapter.input.web.v1.api.response.ServerResponse
import org.slf4j.LoggerFactory
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.RestController
import java.lang.RuntimeException

@RestController
class ServerController : ServerApi {

    companion object {
        private val logger = LoggerFactory.getLogger(this::class.java)
    }

    override fun get(): ResponseEntity<List<ServerResponse>> {
        logger.info("Executou o servidor.")
        val listResult = listOf<ServerResponse>(
            ServerResponse("server 1"),
            ServerResponse("server 2"),
            ServerResponse("server 3"),
            ServerResponse("server 4"),
            ServerResponse("server 5"),
            ServerResponse("server 6"),
        )
        return ResponseEntity.ok(listResult)
    }

}