package com.example.example_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
       val btnShowToast: Button = findViewById(R.id.btnShowToast)
        val editText: EditText = findViewById(R.id.etUserMessage);
          btnShowToast.setOnClickListener {

              Log.i("MainActivity","Button Clicked")
              Log.i("MainActivity",editText.text.toString())
}


        val btnShare:Button = findViewById(R.id.btnShare)
        btnShare.setOnClickListener {
            val intent =Intent()
            intent.action = Intent.ACTION_SEND
            intent.putExtra(Intent.EXTRA_TEXT, editText.text.toString())
            intent.type = "text/plane"
            startActivity(Intent.createChooser(intent,"Share to"))
        }
    }

}