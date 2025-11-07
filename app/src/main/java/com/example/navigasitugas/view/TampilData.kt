@file:OptIn(ExperimentalMaterial3Api::class)

package com.example.navigasitugas.view
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun TampilData(
    nama: String,
    jk: String,
    status: String,
    alamat: String,
    onBackBtnClick: () -> Unit,
    onFormulirClick: () -> Unit
) {
    val items = listOf(
        Pair("NAMA LENGKAP", nama),
        Pair("JENIS KELAMIN", jk),
        Pair("STATUS PERKAWINAN", status),
        Pair("ALAMAT", alamat)
    )
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(
                        text = "Data Tersimpan",
                        color = Color.White
                    )
                },
                colors = TopAppBarDefaults.
                topAppBarColors(containerColor = Color(0xFF9575CD))
            )
        }
    ) { isiRuang ->
}

