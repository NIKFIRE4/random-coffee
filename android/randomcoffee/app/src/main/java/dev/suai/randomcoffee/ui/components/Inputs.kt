package dev.suai.randomcoffee.ui.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import dev.suai.randomcoffee.ui.theme.RandomCoffeeTheme

@Composable
fun LoginInput(
    value: String,
    onValueChange: (String) -> Unit,
    errorText: String? = null,
    modifier: Modifier = Modifier
) {
    OutlinedTextField(
        value = value,
        onValueChange = onValueChange,
        modifier = modifier.fillMaxWidth(),
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email),
        label = { Text("Эл.почта*") },
        placeholder = { Text("example@example.com") },
        leadingIcon = { Icon(Icons.Default.Email, contentDescription = "Email") },
        isError = errorText != null,
        supportingText = { errorText?.let { Text(it) } },
    )
}

@Composable
@Preview
private fun LoginInputPreview() {
    RandomCoffeeTheme {
//        LoginInput()
    }
}

@Composable
fun PasswordInput(
    value: String,
    onValueChange: (String) -> Unit,
    errorText: String? = null,
    modifier: Modifier = Modifier
) {
    OutlinedTextField(
        value = value,
        onValueChange = onValueChange,
        modifier = modifier.fillMaxWidth(),
        visualTransformation = PasswordVisualTransformation(),
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
        label = { Text("Пароль") },
        placeholder = { Text("abcd1234") },
        leadingIcon = { Icon(Icons.Default.Lock, contentDescription = "Password") },
        isError = errorText != null,
        supportingText = { errorText?.let { Text(it) } },
    )
}

@Composable
fun StringInput(
    value: String,
    onValueChange: (String) -> Unit,
    label: String = "",
    placeholder: String = "",
    icon: ImageVector? = null,
    errorText: String? = null,
    modifier: Modifier = Modifier
) {
    OutlinedTextField(
        value = value,
        onValueChange = onValueChange,
        modifier = modifier.fillMaxWidth(),
        label = { Text(label) },
        placeholder = { Text(placeholder) },
        leadingIcon = {
            if (icon != null) {
                Icon(icon, contentDescription = null)
            }
        },
        isError = errorText != null,
        supportingText = { errorText?.let { Text(it) } },
    )
}