package com.example.movetoplayversiontwo.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.domain.model.Coin
import com.example.movetoplayversiontwo.databinding.CoinRowBinding

class CoinRecyclerAdapter(val coinList: List<Coin>) :
    RecyclerView.Adapter<CoinRecyclerAdapter.CoinViewHolder>() {
    class CoinViewHolder(val binding: CoinRowBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CoinViewHolder {
        val binding = CoinRowBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return CoinViewHolder(binding)
    }

    override fun onBindViewHolder(holder: CoinViewHolder, position: Int) {
        holder.binding.coinName.text = coinList[position].name
    }

    override fun getItemCount(): Int = coinList.size
}
