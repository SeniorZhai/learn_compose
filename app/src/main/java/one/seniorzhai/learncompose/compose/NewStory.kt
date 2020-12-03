package one.seniorzhai.learncompose.compose

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.preferredHeight
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.ui.tooling.preview.Preview
import one.seniorzhai.learncompose.R
import one.seniorzhai.learncompose.ui.typography

@Composable
fun NewsStory() {
    val image = imageResource(R.drawable.header)
    // Layout
    Column(modifier = Modifier.padding(16.dp)) {
        Image(
            image,
            modifier = Modifier // 修饰 描述View的位置、padding等信息
                .preferredHeight(180.dp)
                .fillMaxWidth()
                .clip(shape = RoundedCornerShape(4.dp)),
            contentScale = ContentScale.Crop
        )
        Spacer(modifier = Modifier.preferredHeight(16.dp))
        Text(
            "A day wandering through the sandhills in Shark Fin Cove, and a few of the sights I saw",
            maxLines = 2,
            overflow = TextOverflow.Ellipsis,
            style = typography.h6,
            modifier = Modifier.padding(3.dp)
                .then(Modifier.fillMaxWidth())
        )
        Text("Davenport, California", style = typography.body1)
        Text("December 2018", style = typography.body2)
    }
}

@Preview(
    name = "NewsStory",
    showBackground = false, // 显示背景
    backgroundColor = 0xFFFFF, // 背景色
    showDecoration = true, // 显示StatusBar Toolbar
    group = "GroupName",
    fontScale = 1.2f, // 字体放大
    widthDp = 300, // 最大宽度 单位dp
    heightDp = 800, // 最大高度 单位 dp
)
@Composable
fun Preview() {
    NewsStory()
}