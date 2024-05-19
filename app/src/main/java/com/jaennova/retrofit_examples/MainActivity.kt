package com.jaennova.retrofit_examples

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.jaennova.retrofit_examples.get.jsonplaceholder.DataApiScreen
import com.jaennova.retrofit_examples.menu.MenuScreen
import com.jaennova.retrofit_examples.menu.listApps
import com.jaennova.retrofit_examples.navigation.AppNavigation
import com.jaennova.retrofit_examples.ui.theme.RetrofitexamplesTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            RetrofitexamplesTheme {
                AppNavigation()
                /*  Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                      Greeting(
                          name = "Android",
                          modifier = Modifier.padding(innerPadding)
                      )
                  }*/
            }
        }
    }
}
