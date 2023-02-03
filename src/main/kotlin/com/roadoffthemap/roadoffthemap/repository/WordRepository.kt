package com.roadoffthemap.roadoffthemap.repository

import com.roadoffthemap.roadoffthemap.model.Word
import org.springframework.data.jpa.repository.JpaRepository

interface WordRepository: JpaRepository<Word, Long> {
    fun findByName(name:String):List<Word>
}