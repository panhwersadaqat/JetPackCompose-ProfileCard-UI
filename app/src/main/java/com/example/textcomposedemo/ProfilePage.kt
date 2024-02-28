package com.example.textcomposedemo

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun ProfilePage() {
    Card(modifier = Modifier
        .fillMaxSize()
        .padding(
            top = 100.dp, bottom = 100.dp, start = 16.dp, end = 16.dp
        )
    ) {
        Column(
            modifier = Modifier
                .fillMaxHeight()
                .verticalScroll(rememberScrollState()),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(id = R.drawable.image),
                contentDescription = "Developer",
                modifier = Modifier
                    .size(150.dp)
                    .clip(CircleShape)
            )
            Text(text = "Sadaqat Ali",
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(top = 16.dp))
            Text(text = "Panhwer")

            Row(
                horizontalArrangement = Arrangement.SpaceEvenly,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp)
            ) {
                profileStatus(count = "150", text = "Followers")
                profileStatus(count = "100", text = "Following")
                profileStatus("30", "Posts")
            }

            Row(
                horizontalArrangement = Arrangement.SpaceEvenly,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp)
            ) {
                Button(onClick = { /*TODO*/ }) {
                    Text(text = "Follow")
                }
                Button(onClick = { /*TODO*/ }) {
                    Text(text = "Message")
                }
            }
        }
    }
}

@Composable
fun profileStatus(count: String, text: String) {
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        Text(text = count, fontWeight = FontWeight.Bold)
        Text(text = text)
    }
}

@Preview(showSystemUi = true,
    showBackground = true)
@Composable
fun ProfilePagePreview() {
    ProfilePage()
}