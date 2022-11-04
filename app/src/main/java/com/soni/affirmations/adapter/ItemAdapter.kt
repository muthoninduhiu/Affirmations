package com.soni.affirmations.adapter

import android.content.Context
import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.soni.affirmations.R
import com.soni.affirmations.model.AffirmationsModel

class ItemAdapter(val context: Context, private val dataset: List<AffirmationsModel>)
    :RecyclerView.Adapter<ItemAdapter.ItemViewHolder{
    //creating a nested class
    class ItemViewHolder(private val view: View): RecyclerView.ViewHolder(view){
        val textView: TextView = view.findViewById(R.id.item_title)
    }
}