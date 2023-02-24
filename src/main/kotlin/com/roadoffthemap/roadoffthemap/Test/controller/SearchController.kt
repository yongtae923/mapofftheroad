package com.roadoffthemap.roadoffthemap.Test.controller

import com.roadoffthemap.roadoffthemap.Test.model.Word
import com.roadoffthemap.roadoffthemap.Test.repository.WordRepository
import com.roadoffthemap.roadoffthemap.Test.service.SearchService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
class SearchController(
    @Autowired var searchService: SearchService,
){
    @GetMapping("search")
    fun search_word(@RequestParam word: String): List<Word>{
        return searchService.search_word(word)
    }

}

@RestController
class WordController(
    @Autowired var wordRepository: WordRepository
)
{
    @PostMapping("words")
    fun save_word(@RequestBody word: Word): Word {
        return wordRepository.save(word)
    }
}