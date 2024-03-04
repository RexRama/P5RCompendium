package com.ramarai.p5rcompendium

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.ramarai.p5rcompendium.databinding.ItemRowPersonaBinding

class ListPersonaAdapter(private val listPersona: List<Persona>) : RecyclerView.Adapter<ListPersonaAdapter.ListViewHolder>() {

    class ListViewHolder(var binding: ItemRowPersonaBinding) : RecyclerView.ViewHolder(binding.root)


    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ListViewHolder {
        val binding = ItemRowPersonaBinding.inflate(LayoutInflater.from(viewGroup.context), viewGroup, false)
        return ListViewHolder(binding)
    }

    override fun getItemCount(): Int = listPersona.size

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val persona = listPersona[position]

        Glide.with(holder.itemView.context)
            .load(persona.personaPicture)
            .into(holder.binding.imgItemPhoto)
        holder.binding.tvItemName.text = persona.personaName
        holder.binding.tvItemDescription.text = persona.personaDescription

        holder.itemView.setOnClickListener{
            val intentDetail = Intent(holder.itemView.context,DetailActivity::class.java)
            intentDetail.putExtra("key_persona", listPersona[holder.adapterPosition])
            holder.itemView.context.startActivity(intentDetail)
        }
    }

}