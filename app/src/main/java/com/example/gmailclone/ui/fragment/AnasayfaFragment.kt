package com.example.gmailclone.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.gmailclone.data.entity.Mail
import com.example.gmailclone.databinding.FragmentAnasayfaBinding
import com.example.gmailclone.ui.adapter.MailAdapter

class AnasayfaFragment : Fragment() {

    private lateinit var binding: FragmentAnasayfaBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding=FragmentAnasayfaBinding.inflate(inflater, container, false)

        binding.rv.layoutManager= LinearLayoutManager(requireContext())
        val mailListesi= ArrayList<Mail>()
        val m1=Mail(1,2,"Udemy","!. tanım", "Hoşgeldini musa bey", "12:55",false)
        val m2=Mail(2,2,"Facebook","!. tanım", "Hoşgeldini musa bey", "12:23",false)
        val m3=Mail(3,2,"Spofity","!. tanım", "Hoşgeldini musa bey", "12:32",true)
        val m4=Mail(4,2,"Instagram","!. tanım", "Hoşgeldini musa bey", "21:23",false)
        val m5=Mail(5,2,"Teknasyon","!. tanım", "Hoşgeldini musa bey", "12:55",false)
        val m6=Mail(5,2,"Teknasyon","!. tanım", "Hoşgeldini musa bey", "12:55",false)
        val m7=Mail(5,2,"Teknasyon","!. tanım", "Hoşgeldini musa bey", "12:55",false)
        val m8=Mail(5,2,"Teknasyon","!. tanım", "Hoşgeldini musa bey", "12:55",false)
        val m9=Mail(5,2,"Teknasyon","!. tanım", "Hoşgeldini musa bey", "12:55",false)
        val m10=Mail(5,2,"Teknasyon","!. tanım", "Hoşgeldini musa bey", "12:55",false)
        val m11=Mail(5,2,"Teknasyon","!. tanım", "Hoşgeldini musa bey", "12:55",false)
        val m12=Mail(5,2,"Teknasyon","!. tanım", "Hoşgeldini musa bey", "12:55",false)
        val m13=Mail(5,2,"Teknasyon","!. tanım", "Hoşgeldini musa bey", "12:55",false)
        mailListesi.add(m1)
        mailListesi.add(m2)
        mailListesi.add(m3)
        mailListesi.add(m4)
        mailListesi.add(m5)
        mailListesi.add(m6)
        mailListesi.add(m7)
        mailListesi.add(m8)
        mailListesi.add(m9)
        mailListesi.add(m10)
        mailListesi.add(m11)
        mailListesi.add(m12)
        mailListesi.add(m13)
        val mailAdapter=MailAdapter(requireContext(),mailListesi)
        binding.rv.adapter= mailAdapter
        return binding.root
    }

}