package com.codeyuba.submisionbmaap.utils

import com.codeyuba.submisionbmaap.R
import com.codeyuba.submisionbmaap.model.Motor

object MotorcycleData {
    private var allData = arrayOf(
        arrayOf(
            "Honda Beat",
            "Beat Series",
            "4 l",
            "${R.drawable.honda_beat}",
            "4 Steps",
            "Automatic",
            "Matic",
            "Honda BeAT eSP ini merupakan skuter matik yang dikembangkan dengan konsep yang serba pas dan sesuai. Di mana Honda BeAT eSP ini memiliki ukuran desain yang lebih slim dan kompak, dengan bentuk wedge shape yang tampak lebih runcing sehingga memberikan kesan stylish. Selain itu, konsep stylish tersebut juga didukung dengan performa mesin yang cukup bertenaga di mana Honda BeAT eSP ini hadir dengan mengusung mesin SOHC berpendingin udara 4-langkah berkapasitas 110 cc yang siap melaju dengan kecepatan yang mumpuni. Selain itu, dengan diusungnya teknologi eSP ini akan menjadikan motor matik ini lebih irit bahan bakar dan tentunya lebih ramah lingkungan. Bahkan, Honda BeAT eSP ini pun juga bakal dilengkapi dengan fitur-fitur canggih yang akan menunjang keamanan serta kenyamanan bagi para pengemudinya setiap berkendara."
        ),
        arrayOf(
            "Honda Beat Street",
            "Beat Series",
            "4 l",
            R.drawable.honda_beat_street,
            "4 Steps",
            "Automatic",
            "Matic",
            "Kini pabrikan asal Jepang tersebut dikabarkan juga akan segera merilis skutik matik dari jajaran keluarga skutik Beat juga, yaitu Honda Beat Street eSP.\n" +
                    "\n" +
                    "Skutik ini memang sengaja diproduksi oleh pihak Honda sebagai pesaing dari Yamaha X-Ride yang sebelumnya sudah dirilis terlebih dahulu dengan mengusung gaya desain adventure.\n" +
                    "\n" +
                    "Sehingga Honda Beat Street eSP ini tentu akan sangat cocok bagi para pengguna yang hobi menjelajah di berbagai medan jalan.\n" +
                    "\n" +
                    "Selain itu, dengan tampilan luarnya yang anti mainstream dibandingkan skutik lain sekelasnya, tentu Honda Beat Street eSP akan lebih memikat perhatian setiap calon penggunanya."
        ),
        arrayOf(
            "Honda CBR 150",
            "Cbr Series",
            "13.5 l",
            R.drawable.honda_cbr_150,
            "150 cc DOHC 4-katup 4-tak",
            "Manual",
            "Manual",
            "Honda CBR150R adalah sebuah sepeda motor sport 4 tak 150cc yang merupakan bagian dari Seri Honda CBR keluaran A.P. Honda. Motor ini dirancang sebagai pengganti sepeda motor Honda NSR 150 2 tak ditujukan terutama untuk pasar Asia Tenggara. Motor ini sudah dijual di Thailand sejak tahun 2002 dan telah diekspor ke banyak negara Asia Tenggara, India, bahkan juga diekspor ke Afrika Selatan. Sepeda motor ini dimasukkan dalam kategori sepeda motor sport kelas pemula."
        ),
        arrayOf(
            "Honda CBR 250",
            "Cbr Series",
            "13.5 l",
            R.drawable.honda_cbr_250,
            "4 Steps",
            "Automatic",
            "Matic",
            "Honda CBR250RR adalah sebuah sepeda motor sport bermesin 250 cc yang diproduksi oleh Astra Honda Motor, cabang Honda di Indonesia. Sepeda motor ini diperkenalkan pada bulan Juli 2016 di Jakarta.[5] Kegiatan produksi CBR250RR dimulai pada bulan November pada tahun yang sama.\n" +
                    "\n" +
                    "Sebelumnya, nama \"CBR250RR\" pernah digunakan oleh Honda untuk sebuah sepeda motor sport bermesin 4-silinder segaris yang diproduksi dari tahun 1990 sampai 1996."
        ),
        arrayOf(
            "Honda Forza",
            "Cbx Series",
            "13.4 l",
            R.drawable.honda_forza,
            "4 Steps",
            "Automatic",
            "Matic",
            "Sepeda motor sport Honda CBX diproduksi oleh Honda dari tahun 1978 hingga 1982. Dengan mesin enam silinder segaris 1047cc yang menghasilkan 105 bhp, itu adalah andalan dari jajaran Honda. CBX diterima dengan baik oleh pers, tetapi terjual habis oleh saudaranya yang diperkenalkan pada akhir 1979"
        ),
        arrayOf(
            "Honda Genio",
            "Beat Series",
            "4 L",
            R.drawable.honda_genio,
            "4 Steps",
            "" +
                    "Automatic",
            "Matic",
            "Genio menggendong mesin berkapasitas 110cc SOHC, dengan sistem pembakaran injeksi PGM-FI. Tenaga maksimal mesin ini mencapai 6,6 kW @ 7.500 rpm dan torsi puncak di 9,3 Nm @ 5.500 rpm. Kemampuan ini sanggup membuat Honda Genio lebih responsif saat berakselerasi. Mampu menempuh jarak 0-200 meter hanya dalam 12,4 detik."
        ),
        arrayOf(
            "Honda HDV",
            "ADV",
            "8 l",
            "${R.drawable.honda_hdv_125}",
            "4 Langkah, SOHC",
            "Otomatis,V-Matic",
            "Matic",
            "Mudah dikendalikan dan lincah tiap berkendara dengan teknologi baru yang siap jalan ke berbagai tujuan"
        ),
        arrayOf(
            "Honda CBX",
            "CB Sporty",
            "12 l",
            R.drawable.honda_cbx_150x,
            "4 Langkah, DOHC 4 Katup",
            "Manual, 6 Speed",
            "Multiple Wet Clutch",
            "Sepeda motor sport Honda CBX diproduksi oleh Honda dari tahun 1978 hingga 1982. Dengan mesin enam silinder segaris 1047cc yang menghasilkan 105 bhp, itu adalah andalan dari jajaran Honda. CBX diterima dengan baik oleh pers, tetapi terjual habis oleh saudaranya yang diperkenalkan pada akhir 1979\"\n"
        ),
        arrayOf(
            "Honda Monkey",
            "Classic Sporty",
            "12 l",
            R.drawable.honda_monkey,
            "Air Cooled, 4 Stroke,SOHC",
            "4 speed",
            "Wet,Multi Clutch",
            "Berkendara dengan gaya clasic dan bertenaga ala anak milenial , desain yang sporty dan clasic menjadi daya tarik motor ini"
        ),
        arrayOf(
            "Honda PCX",
            "PCX Series",
            "8.1 l",
            R.drawable.honda_pcx_150,
            "4 Langkah ESP",
            "Otomatis,V-Matic",
            "Otomatis, Sentrifugal, Tipe Kering",
            "Dilengkapi dengan fitur-fitur canggih yang merupakan inovasi terbaru dari Honda sehinga memberikan pengalaman berkendara yang istimewa untuk melengkapi gaya hidup anda yang selalu menjadi inspirasi"
        )
    )

    val listData :ArrayList<Motor>
        get() {
            val list = ArrayList<Motor>()
            for (data in allData){
                val motor = Motor()
                motor.name = data[0] as String
                motor.series = data[1] as String
                motor.fuel = data[2] as String
                motor.photo = data[3]
                motor.machine = data[4] as String
                motor.coplingType = data[5] as String
                motor.transmision = data[6] as String
                motor.description = data[7] as String

                list.add(motor)
            }
            return list
        }


}