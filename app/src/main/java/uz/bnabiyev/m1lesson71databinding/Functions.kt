package uz.bnabiyev.m1lesson71databinding

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import androidx.databinding.BindingConversion
import com.squareup.picasso.Picasso

@BindingAdapter("app:url")
fun loadAvatar(imageView: ImageView, url: String) {
    Picasso.get().load(url).into(imageView)
}

@BindingConversion // bu funksiya textviewga listni set qilish uchun ishlatiladi
fun getHobbies(list: List<String>): String {
    val stringBuilder = StringBuilder()
    list.forEach {
        stringBuilder.append(it)
    }
    return stringBuilder.toString()
}