package com.example.mycomunidad10_grupo1.data.repository

import com.example.mycomunidad10_grupo1.data.model.Post
import com.example.mycomunidad10_grupo1.data.remote.RetrofitInstance

// Este repositorio se encarga de acceder a los datos usando Retrofit
class PostRepository {

    // Función que obtiene los posts desde la API
    suspend fun getPosts(): List<Post> {
        return RetrofitInstance.api.getPosts()
    }
}