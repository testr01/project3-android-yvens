package com.example.projet4_android_defi30jours.ui.home

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.clickable
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Share
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.scale  
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.projet4_android_defi30jours.data.ChallengeDay
import kotlinx.coroutines.launch
import kotlin.random.Random

@Composable
fun ChallengeCard(day: ChallengeDay, onToggleComplete: (Boolean) -> Unit) {
    var isDescriptionVisible by remember { mutableStateOf(false) }
    var isCompleted by remember { mutableStateOf(day.isCompleted) }
    val configuration = LocalConfiguration.current
    val screenHeight = configuration.screenHeightDp.dp
    val imageHeight = (screenHeight * 5) / 8


    val motivationalMessages = listOf(
        "Bien joué", "Wow Super", "Quel Exploit", "Bravo, Continue",
        "Ne lâche surtout pas", "Bientôt terminé"
    )

    val scaffoldState = rememberScaffoldState()
    val coroutineScope = rememberCoroutineScope()



    Card(
        backgroundColor = MaterialTheme.colors.surface,
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)
            .clip(RoundedCornerShape(16.dp)),
        elevation = 4.dp
    ) {
        Column(modifier = Modifier.padding(16.dp)) {
            Row(
                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(text = "Jour ${day.number}", fontSize = 20.sp, color = MaterialTheme.colors.onBackground)
                Text(text = day.date, fontSize = 16.sp, color = MaterialTheme.colors.onBackground)
            }

            Spacer(modifier = Modifier.height(8.dp))

            Text(text = day.title, fontSize = 18.sp, color = MaterialTheme.colors.onBackground)

            Spacer(modifier = Modifier.height(8.dp))


            Image(
                painter = painterResource(id = day.imageRes),
                contentDescription = null,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(imageHeight)
                    .clip(RoundedCornerShape(8.dp))
                    .clickable { isDescriptionVisible = !isDescriptionVisible },
                contentScale = ContentScale.Crop
            )

            AnimatedVisibility(visible = isDescriptionVisible) {
                Text(text = day.description, modifier = Modifier.padding(8.dp), color = MaterialTheme.colors.onBackground)
            }

            Spacer(modifier = Modifier.height(8.dp))

            Row(
                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier.fillMaxWidth()
            ) {

                Checkbox(
                    checked = isCompleted,
                    onCheckedChange = {
                        isCompleted = it
                        onToggleComplete(it)


                        val randomMessage = motivationalMessages.random()
                        coroutineScope.launch {
                            scaffoldState.snackbarHostState.showSnackbar(randomMessage)
                        }
                    },
                    colors = CheckboxDefaults.colors(
                        checkedColor = MaterialTheme.colors.primary,
                        uncheckedColor = MaterialTheme.colors.onBackground
                    )
                )

                IconButton(onClick = {  }) {
                    Icon(Icons.Default.Share, contentDescription = "Partager", tint = MaterialTheme.colors.primary)
                }
            }
        }
    }
}
