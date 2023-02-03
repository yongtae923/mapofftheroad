package com.roadoffthemap.roadoffthemap.repository

import org.springframework.stereotype.Repository

@Repository
class WordRepository {
    // 현재 요구사항에 근거하면 수정할 필요 없기 때문에 읽기전용으로 생성
    var wordRep = listOf("key","http","one","two","github","kotlin")
    fun findWord(word: String):Int{
        return wordRep.indexOf(word)
    }
}