package com.example.kinniku.screen.login

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.FocusDirection
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.kinniku.R
import com.example.kinniku.screen.component.CenterProgressIndicator
import com.example.kinniku.screen.component.InputFormNormal
import com.example.kinniku.screen.component.InputFormPass
import com.example.kinniku.screen.component.MainButton
import com.example.kinniku.ui.theme.Gray
import com.example.kinniku.ui.theme.MainRed
import com.example.kinniku.ui.theme.MainStyle
import com.example.kinniku.ui.theme.MiniStyle
import com.example.kinniku.ui.theme.SubRed
import com.example.kinniku.ui.theme.White

//画面番号：
//ログイン画面
@Composable
fun LoginScreen(
    modifier: Modifier = Modifier
) {
    LoginScreenContent(
        id = "aaaaa",
        pw = "bbbbbbb",
        isError = false,
        passwordVisible = true,
        buttonEnabled = true,
        onIdValueChange = { },
        onIdTrailingIconCheck = { },
        onPwValueChange = { },
        onPwTrailingIconClick = { },
        onLoginButtonClick = { },
        modifier = Modifier
            .background(White)
    )

    if (false) {
        CenterProgressIndicator(
            modifier = Modifier
                .padding(bottom = 270.dp)
        )
    }
}

@Composable
fun LoginScreenContent(
    modifier: Modifier = Modifier,
    isError: Boolean = false,
    id: String,
    pw: String,
    passwordVisible: Boolean,
    buttonEnabled: Boolean,
    onIdValueChange: (String) -> Unit,
    onIdTrailingIconCheck: () -> Unit,
    onPwValueChange: (String) -> Unit,
    onPwTrailingIconClick: () -> Unit,
    onLoginButtonClick: () -> Unit
) {
    val focusManager = LocalFocusManager.current

    Box(
        modifier = modifier
            .fillMaxWidth()
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .fillMaxWidth()
        ) {
            Spacer(
                modifier = Modifier.height(32.dp)
            )
            Image(
                painter = painterResource(id = R.drawable.logo_wht),
                contentDescription = "ロゴ画像"
            )

            if (isError) {
                Column {
                    Spacer(
                        modifier = Modifier
                            .height(32.dp)
                    )
                    Text(
                        text = stringResource(id = R.string.login_screen_error_message),
                        color = MainRed,
                        style = MiniStyle
                    )
                }
            }

            Spacer(
                modifier = Modifier
                    .padding(top = 30.dp)
            )
            InputFormNormal(
                value = id,
                labelText = stringResource(id = R.string.login_screen_input_form_id_label),
                isError = isError,
                supportingText = stringResource(id = R.string.login_screen_input_form_id_supporting_text),
                keyboardOptions = KeyboardOptions.Default.copy(
                    keyboardType = KeyboardType.Email,
                    imeAction = ImeAction.Next
                ),
                keyboardActions = KeyboardActions {
                    focusManager.moveFocus(FocusDirection.Down)
                },
                onTrailingIconClick = onIdTrailingIconCheck,
                onValueChange = onIdValueChange,
                modifier = Modifier
                    .fillMaxWidth()
            )
            Spacer(
                modifier = Modifier
                    .height(24.dp)
            )
            InputFormPass(
                value = pw,
                labelText = stringResource(id = R.string.login_screen_input_form_pw_label),
                isError = isError,
                passwordVisible = passwordVisible,
                supportingText = stringResource(id = R.string.login_screen_input_form_pw_supporting_text),
                keyboardOptions = KeyboardOptions.Default.copy(
                    keyboardType = KeyboardType.Password,
                    imeAction = ImeAction.Done
                ),
                keyboardActions = KeyboardActions {
                    focusManager.clearFocus()
                },
                onTrailingIconClick = onPwTrailingIconClick,
                onValueChange = onPwValueChange,
                modifier = Modifier
                    .fillMaxWidth()
            )
            Spacer(
                modifier = Modifier
                    .height(24.dp)
            )

            MainButton(
                text = stringResource(
                    id = R.string.login_screen_button_title
                ),
                enabled = buttonEnabled,
                onclick = onLoginButtonClick
            )

            Spacer(
                modifier = Modifier
                    .height(24.dp)
            )
            TextButton(
                onClick = {}
            ) {
                Text(
                    text = stringResource(
                        id = R.string.login_screen_forget_id_pw_button_title
                    ),
                    style = MainStyle,
                    color = Gray
                )
            }
            TextButton(
                onClick = {}
            ) {
                Text(
                    text = stringResource(
                        id = R.string.login_screen_register_button_title
                    ),
                    style = MainStyle,
                    color = Gray
                )
            }
            Spacer(
                modifier = Modifier
                    .height(24.dp)
            )
        }
    }
}

@Preview
@Composable
fun PreviewLoginScreenContent() {
    LoginScreenContent(
        id = "aaaaa",
        pw = "bbbbbbb",
        isError = false,
        passwordVisible = true,
        buttonEnabled = true,
        onIdValueChange = { },
        onIdTrailingIconCheck = { },
        onPwValueChange = { },
        onPwTrailingIconClick = { },
        onLoginButtonClick = { },
        modifier = Modifier
            .background(White)
    )

    if (false) {
        CenterProgressIndicator(
            modifier = Modifier
                .padding(bottom = 270.dp)
        )
    }
}