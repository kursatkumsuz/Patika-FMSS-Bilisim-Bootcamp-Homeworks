package com.dag.odev2fmss.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.lifecycle.ViewModelProvider
import com.dag.odev2fmss.R
import com.dag.odev2fmss.database.UserEntity
import com.dag.odev2fmss.databinding.ActivitySignUpBinding
import com.dag.odev2fmss.util.CustomDialog
import com.dag.odev2fmss.viewmodel.UserViewModel

class SignUpActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySignUpBinding
    private lateinit var viewModel: UserViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySignUpBinding.inflate(layoutInflater)
        setContentView(binding.root)
        // Hide status bar
        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN
        actionBar?.hide()
        // Instantiate ViewModel
        viewModel = ViewModelProvider(this)[UserViewModel::class.java]

        binding.backFab.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
            finish()
            overridePendingTransition(R.anim.slide_right, R.anim.slide_left)
        }
        binding.signUpButton.setOnClickListener {
            saveUser()
        }
    }

    /**
     * Checks whether EditTexts are empty or not and then adds a new user information to database
     */
    private fun saveUser() {
        val mailInput = binding.emailText.text.toString().replace("\\s".toRegex(), "")
        val nameInput = binding.usernameText.text.toString().replace("\\s".toRegex(), "")
        val passwordInput = binding.passwordText.text.toString()

        if (mailInput.isEmpty()) {
            binding.emailText.error = "This field can't be blank"
        } else if (nameInput.isEmpty()) {
            binding.usernameText.error = "This field can't be blank"
        } else if (passwordInput.isEmpty()) {
            binding.passwordText.error = "This field can't be blank"
        } else {
            val user = UserEntity(mailInput, nameInput, passwordInput)
            viewModel.addUser(user)
            CustomDialog().show(supportFragmentManager, "dialog")
            clearEditText()
        }
    }

    private fun clearEditText() {
        binding.emailText.setText("")
        binding.usernameText.setText("")
        binding.passwordText.setText("")
    }
}