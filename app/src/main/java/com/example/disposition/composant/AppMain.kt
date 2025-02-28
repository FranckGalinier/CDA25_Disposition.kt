package com.example.disposition.composant

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.disposition.ui.theme.DispositionTheme

@Composable
fun AppMain(){
    DispositionTheme { Scaffold {
            innerPending ->MainScreen(Modifier.padding(innerPending))
    } }
}