package com.grupo11.gerenciamentorecursosapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class AppListAdapter(private val appNames: List<String>) : RecyclerView.Adapter<AppListAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_app_name, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.textView.text = appNames[position]

        if (position % 2 == 0) {
            holder.itemView.setBackgroundColor(holder.itemView.context.getColor(R.color.colorEven))
        } else {
            holder.itemView.setBackgroundColor(holder.itemView.context.getColor(R.color.colorOdd))
        }
    }

    override fun getItemCount(): Int = appNames.size

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val textView: TextView = view as TextView
    }
}
