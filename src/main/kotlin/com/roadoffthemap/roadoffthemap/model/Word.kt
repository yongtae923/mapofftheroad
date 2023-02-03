package com.roadoffthemap.roadoffthemap.model

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.Id

@Entity
class Word {
    @Id
    @GeneratedValue(generator = "word_generate")
    var id: Long? = null

    var name: String? =null
}