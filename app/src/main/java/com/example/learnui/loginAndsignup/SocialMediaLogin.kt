package com.example.learnui.loginAndsignup

import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.composed
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.learnui.SignUp
import com.example.learnui.ui.theme.BlueGray
import com.example.learnui.ui.theme.LightBlueWhite

@Composable
fun SocialMediaLogin(
    modifier: Modifier = Modifier,
    @DrawableRes icon: Int,
    text: String,
    onClick: () -> Unit,
) {

    Row(
        modifier = modifier
            .clip(RoundedCornerShape(4.dp))
            .socialMedia()
            .clickable { onClick() }
            .height(40.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center
    ) {

        Image(painter = painterResource(id = icon), contentDescription = null, modifier = Modifier.size(16.dp))

        Spacer(modifier = Modifier.width(5.dp))

        Text(
            text = text,
            style = MaterialTheme.typography.labelMedium.copy(color = Color(0xFF64748B))
        )

    }
}



@SuppressLint("ModifierFactoryUnreferencedReceiver")
fun Modifier.socialMedia() : Modifier = composed {
    if(isSystemInDarkTheme()){
        background(Color.Transparent).border(
            width = 1.dp,
            color = BlueGray,
            shape = RoundedCornerShape(4.dp)
        )
    }else{
        background(LightBlueWhite)
    }
}