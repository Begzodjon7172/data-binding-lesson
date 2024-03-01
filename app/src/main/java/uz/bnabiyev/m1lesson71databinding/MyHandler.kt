package uz.bnabiyev.m1lesson71databinding

import android.view.View
import android.widget.Toast

class MyHandler {
    fun onDelete(view:View){
        Toast.makeText(view.context, "delete", Toast.LENGTH_SHORT).show()
    }
}