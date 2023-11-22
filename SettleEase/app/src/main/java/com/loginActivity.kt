
package com

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.project.R

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        var signup:TextView=findViewById(R.id.signup_text)
        signup.setOnClickListener()
        {
            val iNext:Intent= Intent(this,signupActivity::class.java)
            startActivity(iNext)
        }


    }
}