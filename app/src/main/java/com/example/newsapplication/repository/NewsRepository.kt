package com.example.newsapplication.repository

import com.example.newsapplication.api.RetrofitInstance
import com.example.newsapplication.db.ArticleDatabase
import com.example.newsapplication.models.Article


class NewsRepository(val db: ArticleDatabase) {
    suspend fun getHeadlines(countryCode: String, pageNumber: Int=1) =
        RetrofitInstance.api.getHeadlines(countryCode, pageNumber)

    suspend fun SearchNews(searchquery: String, pageNumber: Int) =
        RetrofitInstance.api.searchForNews(searchquery, pageNumber)

    suspend fun upsert(article: Article) = db.getArticleDao().upsert(article)
    fun getFavouriteNews() = db.getArticleDao().getAllArticles()
    suspend fun deleteArticle(article: Article) = db.getArticleDao().deleteArticle(article)


}