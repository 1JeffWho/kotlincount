import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import androidx.compose.ui.window.rememberWindowState

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "Compose for Desktop",
        state = rememberWindowState(width = 300.dp, height = 300.dp)
    ) {
        var count by remember { mutableStateOf(0) }

        MaterialTheme(
            colors = lightColors(primary = Color(0xFF1976D2))
        ) {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(16.dp),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = "Counter: $count",
                    style = MaterialTheme.typography.h4,
                    color = Color.Black
                )

                Spacer(modifier = Modifier.height(24.dp))

                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceEvenly
                ) {
                    Button(
                        onClick = { count++ },
                        modifier = Modifier.padding(8.dp)
                    ) {
                        Text(text = "Increment")
                    }

                    Button(
                        onClick = { count = 0 },
                        modifier = Modifier.padding(8.dp)
                    ) {
                        Text(text = "Reset")
                    }
                }
            }
        }
    }
}
