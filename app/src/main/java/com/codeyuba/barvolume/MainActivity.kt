package com.codeyuba.barvolume

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity(), View.OnClickListener {

    companion object{
        const val STATE  = "state"
    }

    private lateinit var edtLength: EditText
    private lateinit var edtWidth: EditText
    private lateinit var edtHeight: EditText
    private lateinit var tvResult: TextView
    private lateinit var btn_Calculate: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        edtLength = findViewById(R.id.edtLength)
        edtWidth = findViewById(R.id.edtWidth)
        edtHeight = findViewById(R.id.edtHeight)

        btn_Calculate = findViewById(R.id.btnCalculate)
        tvResult = findViewById(R.id.tvResult)

        btn_Calculate.setOnClickListener(this)

        if (savedInstanceState !=null){
            tvResult.text = savedInstanceState.getString(STATE)
        }
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putString(STATE,tvResult.text.toString())
    }

    override fun onClick(view: View) {
        var isFieldEmpty = false
        val inputWidth = edtWidth.text.toString().trim()
        val inputHeight = edtHeight.text.toString().trim()
        val inputLength = edtLength.text.toString().trim()

        when (view) {
            btn_Calculate -> {
                if (inputLength.isEmpty()) {
                    isFieldEmpty = true
                    edtLength.error = "Field is empty!"
                }
                else if (inputWidth.isEmpty()){
                    isFieldEmpty = true
                    edtWidth.error = "Field is empty"
                }
                else if (inputHeight.isEmpty()){
                    isFieldEmpty = true
                    edtHeight.error = "Field is Empty"
                }

                else if (isFieldEmpty==false){
                    val result = inputLength.toDouble() * inputWidth.toDouble() * inputHeight.toDouble()
                    tvResult.text = result.toString()
                }
            }
        }
    }
}