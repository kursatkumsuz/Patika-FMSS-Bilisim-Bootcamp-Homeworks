package com.dag.odev2fmss.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.dag.odev2fmss.R
import com.dag.odev2fmss.databinding.ActivityLoginBinding
import com.dag.odev2fmss.util.CustomDialog
import com.dag.odev2fmss.viewmodel.UserViewModel

class LoginActivity : AppCompatActivity() {
    private lateinit var binding: ActivityLoginBinding
    private lateinit var viewModel: UserViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)
        // Hide status bar
        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN
        actionBar?.hide()

        viewModel = ViewModelProvider(this)[UserViewModel::class.java]

        binding.backFab.setOnClickListener {
            val intent = Intent(this, StartActivity::class.java)
            startActivity(intent)
            finish()
            overridePendingTransition(R.anim.slide_right , R.anim.slide_left)
        }
        binding.createAccountButton.setOnClickListener {
            val intent = Intent(this, SignUpActivity::class.java)
            startActivity(intent)
            finish()
            overridePendingTransition(R.anim.slide_right , R.anim.slide_left)
        }
        binding.loginButton.setOnClickListener {
            signIn()
        }
    }

    /**
     * Checks whether EditTexts are empty or not
     * If they're not empty, calls [checkUserInformation]
     */
    private fun signIn() {
        val nameInput = binding.usernameText.text.toString().replace("\\s".toRegex(), "")
        val passwordInput = binding.passwordText.text.toString()
        if (nameInput.isEmpty()) {
            binding.usernameText.error = "This field can't be blank"
        }else if(passwordInput.isEmpty()) {
            binding.passwordText.error = "This field can't be blank"
        } else {
            checkUserInformation(nameInput, passwordInput)
        }
    }

    /**
     * Checks whether the entered user information is correct or not
     * @param name for EditText's input
     * @param password for EditText's input
     */
    private fun checkUserInformation(name: String, password: String) {
        viewModel.signIn(name, password)?.observe(this, Observer { user ->
            if (user == null) {
                Toast.makeText(this, "Username or password is wrong!", Toast.LENGTH_SHORT).show()
            } else {
                CustomDialog().show(supportFragmentManager, "dialog")
                clearEditText()
            }
        })
    }

    private fun clearEditText() {
        binding.usernameText.setText("")
        binding.passwordText.setText("")
    }
}