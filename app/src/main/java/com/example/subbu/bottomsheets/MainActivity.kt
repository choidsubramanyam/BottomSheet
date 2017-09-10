package com.example.subbu.bottomsheets

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.BottomSheetBehavior
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //Testing from Git hub
        val b1=findViewById<Button>(R.id.button1)
        val b2=findViewById<Button>(R.id.button2)
        val b3=findViewById<Button>(R.id.button3)
        val bottomsheet: View =findViewById(R.id.bottomsheet1)
        val bottomsheet_behaviour=BottomSheetBehavior.from(bottomsheet)
        val textview=bottomsheet.findViewById<TextView>(R.id.tv1)
        textview.setOnClickListener {
            Toast.makeText(baseContext,"Working",Toast.LENGTH_LONG).show()
        }
        bottomsheet_behaviour.peekHeight=200
        bottomsheet_behaviour.state=BottomSheetBehavior.STATE_COLLAPSED
        b1.setOnClickListener {

            if (bottomsheet_behaviour.state!=BottomSheetBehavior.STATE_EXPANDED){
                bottomsheet_behaviour.state=BottomSheetBehavior.STATE_EXPANDED

            }else{
               /* bottomsheet_behaviour.peekHeight=100*/
                bottomsheet_behaviour.state=BottomSheetBehavior.STATE_COLLAPSED

            }
        }
        b2.setOnClickListener{
            bottomsheet_behaviour.state=BottomSheetBehavior.STATE_HIDDEN
            val bottomshettDialog=BottomsheetDialog()
            bottomshettDialog.show(supportFragmentManager,bottomshettDialog.tag)
        }

    }
}
