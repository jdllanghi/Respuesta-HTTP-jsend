package com.example.demo1.contoller

import com.example.demo1.response.ErrorResponse
import com.example.demo11.model.Model
import com.example.demo11.response.SuccessResponse
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/home")
class HomeController {


    @GetMapping()
    fun home(@RequestBody model: Model): SuccessResponse {
        return SuccessResponse().apply {
            status = "success"
            data = model
        }
    }

    @GetMapping("/failed")
    fun getModel(@RequestBody model: Model): SuccessResponse {
        return SuccessResponse().apply {
            status = "failed"
            data = "El campo nombre esta vacio"
        }

    }

    @GetMapping("/error")
    fun getError(): ErrorResponse {
        return ErrorResponse("Ha ocurrido un error inesperado", code = 500)
    }
}

