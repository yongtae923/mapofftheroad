package com.roadoffthemap.roadoffthemap.service

import com.roadoffthemap.roadoffthemap.repository.WordRepository
import org.springframework.stereotype.Service

@Service
class SearchService(
private val wordRepository: WordRepository
) {
    fun searchWord(word: String):String{
        val idx = wordRepository.findWord(word)
        return if(idx==-1){
            "Word is not in repo"
        } else {
            String.format("Word %s is in index of %d",word,idx)
        }
    }
}