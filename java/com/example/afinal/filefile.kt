package com.example.afinal

import android.content.Context
import java.io.FileInputStream
import java.io.FileNotFoundException
import java.io.FileOutputStream
import java.io.ObjectInputStream
import java.io.ObjectOutputStream

class filefile {
    val FILENAME="final.dat"
    fun wr(item:ArrayList<String>,context:Context)
    {
        //writing in the file
        var fos:FileOutputStream=context.openFileOutput(FILENAME,Context.MODE_PRIVATE)
        var os= ObjectOutputStream(fos)
        os.writeObject(item)
        os.close()
    }
    fun rd(context:Context):ArrayList<String>{
        //reading from the file
        var itemlist:ArrayList<String>
        try
        {
            var fis:FileInputStream= context.openFileInput(FILENAME)
            var ois=ObjectInputStream(fis)
            itemlist= ois.readObject() as ArrayList<String>
        }
        catch (error:FileNotFoundException)
        {
            itemlist=ArrayList()
        }
        return itemlist
    }
}