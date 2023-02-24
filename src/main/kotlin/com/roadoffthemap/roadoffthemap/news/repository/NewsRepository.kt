package com.roadoffthemap.roadoffthemap.news.repository

import com.roadoffthemap.roadoffthemap.news.domain.News
import org.springframework.data.jpa.repository.JpaRepository
import java.util.*

interface NewsRepository : JpaRepository<News, UUID>
