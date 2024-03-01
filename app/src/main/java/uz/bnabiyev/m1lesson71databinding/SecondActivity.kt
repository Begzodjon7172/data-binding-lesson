package uz.bnabiyev.m1lesson71databinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import uz.bnabiyev.m1lesson71databinding.adapters.DeveloperAdapter
import uz.bnabiyev.m1lesson71databinding.databinding.ActivitySecondBinding
import uz.bnabiyev.m1lesson71databinding.models.Developer

class SecondActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySecondBinding
    private lateinit var list: ArrayList<Developer>
    private lateinit var developerAdapter: DeveloperAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_second)

        loadData()
        developerAdapter = DeveloperAdapter(list)
        binding.rv.adapter = developerAdapter

    }

    private fun loadData() {
        list = ArrayList()
        for (i in 1..20) {
            list.add(
                Developer(
                    i,
                    "Begzodjon->$i",
                    "https://storage.kun.uz/source/thumbnails/_medium/10/b115Urb-xyPbtjlErFdN2p18Aulvqr_B_medium.jpeg"
                )
            )
        }
    }
}