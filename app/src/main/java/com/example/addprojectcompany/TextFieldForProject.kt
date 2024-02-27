package com.example.addprojectcompany

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TextFieldForProject(
    value: String,
    onValueChanged: (String) -> Unit,
    label: String,
) {
    Row(horizontalArrangement = Arrangement.Center) {
        OutlinedTextField(
            value = value,
            onValueChange = {
                onValueChanged(it)
            },
            label = {
                Text(text = label)

            },
            shape = RoundedCornerShape(26.dp),
            modifier = Modifier
                .padding(top = 6.dp, start = 30.dp, end = 30.dp),

            colors = TextFieldDefaults.outlinedTextFieldColors(
                focusedBorderColor = Color(0xFF8A97B7),
                unfocusedBorderColor = Color(0xFF8A97B7),
                focusedLabelColor = Color(0xFF8A97B7)
            ),
            singleLine = true,

            )

    }
}




