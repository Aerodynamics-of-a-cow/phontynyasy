package com.lvishe.phontynyasy

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.servlet.ModelAndView





@RestController
class Controller {
    @GetMapping("/cringe")
    fun index(): ModelAndView {

        return ModelAndView("phontynyasy")
    }
}
