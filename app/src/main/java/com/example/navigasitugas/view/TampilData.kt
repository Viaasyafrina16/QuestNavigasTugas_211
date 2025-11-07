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
import androidx.compose.ui.text.font.FontWeight

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
                        text = "List Daftar Peserta",
                        color = Color.White,
                        fontSize = 35.sp
                    )
                },
                colors = TopAppBarDefaults.topAppBarColors(containerColor = Color(0xFF9575CD))
            )
        }
    ) { isiRuang ->
        Column(
            modifier = Modifier
                .padding(isiRuang)
                .fillMaxSize()
                .background(Color(0xFFEDE7F6)),
            horizontalAlignment = Alignment.CenterHorizontally,

        ) {
            Spacer(modifier = Modifier.height(20.dp))

            items.forEach { item ->
                ElevatedCard(
                    modifier = Modifier
                        .padding(vertical = 8.dp)
                        .fillMaxWidth(0.9f),
                    elevation = CardDefaults.cardElevation(8.dp),
                    colors = CardDefaults.cardColors(containerColor = Color.White)
                ) {
                    Column(
                        modifier = Modifier.padding(16.dp)
                    ) {
                        Text(
                            text = item.first,
                            fontSize = 14.sp,
                            color = Color.Black
                        )
                        Text(
                            text = item.second,
                            fontSize = 20.sp,
                            color = Color.Black,
                            fontWeight = FontWeight.Bold
                        )
                    }
                }
            }

            Spacer(modifier = Modifier.height(25.dp))


            Button(
                onClick = onBackBtnClick,
                modifier = Modifier
                    .fillMaxWidth(0.7f)
                    .height(50.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0xFF7E57C2)
                )
            ) {
                Text("Beranda", color = Color.White, fontSize = 16.sp)
            }

            Spacer(modifier = Modifier.height(10.dp))


            Button(
                onClick = onFormulirClick,
                modifier = Modifier
                    .fillMaxWidth(0.7f)
                    .height(50.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0xFFB39DDB)
                )
            ) {
                Text("Formulir Pendaftaran", color = Color.White, fontSize = 16.sp)
            }
        }
    }
}


