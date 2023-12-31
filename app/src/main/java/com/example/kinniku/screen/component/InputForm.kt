package com.example.kinniku.screen.component

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Clear
import androidx.compose.material.icons.filled.Visibility
import androidx.compose.material.icons.filled.VisibilityOff
import androidx.compose.material.icons.filled.Warning
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import com.example.kinniku.ui.theme.Gray
import com.example.kinniku.ui.theme.MainRed
import com.example.kinniku.ui.theme.MainStyle
import com.example.kinniku.ui.theme.MiniStyle
import com.example.kinniku.ui.theme.SubRed
import com.example.kinniku.ui.theme.SubStyle
import com.example.kinniku.ui.theme.White

//モジュール番号：
//基本のInputForm
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun InputFormNormal(
    modifier: Modifier = Modifier,
    value: String,
    labelText: String,
    isError: Boolean = false,
    supportingText: String,
    keyboardOptions: KeyboardOptions = KeyboardOptions.Default,
    keyboardActions: KeyboardActions = KeyboardActions.Default,
    onTrailingIconClick: () -> Unit,
    onValueChange: (String) -> Unit
) {
    OutlinedTextField(
        value = value,
        label = {
            Text(
                text = labelText,
                style = SubStyle
            )
        },
        isError = isError,
        colors = TextFieldDefaults.outlinedTextFieldColors(
            focusedBorderColor = SubRed,
            unfocusedBorderColor = Gray
        ),
        textStyle = MainStyle,
        supportingText = {
            Text(
                text = supportingText,
                style = MiniStyle
            )
        },
        trailingIcon = {
            if (isError) {
                Icon(
                    Icons.Filled.Warning,
                    contentDescription = "エラーアイコン",
                    tint = MainRed
                )
            } else {
                if (value.isNotBlank()) {
                    Icon(
                        Icons.Filled.Clear,
                        contentDescription = "一括クリアボタン",
                        modifier = Modifier
                            .clickable { onTrailingIconClick() },
                        tint = Gray
                    )
                }
            }
        },
        keyboardActions = keyboardActions,
        keyboardOptions = keyboardOptions,
        singleLine = true,
        onValueChange = onValueChange,
        modifier = modifier,
    )
}

@Preview
@Composable
fun PreviewInputFormNormal() {
    Box(
        modifier = Modifier
            .background(White)
    ) {
        InputFormNormal(
            value = "",
            labelText = "ID",
            supportingText = "半角英数字4～16文字以内",
            onTrailingIconClick = {},
            onValueChange = {}
        )
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun InputFormPass(
    modifier: Modifier = Modifier,
    value: String,
    passwordVisible: Boolean,
    labelText: String,
    isError: Boolean = false,
    supportingText: String,
    keyboardOptions: KeyboardOptions = KeyboardOptions.Default,
    keyboardActions: KeyboardActions = KeyboardActions.Default,
    onTrailingIconClick: () -> Unit,
    onValueChange: (String) -> Unit,
) {
    OutlinedTextField(
        value = value,
        label = {
            Text(
                text = labelText,
                style = SubStyle
            )
        },
        isError = isError,
        textStyle = MainStyle,
        colors = TextFieldDefaults.outlinedTextFieldColors(
            focusedBorderColor = SubRed,
            unfocusedBorderColor = Gray
        ),
        visualTransformation = if (passwordVisible) {
            VisualTransformation.None
        } else {
            PasswordVisualTransformation()
        },
        supportingText = {
            Text(
                text = supportingText,
                style = MiniStyle
            )
        },
        trailingIcon = {
            if (isError) {
                Icon(
                    Icons.Filled.Warning,
                    contentDescription = "エラーアイコン",
                    tint = MainRed
                )
            } else {
                val image = if (passwordVisible) {
                    Icons.Filled.Visibility
                } else {
                    Icons.Filled.VisibilityOff
                }
                Icon(
                    image,
                    contentDescription = "パスワード表示非表示アイコン",
                    modifier = Modifier
                        .clickable { onTrailingIconClick() },
                    tint = if (passwordVisible) {
                        SubRed
                    } else {
                        Gray
                    }
                )
            }
        },
        singleLine = true,
        keyboardActions = keyboardActions,
        keyboardOptions = keyboardOptions,
        onValueChange = onValueChange,
        modifier = modifier
    )
}

@Preview
@Composable
fun PreviewInputFormPass() {
    Box(
        modifier = Modifier.background(White)
    ) {
        InputFormPass(
            value = "preview",
            passwordVisible = false,
            labelText = "password",
            supportingText = "半角英数4～16文字以内",
            onTrailingIconClick = {},
            onValueChange = {}
        )
    }
}