package com.roadoffthemap.roadoffthemap.news.presentation

import com.roadoffthemap.roadoffthemap.news.domain.News
import com.roadoffthemap.roadoffthemap.news.application.NewsService
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import java.util.*

@RestController
@RequestMapping("/api/news")
class NewsController(private val newsService: NewsService) {
    @GetMapping
    fun getAllNews(): List<News> = newsService.getAllNews()

    @GetMapping("/{id}")
    fun getNewsById(@PathVariable id: UUID): ResponseEntity<News?> {
        val news = newsService.getNewsById(id)
        return if (news != null) {
            ResponseEntity.ok(news)
        } else {
            ResponseEntity.notFound().build()
        }
    }

    @PostMapping
    fun createNews(@RequestBody news: News): News = newsService.createNews(news)


    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    fun deleteNewsById(@PathVariable id: UUID) = newsService.deleteNewsById(id)
}
