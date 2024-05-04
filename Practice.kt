package com.example.helloworld

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.helloworld.ui.theme.HelloWorldTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val roastButton:Button = findViewById<Button>(R.id.roast_button)
        roastButton.setOnClickListener{
            change()
        }


    }

    private fun change(){
        val resultText: TextView = findViewById<TextView>(R.id.result_text)
        if(resultText.text=="Arpon") {
            resultText.text = "Chutiya"
        }
        else{
            resultText.text="Arpon"
        }



    }
}

