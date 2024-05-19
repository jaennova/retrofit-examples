package com.jaennova.retrofit_examples.get.jsonplaceholder.ui

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.jaennova.retrofit_examples.get.jsonplaceholder.network.Post

@Composable
fun PostItem(post: Post) {
    Card(
        modifier = Modifier
            .padding(16.dp)
            .clickable { }
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
        ) {
            Text(text = post.title, style = MaterialTheme.typography.bodyLarge)
            Text(text = post.body, style = MaterialTheme.typography.bodySmall)
        }
    }
}