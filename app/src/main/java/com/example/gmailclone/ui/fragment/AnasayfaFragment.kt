package com.example.gmailclone.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.gmailclone.R
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
        val m1=Mail(2,R.drawable.oplog,"Welcome Oplog!","İş teklifin onaylandı!", "Musa selam , Oplog ekibine katıldığını bildirmek isteriz!", "19:23",true)
        val m2=Mail(1, R.drawable.udemy_logo,"Udemy Teklif Aldın!","Selam Musa, iş teklifini değerlendir.", "Selamlar Musa Bey, Udemy olarak iş teklifinde bulunmak isteriz ", "17:55",false)
        val m3=Mail(3,R.drawable.albank,"Akbank Android Team!","Jr. Android developer", "Jr. Android Developer pozisyon açığımızı sizlerele beraber doldurmka istediğimizi sizlere bildirmek isteriz. ", "17:52",true)
        val m4=Mail(4,R.drawable.argenova,"Argenova","Android Team ", "Android ekibimizde sizleri de aramızda görmek isteriz. Bizimle iletişime geçin ", "14:23",false)
        val m5=Mail(5,R.drawable.google,"Google","Google verilerinizi yedekleyin. ", "Sende verilerini yedekleyerek sürükleyici deneyimin sahibi ol!", "13:55",false)
        val m6=Mail(6,R.drawable.lcwaiki,"Lc Waikiki","Eylül ayı indirimleri başladı ", "Uygulamamıza girerek %50 indirimden faydalanabilirsiniz!", "12:55",false)
        val m7=Mail(7,R.drawable.marti,"Martı","Martı kiralamak ister misiniz? ", "Martı kiralamak isterseniz tam zamanı . %30 indirim hakkı hesabınıza tanımlanmıştır", "11:23",false)
        val m8=Mail(8,R.drawable.papara,"Papara","Paran geldiiii ! ", "Merhaba Musa, Hesabına 350 ₺ geldi . Güle güle kullan", "10:59",false)
        val m9=Mail(9,R.drawable.yemeksepeti,"Yemek Sepeti","Bizimle çalışmak ister misin?", "Merhaba musa bey. Sizlere bir iş teklfi ile gelmek istedim.  ", "10:55",false)
        val m10=Mail(10,R.drawable.hepsiburada,"HepsiBurada","Welcome!!!", "Hoşgeldini musa bey", "09:55",false)
        val m11=Mail(11,R.drawable.n11,"n11","Bilgisayar ihtiyacınız mı var !", "Bilgisayar almak için tam zamanı. Ekim ayına kadar sürecek kampanyayı sürebilirsiniz. ", "09:00",false)
        val m12=Mail(12,R.drawable.teknasyon,"Teknasyon","Aramıza Hoşgeldinnn!", "Seni aramızda görmekten mutluluk duyuyoru", "08:55",false)
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
        val mailAdapter=MailAdapter(requireContext(),mailListesi)
        binding.rv.adapter= mailAdapter
        return binding.root
    }

}