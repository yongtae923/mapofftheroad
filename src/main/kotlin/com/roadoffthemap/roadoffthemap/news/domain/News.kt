package com.roadoffthemap.roadoffthemap.news.domain

import com.roadoffthemap.roadoffthemap.Util.BaseEntity
import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.Table
import java.util.*

@Entity
@Table(name = "`news`")
class News: BaseEntity() {
    @Column(nullable = false)
    lateinit var title: String

    @Column
    var description: String? = null

    @Column
    var press: String? = null

    @Column
    var author: String? = null

    @Column
    var published_at: Date? = null

    @Column
    var thumbnail: String? = null

    @Column
    var keywords: List<String> = emptyList<String>()
}