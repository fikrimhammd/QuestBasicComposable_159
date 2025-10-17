package com.example.layout

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun TataletakBoxColumnRow(modifier: Modifier = Modifier) {
    val gambar = painterResource(id = R.drawable.tes)

    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        // Kolom pertama: hanya teks
        Column(
            modifier = Modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(text = "Komponen 1 Kolom 1", fontWeight = FontWeight.Bold)
            Text(text = "Komponen 2 Kolom 1")
            Text(text = "Komponen 3 Kolom 1")
        }

        Spacer(modifier = Modifier.height(12.dp))

        // Box dengan gambar dan teks overlay
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(250.dp)
                .background(Color.Cyan),
            contentAlignment = Alignment.Center
        ) {
            Image(
                painter = gambar,
                contentDescription = null,
                contentScale = ContentScale.Fit
            )
            Text(
                text = "My Music",
                fontSize = 36.sp,
                color = Color.Red,
                fontWeight = FontWeight.Bold,
                fontFamily = FontFamily.Cursive
            )
        }

        Spacer(modifier = Modifier.height(12.dp))

        // Row berisi teks horizontal
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            Text(text = "Komponen 1 Row")
            Text(text = "Komponen 2 Row")
            Text(text = "Komponen 3 Row")
        }
    }
}

// ------------------------------------------------------
// 2️⃣ Versi hanya Column (komponen vertikal)
// ------------------------------------------------------
@Composable
fun TataletakColumn(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxWidth()
            .padding(16.dp),
        verticalArrangement = Arrangement.SpaceEvenly
    ) {
        Text(text = "Column Item 1")
        Text(text = "Column Item 2")
        Text(text = "Column Item 3")
    }
}

// ------------------------------------------------------
// 3️⃣ Versi hanya Row (komponen horizontal)
// ------------------------------------------------------
@Composable
fun TataletakRow(modifier: Modifier = Modifier) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .padding(16.dp),
        horizontalArrangement = Arrangement.SpaceEvenly
    ) {
        Text(text = "Row Item 1")
        Text(text = "Row Item 2")
        Text(text = "Row Item 3")
    }
}

// ------------------------------------------------------
// 4️⃣ Gabungan Column + Row seperti yang kamu minta
// ------------------------------------------------------
@Composable
fun TataletakColumnRow(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxWidth()
            .padding(16.dp)
    ) {
        // Baris 1
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            Text(text = "Komponen 1 Baris 1")
            Text(text = "Komponen 2 Baris 1")
            Text(text = "Komponen 3 Baris 1")
        }

        Spacer(modifier = Modifier.height(10.dp))

        // Baris 2
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            Text(text = "Komponen 1 Baris 2")
            Text(text = "Komponen 2 Baris 2")
            Text(text = "Komponen 3 Baris 2")
        }
    }
}


@Composable
@androidx.compose.ui.tooling.preview.Preview(showBackground = true)
fun PreviewTataletakColumnRow() {
    TataletakColumnRow()
}

@Composable
@androidx.compose.ui.tooling.preview.Preview(showBackground = true)
fun PreviewTataletakBoxColumnRow() {
    TataletakBoxColumnRow()
}
