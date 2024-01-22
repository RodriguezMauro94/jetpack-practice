package com.rodriguezmauro1994.jetpackcomponentscatalog

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.AlertDialogDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MyDialog(
    showDialog: Boolean,
    onDismiss: () -> Unit,
    onConfirm: () -> Unit
) {
    if (showDialog) {
        AlertDialog(
            onDismissRequest = {}
        ) {
            Surface(
                modifier = Modifier
                    .wrapContentHeight()
                    .wrapContentWidth(),
                shape = MaterialTheme.shapes.large,
                tonalElevation = AlertDialogDefaults.TonalElevation) {
                Column(modifier = Modifier.padding(16.dp)) {
                    Text(
                        modifier = Modifier.fillMaxWidth(),
                        fontWeight = FontWeight.Bold,
                        text = "Título",
                        textAlign = TextAlign.Center
                    )
                    MySpacer(value = 10)
                    Text(text = "Hola soy una descripción super cool :D")
                    MySpacer(value = 10)
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.End
                    ) {
                        TextButton(onClick = onDismiss) {
                            Text(text = "Dismiss")
                        }
                        Spacer(modifier = Modifier.width(5.dp))
                        TextButton(onClick = onConfirm) {
                            Text(text = "Confirm")
                        }
                    }
                }
            }
        }
    }
}

@Composable
fun MySpacer(value: Int) {
    Spacer(Modifier.height(value.dp))
}