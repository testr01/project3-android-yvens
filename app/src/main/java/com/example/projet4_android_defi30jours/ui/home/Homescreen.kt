package com.example.projet4_android_defi30jours.ui.home

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.projet4_android_defi30jours.data.sampleDays

@Composable
fun HomeScreen() {
    LazyColumn(
        modifier = Modifier.fillMaxSize()
    ) {
        items(sampleDays) { day ->
            ChallengeCard(day = day, onToggleComplete = { isCompleted ->
                day.isCompleted = isCompleted
            })
        }
    }
}
