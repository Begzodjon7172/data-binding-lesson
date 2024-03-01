package uz.bnabiyev.m1lesson71databinding.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import uz.bnabiyev.m1lesson71databinding.databinding.ItemDevBinding
import uz.bnabiyev.m1lesson71databinding.models.Developer

class DeveloperAdapter(private val list: List<Developer>) :
    RecyclerView.Adapter<DeveloperAdapter.Vh>() {

    inner class Vh(private val itemDevBinding: ItemDevBinding) :
        RecyclerView.ViewHolder(itemDevBinding.root) {
        fun onBind(developer: Developer) {
            itemDevBinding.developer = developer
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Vh {
        return Vh(ItemDevBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: Vh, position: Int) {
        holder.onBind(list[position])
    }
}