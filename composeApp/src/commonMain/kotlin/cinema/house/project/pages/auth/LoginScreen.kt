package cinema.house.project.pages.auth

import presentation.component.DefaultButton

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import cinema.house.project.config.theme.DefaultTextFieldTheme
import cinema.house.project.core.ProgressBarState
import cinema.house.project.widgets.*
import org.jetbrains.compose.resources.ExperimentalResourceApi
import presentation.component.DEFAULT__BUTTON_SIZE_EXTRA


@OptIn(ExperimentalResourceApi::class)
@Composable
fun LoginScreen(
   
    navigateToMain: () -> Unit,
    navigateToRegister: () -> Unit
) {

  

    var isUsernameError by rememberSaveable { mutableStateOf(false) }
    var isPasswordError by rememberSaveable { mutableStateOf(false) }


        Column(
            modifier = Modifier.fillMaxSize().padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Text("Sign IN", style = MaterialTheme.typography.displaySmall)
            Spacer_16dp()
            Text(
                "WelCome",
                style = MaterialTheme.typography.labelMedium
            )
            Spacer_32dp()

            Column(
                horizontalAlignment = Alignment.Start
            ) {
                Text("Email")
                Spacer_4dp()
                TextField(
                    isError = isUsernameError,
                    value ="Email",
                    onValueChange = {
                       
                    },
                    modifier = Modifier.fillMaxWidth(),
                    colors = DefaultTextFieldTheme(),
                    shape = MaterialTheme.shapes.small,
                    singleLine = true,
                    keyboardOptions = KeyboardOptions(
                        imeAction = ImeAction.Next,
                        keyboardType = KeyboardType.Email,
                    ),
                )
                AnimatedVisibility(visible = isUsernameError) {
                    Text(
                       "Enter valid email",
                        style = MaterialTheme.typography.bodySmall,
                        color = MaterialTheme.colorScheme.error
                    )
                }
                Spacer_8dp()

                Text("Password")
                Spacer_4dp()
                PasswordTextField(
                    value = "",
                    onValueChange = {
                       
                    },
                    modifier = Modifier.fillMaxWidth(),
                )

                AnimatedVisibility(visible = isPasswordError) {
                    Text(
                        "enter valid password",
                        style = MaterialTheme.typography.bodySmall,
                        color = MaterialTheme.colorScheme.error
                    )
                }
            }
            Spacer_8dp()
            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.End
            ) {
                Text(
                    "forgot password",
                    style = MaterialTheme.typography.labelMedium,
                    color = MaterialTheme.colorScheme.primary,
                    textDecoration = TextDecoration.Underline
                )
            }

            Spacer_32dp()


            Column(
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                DefaultButton(
                    progressBarState = ProgressBarState.Idle,
                    text = "Sign In",
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(DEFAULT__BUTTON_SIZE_EXTRA),
                    onClick = {  }
                )

                Spacer(Modifier.height(32.dp))
            }

            Column(
                modifier = Modifier
                    .fillMaxWidth()
            ) {

                Row(
                    modifier = Modifier
                        .fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    HorizontalDivider(modifier = Modifier.width(75.dp))
                    Text(text = "Sign In")
                    HorizontalDivider(modifier = Modifier.width(75.dp))
                }
                Spacer_32dp()
            }
            Spacer_32dp()
            Row(verticalAlignment = Alignment.CenterVertically) {
            
                Spacer_4dp()
                Text(
                    modifier = Modifier.clickable {
                        navigateToRegister()
                    },
                    text = "Don't Have account",
                    color = MaterialTheme.colorScheme.primary,
                    textDecoration = TextDecoration.Underline
                )
            }

        }
    }
