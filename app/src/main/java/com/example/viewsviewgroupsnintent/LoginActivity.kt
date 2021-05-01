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
            if (email.text.toString().isNullOrEmpty() || password.text.toString().isNullOrEmpty()) {
                Toast.makeText(this, "Email or password is not provided", Toast.LENGTH_LONG).show()
            }
            else {
                if (email.text.toString() == "try@yahoo.com" && password.text.toString() == "abcde") {
                    val intent = Intent(this, MainActivity::class.java)
                    startActivity(intent)
                }
                else {
                    Toast.makeText(this, "Wrong email or password provided", Toast.LENGTH_LONG).show()
                }
            }
        }
    }
}