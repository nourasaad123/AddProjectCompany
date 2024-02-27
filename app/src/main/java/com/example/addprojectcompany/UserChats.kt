package com.example.addprojectcompany

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview(showBackground = true)
@Composable
fun UserChats() {
    val columnlist = listOf(
        CompaniesList(
            R.drawable.company, "Benaa"
        ),
        CompaniesList(
            R.drawable.company, "Structure"
        ),
        CompaniesList(
            R.drawable.company, "Ebdaa"
        ),
        CompaniesList(
            R.drawable.company, "Vella"
        ),
        CompaniesList(
            R.drawable.company, "Benaa"
        ),
        CompaniesList(
            R.drawable.company, "Structure"
        ),
        CompaniesList(
            R.drawable.company, "Vella"
        ),
        CompaniesList(
            R.drawable.company, "Ebdaa"
        ),
        CompaniesList(
            R.drawable.company, "Benaa"
        ),
        CompaniesList(
            R.drawable.company, "Benaa"
        ),
        CompaniesList(
            R.drawable.company, "Benaa"
        ),
        CompaniesList(
            R.drawable.company, "Benaa"
        ),
        CompaniesList(
            R.drawable.company, "Benaa"
        ),
    )
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .padding(top=40.dp,start=10.dp,end=10.dp, bottom = 40.dp)
    ) {
       items(columnlist){it->
           ComponentOfCompany(data = it)

       }
    }
}