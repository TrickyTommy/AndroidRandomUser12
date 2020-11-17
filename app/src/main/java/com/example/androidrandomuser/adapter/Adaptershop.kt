package com.example.androidrandomuser.adapter

import android.content.Context
import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import com.bumptech.glide.Glide
import com.example.androidrandomuser.databinding.ListShopBinding
import com.example.androidrandomuser.model.ModelData


class Adaptershop (private val context: Context):RecyclerView.Adapter<Adaptershop.ViewHolder>() {
    private var datas = listOf<ModelData>()

    fun setData(data: List<ModelData>){
        datas = data
        notifyDataSetChanged()
    }



    inner class ViewHolder (private val binding: ListShopBinding) :
        RecyclerView.ViewHolder(binding.root){
        fun binData(letak:ModelData){

            binding.tvTittle.text = letak.title
            binding.tvPrice.text = "Rp."+ letak.price.toString()
            binding.tvCategory.text = "Kategori :"+letak.category
//            binding.tvDescription.text = letak.description
            Glide.with(binding.root).load(letak.image).into(binding.ivImage)
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            ListShopBinding.inflate(
                LayoutInflater.from(context),
                parent,false
            )
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.binData(datas[position])
    }

    override fun getItemCount(): Int = datas.size
}