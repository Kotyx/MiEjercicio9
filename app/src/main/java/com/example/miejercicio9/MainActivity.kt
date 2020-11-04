package com.example.miejercicio9


import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import android.os.Parcelable
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import android.view.inputmethod.EditorInfo
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity() : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val b1: Button = findViewById(R.id.b1)
        val et1: EditText = findViewById(R.id.et1)
        val iv1: ImageView = findViewById(R.id.iv1)
        val cl1: ConstraintLayout = findViewById(R.id.cl1)

        et1.setVisibility(View.INVISIBLE)
        iv1.setVisibility(View.INVISIBLE)



        b1.setOnClickListener {
            if(b1.text.equals(getString(R.string.comenzar))){
                et1.setVisibility(View.VISIBLE)
                b1.setText("finalizar")
            }else{
                et1.onEditorAction(EditorInfo.IME_ACTION_DONE)
                et1.clearFocus()
                if(et1.text.toString()=="Wayne"){
                    iv1.setVisibility(View.VISIBLE)
                }else{
                    if(et1.text.toString()=="Joker"){
                        iv1.setVisibility(View.INVISIBLE)
                        cl1.setBackgroundColor(Color.argb(255, 0, 255, 0));
                        b1.setBackgroundColor(Color.argb(255, 170, 0, 255));
                        b1.setTextColor(Color.parseColor("#FFFFFF"))
                    }else{
                        iv1.setVisibility(View.INVISIBLE)
                        et1.text.clear()
                        et1.text.append("Introduce tu nombre")
                    }
                }
            }
            /*et1.setVisibility(View.VISIBLE)
            et1.isEnabled = true
            b1.text = "Finalizar"
            et1.text.clear()
            et1.text.append("Introduce tu nombre")
            et1.addTextChangedListener(object : TextWatcher {
                override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
                    et1.text.clear()
                }

                override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {

                }

                override fun afterTextChanged(s: Editable?) {
                    if (et1.text.isNotEmpty()) {
                        et1.text.append(s)
                    }else{
                        et1.text.append("Introduce tu nombre")
                    }
                }
            })
            b1.setOnClickListener {
                if(et1.text.isEmpty()){
                    et1.setVisibility(View.INVISIBLE)
                    et1.isEnabled = false
                }else{
                    if(et1.text.equals("Wayne")==true){
                        iv1.setVisibility(View.VISIBLE)
                    }
                }
            }
            if (et1.text.isEmpty()) {
                et1.setVisibility(View.INVISIBLE)
                et1.isEnabled = false
            } else {
                if (et1.equals("Wayne") == true) {
                    iv1.setVisibility(View.VISIBLE)
                    cl1.setBackgroundColor(Color.argb(255, 0, 255, 0));

                }
            }*/
        }
    }
}

