package com.codetecacihuatl.smart_shopping.ui.utils

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults.textButtonColors
import androidx.compose.material.ExtendedFloatingActionButton
import androidx.compose.material.MaterialTheme
import androidx.compose.material.OutlinedButton
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.CheckCircle
import androidx.compose.material.Text
import androidx.compose.material.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.codetecacihuatl.smart_shopping.R
import com.codetecacihuatl.smart_shopping.ui.theme.primaryDarkColor
import com.codetecacihuatl.smart_shopping.ui.theme.primaryTextColor
import com.codetecacihuatl.smart_shopping.ui.theme.secondaryDarkColor
import com.codetecacihuatl.smart_shopping.ui.theme.secondaryTextColor
import com.codetecacihuatl.smart_shopping.ui.theme.SmartShoppingTheme

@Composable
fun ButtonPrimary(
    text: String,
    enabled: Boolean,
    onClick: () -> Unit
) {
    val modifier = Modifier
        .background(
            color = primaryDarkColor,
            shape = MaterialTheme.shapes.small
        )
    Button(
        modifier = modifier,
        enabled = enabled,
        colors = textButtonColors(primaryDarkColor),
        onClick = onClick
    ) {
        Text(
            text = text,
            color = primaryTextColor
        )
    }
}

@Composable
fun ButtonSecondary(
    text: String,
    enabled: Boolean,
    onClick: () -> Unit
) {
    val modifier = Modifier
        .background(
            color = primaryDarkColor,
            shape = MaterialTheme.shapes.small
        )
    OutlinedButton(
        modifier = modifier,
        enabled = enabled,
        border = BorderStroke(1.dp, primaryDarkColor),
        onClick = onClick
    ) {
        Text(
            text = text,
            color = secondaryTextColor
        )
    }
}

@Composable
fun FloatingButton(
    icon: ImageVector,
    onClick: () -> Unit
) {
    ExtendedFloatingActionButton(
        text = {
            Text(
                text = "",
                color = secondaryTextColor
            )
        },
        onClick = onClick,
        icon = {
            Icon(
                imageVector = icon,
                "",
                modifier = Modifier,
                tint = primaryTextColor
            )
        },
        backgroundColor = secondaryDarkColor
    )
}

@Preview
@Composable
fun PreviewButtons() {
    SmartShoppingTheme {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.padding(8.dp)
        ) {
            ButtonPrimary(
                text = stringResource(id = R.string.login_sign_in),
                enabled = false,
                onClick = { println("Primary button") }
            )
            Spacer(modifier = Modifier.padding(8.dp))
            ButtonSecondary(
                text = stringResource(id = R.string.login_sign_up),
                enabled = true,
                onClick = { println("Secondary button") }
            )
            FloatingButton(
                icon = Icons.Default.CheckCircle,
                onClick = { println("Floating button") }
            )
        }
    }
}