package com.jaennova.retrofit_examples.menu

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.jaennova.retrofit_examples.navigation.AppScreens
import com.jaennova.retrofit_examples.R
import com.jaennova.retrofit_examples.ui.theme.*


@Composable
fun CardMenuItem(item: MenuItem, navController: NavController) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(12.dp)
            .background(color = menuBackgroundItem)
            .clickable { navController.navigate(item.route) },
        shape = RoundedCornerShape(16.dp)
    ) {
        Row(
            modifier = Modifier.padding(8.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                painter = painterResource(id = item.icon),
                contentDescription = null,
                modifier = Modifier
                    .size(80.dp)
                    .padding(12.dp),
                tint = Color.White,
            )
            Column(
                modifier = Modifier
                    .weight(1f)
                    .padding(start = 8.dp)
            ) {
                Text(
                    text = item.appName,
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold,
                    color = menuText
                )
                Text(
                    text = item.description,
                    fontSize = 12.sp,
                    fontStyle = FontStyle.Italic,
                    color = menuTextDescription
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun CardMenuItemPreview() {
    CardMenuItem(
        listApps[0],
        rememberNavController()
    )
}