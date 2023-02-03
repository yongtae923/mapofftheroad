package com.roadoffthemap.roadoffthemap.service

import com.roadoffthemap.roadoffthemap.model.Word
import com.roadoffthemap.roadoffthemap.repository.WordRepository
import org.springframework.stereotype.Service

@Service
class SearchService(
    private val wordRepository: WordRepository
) {
    fun search_word(word: String):List<Word>{
        return wordRepository.findByName(word)
    }
}