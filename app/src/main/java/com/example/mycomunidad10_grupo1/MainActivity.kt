package com.example.mycomunidad10_grupo1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.core.view.WindowCompat // Necesario para edge-to-edge
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.mycomunidad10_grupo1.ui.screens.PostScreen
import com.example.mycomunidad10_grupo1.viewmodel.PostViewModel

//import com.example.apirest.ui.theme.ApiRestTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Permite que la app dibuje contenido debajo de las barras del sistema
        WindowCompat.setDecorFitsSystemWindows(window, false)

        // Aquí inicia Jetpack Compose
        setContent {

            // Aplicamos el tema Material 3
            //  ApiRestTheme {

            // Inyectamos el ViewModel
            val postViewModel: PostViewModel = viewModel()

            // Llamamos a la pantalla principal y pasamos el ViewModel
            PostScreen(viewModel = postViewModel)
            //   }
        }
    }
}