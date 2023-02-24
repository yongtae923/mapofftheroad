package com.roadoffthemap.roadoffthemap.Test.repository

import com.roadoffthemap.roadoffthemap.Test.model.Word
import org.springframework.data.jpa.repository.JpaRepository

interface WordRepository: JpaRepository<Word, Long> {
    fun findByName(name:String):List<Word>
}