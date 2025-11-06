@file:OptIn(ExperimentalMaterial3Api::class)

package com.example.navigasitugas.view

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.navigasiku.R

@Composable
fun Beranda(
    onSubmitClick: () -> Unit
) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(
                        text = "Selamat Datang",
                        color = Color.White
                    )
                },
                colors = TopAppBarDefaults.
                topAppBarColors(
                    containerColor = Color(0xFF9575CD)    // ungu tua
                )
            )
        }
    ) { isiRuang ->

        Column(
            modifier = Modifier
                .padding(isiRuang)                 // Terapkan padding Scaffold
                .fillMaxSize()
                .background(Color(0xFFEDE7F6)),
    }

