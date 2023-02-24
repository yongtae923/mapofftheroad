package com.roadoffthemap.roadoffthemap.Test.service

import com.roadoffthemap.roadoffthemap.Test.model.Word
import com.roadoffthemap.roadoffthemap.Test.repository.WordRepository
import org.springframework.stereotype.Service

@Service
class SearchService(
    private val wordRepository: WordRepository
) {
    fun search_word(word: String):List<Word>{
        return wordRepository.findByName(word)
    }
}