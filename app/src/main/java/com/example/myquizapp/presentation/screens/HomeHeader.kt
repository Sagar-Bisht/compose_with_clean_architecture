package com.example.myquizapp.presentation.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myquizapp.R

@Preview(showSystemUi = true)
@Composable
fun HomeHeader() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(150.dp)
            .background(
                color = colorResource(id = R.color.dark_slate_blue),
                shape = RoundedCornerShape(
                    bottomStart = 50.dp,
                    bottomEnd = 50.dp
                )
            )
    ) {
        Row(
            modifier = Modifier
                .fillMaxSize()
                .padding(20.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                painter = painterResource(id = R.drawable.ham_icon),
                contentDescription = "",
                modifier = Modifier
                    .weight(1f)
                    .size(40.dp),
                tint = colorResource(id = R.color.blue_grey)
            )
            Text(
                text = "Quiz App",
                color = colorResource(id = R.color.blue_grey),
                style = MaterialTheme.typography.titleMedium ,
                modifier = Modifier.weight(3.5f),
                textAlign = TextAlign.Center ,
                fontSize = 25.sp
            )
            Icon(
                painter = painterResource(id = R.drawable.person_icon),
                contentDescription = "",
                modifier = Modifier
                    .weight(1f)
                    .size(40.dp),
                tint = colorResource(id = R.color.blue_grey)
            )
        }
    }
}