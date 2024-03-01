package uz.bnabiyev.m1lesson71databinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.databinding.ObservableField
import uz.bnabiyev.m1lesson71databinding.databinding.ActivityMainBinding
import uz.bnabiyev.m1lesson71databinding.models.Employee
import uz.bnabiyev.m1lesson71databinding.models.User

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        val employee = Employee(
            1,
            ObservableField("Begzodjon"),
            "Qo'qon",
            1000.0,
            "https://storage.kun.uz/source/thumbnails/_medium/10/b115Urb-xyPbtjlErFdN2p18Aulvqr_B_medium.jpeg"
        )
        binding.begzod = employee

        binding.user = User("Begzodjon", "Nabiyev")

        binding.hobbies = arrayListOf("playing a football", "Reading a book")

        binding.handle = MyHandler()

        binding.newBtn.setOnClickListener {
//            employee.name = "Sanjar"
            binding.invalidateAll()// layout dagi qiymatlarni refresh qiib yuborati va tv ni qiymatiga "Sanjar" set boladi
        }
    }
}