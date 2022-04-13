package com.example.fidetronic

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var BtnLenovo = findViewById<Button>(R.id.BtnLenovoS)
        var BtnLg = findViewById<Button>(R.id.BtnLg)
        var BtnElbrus = findViewById<Button>(R.id.BtnElbrus3)
        var BtnK3 = findViewById<Button>(R.id.BtnK3)


        BtnLenovo.setOnClickListener{
            val navegacionLenovo = Intent(this, Lenovo::class.java)
            startActivity(navegacionLenovo)
        }

        BtnLg.setOnClickListener{
            val navegacionLg = Intent(this, LgUltra::class.java)
            startActivity(navegacionLg)
        }

        BtnElbrus.setOnClickListener{
            val navegacionElbrus = Intent(this, Elbrus3::class.java)
            startActivity(navegacionElbrus)
        }

        BtnK3.setOnClickListener{
            val navegacionK3 = Intent(this, AcerK3::class.java)
            startActivity(navegacionK3)
        }

    }
}