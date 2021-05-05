package com.example.viewsviewgroupsnintent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.google.android.material.button.MaterialButton
import com.google.android.material.textfield.TextInputEditText

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        title = "Login"
        signIn()
    }

    private fun signIn() {
        val email = findViewById<TextInputEditText>(R.id.emailEditText)
        val password = findViewById<TextInputEditText>(R.id.passwordEditText)
        val signInButton = findViewById<MaterialButton>(R.id.loginButton)

        signInButton.setOnClickListener() {
            if (email.text.toString().isNullOrEmpty() && password.text.toString().isNullOrEmpty()) {
                email.error = "Enter try@yahoo.com"
                password.error = "Enter abcde"
                Toast.makeText(this, "Email and password is not provided", Toast.LENGTH_LONG).show()
            }
            else {
                if (email.text.toString() == "try@yahoo.com" && password.text.toString() == "abcde") {
                    val intent = Intent(this, MainActivity::class.java)
                    startActivity(intent)
                }
                else if ((email.text.toString() != "try@yahoo.com" || email.text.toString() == "try@yahoo.com") && password.text.toString().isNullOrEmpty()){
                    password.error = "Enter abcde"
                    Toast.makeText(this, "Password is not provided", Toast.LENGTH_LONG).show()
                }
                else if ((password.text.toString() != "abcde" || password.text.toString() == "abcde") && email.text.toString().isNullOrEmpty()){
                    email.error = "Enter try@yahoo.com"
                    Toast.makeText(this, "Email is not provided", Toast.LENGTH_LONG).show()
                }
                else {
                    email.error = "Enter try@yahoo.com"
                    password.error = "Enter abcde"
                    Toast.makeText(this, "Wrong email or password provided", Toast.LENGTH_LONG).show()
                }
            }
        }
    }
}