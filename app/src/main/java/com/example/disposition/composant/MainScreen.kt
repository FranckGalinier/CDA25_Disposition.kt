package com.example.disposition.composant

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun MainScreen(
    modifier: Modifier = Modifier
){
     Column(
         modifier = modifier.verticalScroll(rememberScrollState())
     ) {
         Spacer(modifier.height(16.dp))
         Text("En attente ...")
         Spacer(modifier.height(16.dp))

     }
}