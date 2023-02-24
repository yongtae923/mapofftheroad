package com.roadoffthemap.roadoffthemap.news.application

import com.roadoffthemap.roadoffthemap.news.domain.News
import com.roadoffthemap.roadoffthemap.news.repository.NewsRepository
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Service
import java.time.LocalDateTime
import java.util.*

@Service
class NewsService(private val newsRepository: NewsRepository) {
    fun getAllNews(): List<News> = newsRepository.findAll()

    fun getNewsById(id: UUID): News? = newsRepository.findByIdOrNull(id)

    fun createNews(news: News): News = newsRepository.save(news)

    fun deleteNewsById(id: UUID): News? {
        val news: News = newsRepository.findByIdOrNull(id) ?: return null
        news.deletedAt = LocalDateTime.now()
        newsRepository.save(news)
        return news
    }
}
