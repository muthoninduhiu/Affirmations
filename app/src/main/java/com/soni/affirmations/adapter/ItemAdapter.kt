package com.soni.affirmations.adapter

import android.content.Context
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.soni.affirmations.model.AffirmationsModel

class ItemAdapter(val context: Context, private val dataset: List<AffirmationsModel>) {
    //creating a nested class
    class ItemViewHolder(private val view: View): RecyclerView.ViewHolder(view){

    }
}