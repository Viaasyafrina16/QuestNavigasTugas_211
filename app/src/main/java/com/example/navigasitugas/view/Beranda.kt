package com.example.navigasitugas.view

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.navigasitugas.R

@Composable
fun Beranda(
    OnSubmitBtnClick: () -> Unit
) {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFE0D6FF)),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Spacer(modifier = Modifier.height(70.dp))


        Text(
            text = "Selamat Datang",
            fontSize = 32.sp,
            fontWeight = FontWeight.Bold,
            color = Color(0xFF673AB7)
        )


        Spacer(modifier = Modifier.height(50.dp))


        Image(

            painter = painterResource(id = R.drawable.logo_pam),
            contentDescription = "Logo_pam",
            modifier = Modifier.size(200.dp)
        )


        Spacer(modifier = Modifier.height(80.dp))


        Text(
            text = "Syafrina Metavianida",
            fontSize = 20.sp,
            color = Color(0xFF311B92),
            textAlign = TextAlign.Center
        )


        Spacer(modifier = Modifier.height(8.dp))

        // Teks NIM
        Text(
            text = "20230140211",
            fontSize = 16.sp,
            color = Color(0xFF311B92)
        )


        Spacer(modifier = Modifier.weight(0.7f))


        Button(
            onClick = OnSubmitBtnClick,
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 40.dp)
                .padding(bottom = 200.dp),
            shape = RoundedCornerShape(16.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(0xFF673AB7)
            )
        ) {
            Text(
                text = "Submit",
                color = Color.White,
                fontSize = 16.sp,
                modifier = Modifier.padding(vertical = 5.dp)
            )
        }
    }
}
