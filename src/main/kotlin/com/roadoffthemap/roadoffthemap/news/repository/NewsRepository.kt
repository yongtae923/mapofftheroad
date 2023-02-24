package com.roadoffthemap.roadoffthemap.news.repository

import com.roadoffthemap.roadoffthemap.news.domain.News
import org.springframework.data.jpa.repository.JpaRepository

interface NewsRepository : JpaRepository<News, String>
