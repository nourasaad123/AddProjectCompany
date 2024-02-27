package com.example.addprojectcompany

import android.widget.Toast
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview(showBackground = true)
@Composable
fun AddProjectScreen() {
    val notification = rememberSaveable {
        mutableStateOf("")
    }
    if (notification.value.isNotEmpty()) {
        Toast.makeText(LocalContext.current, notification.value, Toast.LENGTH_LONG).show()
        notification.value = ""
    }

    var projectName by rememberSaveable {
        mutableStateOf("")
    }
    var shortDescription by rememberSaveable {
        mutableStateOf("")
    }

    Column(
        modifier = Modifier
            .verticalScroll(rememberScrollState())
            .padding(30.dp)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 40.dp, start = 8.dp, end = 8.dp, bottom = 8.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(text = "Cancel", modifier = Modifier.clickable {
                notification.value = "Cancelled"
            })
            Text(
                text = "Save",
                modifier = Modifier.clickable { notification.value = "Profile updated" })
        }
        ProfileImage("Add Logo")
        Spacer(modifier = Modifier.height(10.dp))
        TextFieldForProject(
            value = projectName,
            onValueChanged = { projectName = it },
            label = "project name"
        )
        Spacer(modifier = Modifier.height(16.dp))
        TextFieldForProject(
            value = shortDescription,
            onValueChanged = { shortDescription = it },
            label = "short description"
        )


        Spacer(modifier = Modifier.height(6.dp))
    }
}
