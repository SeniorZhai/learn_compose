package one.seniorzhai.learncompose

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumnFor
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.setContent
import androidx.compose.ui.unit.dp
import androidx.ui.tooling.preview.Preview
import androidx.ui.tooling.preview.UiMode
import one.seniorzhai.learncompose.ui.LearnComposeTheme

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent { // 设置 Activity content
            LearnComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
                    main(onClick = {
                        Toast.makeText(this, "click", Toast.LENGTH_SHORT).show()
                    })
                }
            }
        }
    }
}

@Composable
fun main(onClick: () -> Unit) {
    val myData = listOf("Hello,", "world!")
    LazyColumnFor(myData) { item ->
        Card(
            modifier = Modifier.fillMaxWidth().padding(8.dp).clickable(onClick = onClick),
        ) {
            Text(item,modifier = Modifier.padding(16.dp))
        }
    }
}

@Preview(
    showBackground = false, // 显示背景
    backgroundColor = 0xFFFFF, // 背景色
    showDecoration = true
)
@Composable
fun mainPreview() {
    main(onClick = {

    })
}