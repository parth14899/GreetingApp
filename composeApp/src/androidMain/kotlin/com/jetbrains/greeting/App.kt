package com.jetbrains.greeting

import androidx.compose.foundation.layout.Column

import androidx.compose.foundation.layout.padding

import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp

import org.jetbrains.compose.ui.tooling.preview.Preview



@Composable
@Preview
fun App() {
    MaterialTheme {
        Column(Modifier.padding(12.dp), horizontalAlignment = Alignment.CenterHorizontally) {
            Greeting().greet().forEach { courseCode ->
                Text(
                    text = courseCode,  // Display each course code
                    fontWeight = FontWeight.Bold,  // Set text to bold
                    modifier = Modifier
                        .graphicsLayer { var blurRadius = 1f }  // Apply 1dp blur
                )

            }

                }
            }
        }