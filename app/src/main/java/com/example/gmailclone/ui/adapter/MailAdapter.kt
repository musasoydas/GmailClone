package com.example.gmailclone.ui.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.gmailclone.R
import com.example.gmailclone.data.entity.Mail
import com.example.gmailclone.databinding.MailRowBinding

class MailAdapter(val context: Context, val mailListesi: List<Mail>) :
    RecyclerView.Adapter<MailAdapter.MailViewHolder>() {
    inner class MailViewHolder(val binding: MailRowBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MailViewHolder {
        val binding = MailRowBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MailViewHolder(binding)
    }

    override fun getItemCount(): Int = mailListesi.size

    override fun onBindViewHolder(holder: MailViewHolder, position: Int) {
        with(holder.binding) {

            recyclerRowBaslik.text = mailListesi[position].mailBaslik
            recyclerRowTanim.text = mailListesi[position].mailTanim
            recyclerRowAciklama.text = mailListesi[position].mailAciklama
            recyclerRowSaat.text = mailListesi[position].mailSaat
            if(mailListesi[position].mailFavori)
                imageViewFav.setImageResource(R.drawable.fav)
            else
                imageViewFav.setImageResource(R.drawable.no_fav)


        }
    }


}
