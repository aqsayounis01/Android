
package com.example.afinal

import android.content.DialogInterface
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.RadioButton
import android.widget.TextView
import android.widget.ToggleButton
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.content.res.AppCompatResources
import androidx.appcompat.widget.Toolbar
import androidx.constraintlayout.widget.ConstraintLayout
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {

  lateinit var toolbar:Toolbar     //this is added
lateinit var cl: ConstraintLayout
lateinit var b:Button
lateinit var b2 :Button
lateinit var t: TextView
lateinit var et:EditText
lateinit var image:ImageView
lateinit var male:CheckBox
lateinit var female:CheckBox
lateinit var r1:RadioButton
lateinit var r2 :RadioButton
lateinit var tb:ToggleButton

//    lateinit var l:ListView
//    var item=ArrayList<String>()
//    var ff=filefile()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        toolbar=findViewById(R.id.toolbar)   //this is added
        cl=findViewById(R.id.linearLayout)
        b=findViewById(R.id.b1)
    b2=findViewById(R.id.b2)
    t=findViewById(R.id.tv)
    et=findViewById(R.id.edittext)
    image=findViewById(R.id.imageView6)
    male=findViewById(R.id.c1)
    female=findViewById(R.id.c2)
    r1=findViewById(R.id.r1)
//        l=findViewById(R.id.list)
    r2=findViewById(R.id.r2)
    tb=findViewById(R.id.tb)
        //after adding it will show on the activity
//        item=ff.rd(this)
//        var arrayadapter=ArrayAdapter(this,android.R.layout.simple_list_item_1,android.R.id.text1
//        ,item)
//        l.adapter=arrayadapter

//        b.setOnClickListener()
//        {
//            var itemname:String=et.text.toString()
//            item.add(itemname)
//            et.setText("")
//            ff.wr(item,applicationContext)
//            arrayadapter.notifyDataSetChanged()
//        }
//to make the icon as the overflow icon
        toolbar.overflowIcon= AppCompatResources.getDrawable(this,R.drawable.baseline_more_horiz_24)

        toolbar.setNavigationOnClickListener() {
                Snackbar.make(cl,"this is a navigation menu",Snackbar.LENGTH_INDEFINITE).setAction(
                    "close", View.OnClickListener { }).show()

            }

    b.setOnClickListener {

            b.setText("ADD")
        var work:String = et.text.toString()
        b2.text=work
//      or  b2.setText(work)
        if(r1.isChecked)
        {
            cl.setBackgroundColor(Color.RED)
        }
        else if(r2.isChecked)
        {
            cl.setBackgroundColor(Color.GREEN)
        }

    }

b2.setOnClickListener {
t.setText("thankyou for using the app")
}
tb.setOnCheckedChangeListener { b, isChecked ->
    if(isChecked)
    {
        image.visibility=View.INVISIBLE
    }
    else
    {
        image.visibility=View.VISIBLE
    }
}
male.setOnClickListener()
{
    if(male.isChecked)
    {
        image.setImageResource(R.drawable.ic_launcher_background)
        female.isChecked=false
    }
    else
    {
        image.setImageResource(R.drawable.hr2)
    }
}

        toolbar.setOnClickListener() {


                db()
            //Toast.makeText(applicationContext, "add is clicked ", Toast.LENGTH_SHORT).show()


        }

    }

fun db()
{
var alert=AlertDialog.Builder(this)

    alert.setTitle("Change").setMessage("Do you want to play game")
        .setIcon(R.drawable.baseline_sports_esports_24)
        .setCancelable(false)
        .setNegativeButton("No", DialogInterface.OnClickListener(){dialog, which ->
            dialog.cancel()
        })


        alert.setPositiveButton("Yes", DialogInterface.OnClickListener() { dialog, which ->

            alert.setMessage("study").setPositiveButton("Yes", DialogInterface.OnClickListener(){dialog, which ->

            }).show()



        }).create().show()
}
}




















