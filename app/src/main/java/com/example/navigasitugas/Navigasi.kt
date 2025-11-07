package com.example.navigasitugas

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.navigasitugas.view.Beranda
import com.example.navigasitugas.view.FormDataDiri
import com.example.navigasitugas.view.TampilData

enum class Navigasi{
    Beranda,
    Formulir,
    Detail
}

@Composable
fun DataApp(
    navController: NavHostController = rememberNavController(),

  modifier:  Modifier

) {

    var nama by remember { mutableStateOf("") }
    var jk by remember { mutableStateOf("") }
    var status by remember { mutableStateOf("") }
    var alamat by remember { mutableStateOf("") }

    Scaffold { isiRuang ->
        NavHost(
            navController = navController,
            startDestination = Navigasi.Beranda.name,

            modifier = Modifier.padding(isiRuang)
        ) {
            composable(route = Navigasi.Beranda.name) {
                Beranda(
                    OnSubmitBtnClick = {
                        navController.navigate(Navigasi.Formulir.name)
                    }
                )
            }
            composable(route = Navigasi.Formulir.name) {
                FormDataDiri(
                    onSubmit = { n, j, s, a ->
                        nama = n
                        jk = j
                        status = s
                        alamat = a
                        navController.navigate(Navigasi.Detail.name)
                    }
                )
            }
            composable(Navigasi.Detail.name) {
                TampilData(
                    nama = nama,
                    jk = jk,
                    status = status,
                    alamat = alamat,
                    onBackBtnClick = {
                        navController.navigate(Navigasi.Beranda.name) {
                            popUpTo(Navigasi.Beranda.name) { inclusive = true }
                        }
                    },
                    onFormulirClick = {
                        navController.navigate(Navigasi.Formulir.name)
                    }
                )
            }
        }
    }
}






