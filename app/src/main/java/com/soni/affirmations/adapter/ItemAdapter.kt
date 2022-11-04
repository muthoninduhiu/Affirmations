package com.soni.affirmations.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.soni.affirmations.R
import com.soni.affirmations.model.AffirmationsModel

class ItemAdapter(val context: Context, private val dataset: List<AffirmationsModel>)
    :RecyclerView.Adapter<ItemAdapter.ItemViewHolder>(){
    //creating a nested class
    class ItemViewHolder(private val view: View): RecyclerView.ViewHolder(view){
        val textView: TextView = view.findViewById(R.id.item_title)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val adapterLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_item,parent)
        return ItemViewHolder(adapterLayout)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = dataset[position]
        holder.textView.text = context.resources.getString(item.stringResource)
    }

    override fun getItemCount(): Int = dataset.size
}