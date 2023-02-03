package com.roadoffthemap.roadoffthemap.controller

import com.roadoffthemap.roadoffthemap.service.SearchService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@RestController
class SearchController(
    val searchService: SearchService
){
    @GetMapping("/search/{word}")
    fun searchWord(@PathVariable word: String): String{
        return searchService.searchWord(word)
    }
}