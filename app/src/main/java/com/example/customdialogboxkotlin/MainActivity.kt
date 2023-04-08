package com.example.customdialogboxkotlin

import android.app.Dialog
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private var btn1: Button? = null
    private var btnokay: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn1 = findViewById(R.id.btn1)

        btn1?.setOnClickListener(View.OnClickListener {
            val dialog = Dialog(this@MainActivity)
            dialog.setContentView(R.layout.custom_dialog_layout)
            dialog.setCancelable(false)
            btnokay = dialog.findViewById(R.id.btnokay)
            btnokay?.setOnClickListener(View.OnClickListener {
                Toast.makeText(this@MainActivity, "Dialog Closed", Toast.LENGTH_SHORT).show()
                dialog.dismiss()
            })
            dialog.show()
        })

    }
}