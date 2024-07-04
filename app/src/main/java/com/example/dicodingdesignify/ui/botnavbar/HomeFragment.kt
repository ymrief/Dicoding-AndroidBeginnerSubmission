package com.example.dicodingdesignify.ui.botnavbar

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.dicodingdesignify.R
import com.example.dicodingdesignify.data.DataModels
import com.example.dicodingdesignify.databinding.FragmentHomeBinding
import com.example.dicodingdesignify.ui.DetailActivity
import com.example.dicodingdesignify.ui.adapter.RVAdapter

class HomeFragment : Fragment(), RVAdapter.OnItemClickListener {

    private lateinit var binding: FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val listLukisan = mutableListOf<DataModels>(
            DataModels(
                R.drawable.monalisa,
                "Mona Lisa",
                "Leonardo da Vinci",
                "1503-1506",
                "Mona Lisa adalah salah satu karya seni paling terkenal di dunia, yang dipamerkan di Museum Louvre, Paris. Lukisan ini menampilkan potret seorang wanita dengan ekspresi wajah yang misterius, sering digambarkan sebagai enigma senyuman Mona Lisa. Karya ini terkenal karena teknik sfumato yang digunakan oleh da Vinci, memberikan transisi halus antara warna dan bayangan, serta detail realistis yang luar biasa pada wajah dan tangan."
            ),
            DataModels(
                R.drawable.the_starry_night,
                "The Starry Night",
                "Vincent van Gogh",
                "1889",
                "The Starry Night adalah salah satu lukisan paling terkenal karya Vincent van Gogh, menggambarkan langit malam yang berputar di atas desa Saint-Rémy-de-Provence. Lukisan ini diciptakan saat van Gogh berada di rumah sakit jiwa, dan memancarkan perasaan emosi dan dinamisme melalui sapuan kuas yang energik dan warna yang mencolok. Bintang-bintang yang bersinar terang dan bulan sabit di langit malam memberikan kesan mendalam tentang keindahan alam dan ketidakpastian mental yang dialami van Gogh."
            ),
            DataModels(
                R.drawable.the_scream,
                "The Scream",
                "Edvard Munch",
                "1893",
                "The Scream adalah ikon seni ekspresionis yang dilukis oleh Edvard Munch. Lukisan ini menampilkan sosok manusia yang tampak ketakutan dengan latar belakang langit yang berwarna oranye dan merah, memberikan kesan kecemasan dan keterasingan. Munch menggambarkan emosi manusia yang mendalam melalui penggunaan warna yang kuat dan garis-garis yang mengalir, menciptakan suasana yang mencekam dan intens."
            ),
            DataModels(
                R.drawable.the_last_supper,
                "The Last Supper",
                "Leonardo da Vinci",
                "1495-1498",
                "The Last Supper adalah mural besar yang dilukis oleh Leonardo da Vinci, menggambarkan momen terakhir Yesus bersama para muridnya sebelum penyaliban. Lukisan ini terkenal karena komposisinya yang dramatis dan penggunaan perspektif yang canggih, menciptakan kedalaman dan realisme yang luar biasa. Setiap murid digambarkan dengan ekspresi dan gerakan yang berbeda, mengekspresikan reaksi mereka terhadap pengumuman pengkhianatan oleh salah satu dari mereka."
            ),
            DataModels(
                R.drawable.the_kiss,
                "The Kiss",
                "Gustav Klimt",
                "1907-1908",
                "The Kiss adalah lukisan yang penuh dengan ornamen dan simbolisme yang dilukis oleh Gustav Klimt. Lukisan ini menampilkan sepasang kekasih yang berciuman, dengan tubuh mereka dibalut oleh jubah-jubah dekoratif yang dihiasi dengan pola emas dan perak. Klimt menggunakan gaya Art Nouveau yang khas, menciptakan karya yang memancarkan keindahan, keintiman, dan kehangatan cinta."
            ),
            DataModels(
                R.drawable.the_dream,
                "The Dream",
                "Pablo Picasso",
                "1932",
                "The Dream (Le Rêve) adalah salah satu lukisan paling terkenal dari periode Kubisme Picasso. Lukisan ini menampilkan potret kekasih Picasso, Marie-Thérèse Walter, dengan gaya yang sangat terdistorsi dan menggunakan palet warna yang kuat. Karya ini mencerminkan inovasi dan keahlian Picasso dalam mengeksplorasi bentuk dan perspektif, menciptakan gambar yang penuh dengan emosi dan makna simbolis."
            ),
            DataModels(
                R.drawable.the_arnolfini_portrait,
                "The Arnolfini Portrait",
                "Jan van Eyck",
                "1434",
                "The Arnolfini Portrait adalah salah satu karya seni paling terkenal dari era Renaisans awal, yang dilukis oleh Jan van Eyck. Lukisan ini menggambarkan pasangan suami istri Arnolfini dalam interior rumah mereka, dengan detail yang luar biasa dan penggunaan cahaya yang realistis. Van Eyck dikenal karena teknik cat minyaknya yang inovatif, memberikan tekstur dan kedalaman pada setiap objek dalam lukisan ini."
            ),
            DataModels(
                R.drawable.guernica,
                "Guernica",
                "Pablo Picasso",
                "1937",
                "Guernica adalah lukisan besar yang dilukis oleh Pablo Picasso sebagai respons terhadap pengeboman kota Guernica selama Perang Saudara Spanyol. Lukisan ini menggunakan gaya Kubisme dan palet warna monokrom untuk menggambarkan kekejaman dan penderitaan yang diakibatkan oleh perang. Guernica menjadi simbol perdamaian dan protes terhadap kekerasan, dengan komposisi yang kompleks dan penuh dengan simbol-simbol yang kuat."
            ),
            DataModels(
                R.drawable.girl_with_a_pearl_earring,
                "Girl with a Pearl Earring",
                "Johannes Vermeer",
                "1665",
                "Girl with a Pearl Earring adalah salah satu lukisan paling terkenal karya Johannes Vermeer, sering disebut sebagai \"Mona Lisa dari Utara\". Lukisan ini menampilkan seorang gadis muda dengan anting-anting mutiara yang besar, mengenakan turban eksotis, dan melihat ke arah penonton dengan tatapan yang lembut. Vermeer menggunakan teknik cahaya dan bayangan yang halus untuk menciptakan efek realisme dan keintiman yang luar biasa."
            ),
            DataModels(
                R.drawable.arrangement_in_grey_and_black_no_1,
                "Arrangement in Grey and Black No. 1",
                "James McNeill Whistler",
                "1871",
                "Arrangement in Grey and Black No. 1, yang lebih dikenal sebagai Whistler's Mother, adalah salah satu lukisan paling terkenal karya James McNeill Whistler. Lukisan ini menampilkan potret ibunya yang duduk di samping dinding dengan latar belakang yang sederhana dan monokromatik. Whistler menekankan bentuk dan komposisi dalam karya ini, menciptakan gambar yang tenang dan penuh hormat terhadap sosok ibu."
            )
        )

        with(binding) {
            rvPainting.layoutManager = LinearLayoutManager(rvPainting.context)
            rvPainting.setHasFixedSize(true)

            val adapter = RVAdapter()
            adapter.isiList(listLukisan)

            rvPainting.adapter = adapter.apply {
                listener = this@HomeFragment
            }
        }
    }

    override fun onItemClicked(item: DataModels) {
        val intent = Intent(requireContext(), DetailActivity::class.java)
        intent.putExtra("context", item)
        startActivity(intent)
    }

}