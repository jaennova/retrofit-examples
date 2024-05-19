package com.jaennova.retrofit_examples.menu
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MenuScreen(menuItems: List<MenuItem>, navController: NavController) {
    Surface {
        Column {
            TopAppBar(title = { Text("Menu") })
            LazyColumn {
                items(menuItems) { menuItem ->
                    CardMenuItem(menuItem, navController)
                    Spacer(modifier = Modifier.height(8.dp))
                }
            }
        }
    }
}
