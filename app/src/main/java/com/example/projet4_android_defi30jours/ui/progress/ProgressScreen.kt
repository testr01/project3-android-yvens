package com.example.projet4_android_defi30jours.ui.progress

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.LinearProgressIndicator
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.projet4_android_defi30jours.data.sampleDays

@Composable
fun ProgressScreen() {
    val completedDays = sampleDays.count { it.isCompleted }
    val progress = completedDays / sampleDays.size.toFloat()

    Column(
        modifier = Modifier.fillMaxSize().padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Progression : $completedDays/${sampleDays.size}", fontSize = 18.sp, color =Color(0xFFFFFFFF))
        LinearProgressIndicator(progress = progress, modifier = Modifier.fillMaxWidth().padding(16.dp))

        LazyColumn {
            items(sampleDays.filter { it.isCompleted }) { day ->
                CompletedChallengeCard(day = day)
            }
        }
    }
}
