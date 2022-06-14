package com.codeyuba.submisionbmaap.utils


import com.codeyuba.submisionbmaap.R

import com.codeyuba.submisionbmaap.model.Motor

object MotorcycleData {

    private var nameData = arrayOf(
        "Honda Beat",
        "Honda Beat Street",
        "Honda CBR 150",
        "Honda CBR 250",
        "Honda Forza",
        "Honda Genio",
        "Honda ADV",
        "Honda CBX",
        "Honda Monkey",
        "Honda PCX"
    )

    private var series = arrayOf(
        "Beat Series",
        "Beat Series",
        "CBR Sporty",
        "CBR Sporty",
        "Forza Seriees",
        "Genio Series",
        "ADV Series",
        "CBX Series",
        "Monkey Series",
        "PCX Series"
    )

    private var photo = intArrayOf(
        R.drawable.honda_beat,
        R.drawable.honda_beat_street,
        R.drawable.honda_cbr_150,
        R.drawable.honda_cbr_250,
        R.drawable.honda_forza,
        R.drawable.honda_genio,
        R.drawable.honda_hdv_125,
        R.drawable.honda_cbx_150x,
        R.drawable.honda_monkey,
        R.drawable.honda_pcx_150
    )

    private var copling = arrayOf(
        "Matic",
        "Matic",
        "Manual",
        "Manual",
        "Manual",
        "Matic",
        "Matic",
        "Manual",
        "Manual",
        "Matic"
    )

    private var liters = arrayOf(
        "4 l",
        "4 l",
        "11.1 l",
        "13.5 l",
        "13.4 l",
        "8.1 l",
        "12 l",
        "6 l",
        "12 l",
        "8.1 l"
    )

    private var machine = arrayOf(
        "4 Langkah",
        "4 Langkah",
        "150 cc DOHC 4-katup 4-tak",
        "250 cc DOHC 4-katup 4-tak",
        "150 cc DOHC 4-katup 4-tak",
        "4 Langkah",
        "SOHC 4 Langkah",
        "DOHC 4 Katup Air Cooled",
        "4 Stroke,SOHC",
        "4 Langkah ESP"
    )

    private var transmision = arrayOf(
        "Automatic",
        "Automatic",
        "Manual 4 Speed",
        "Manual 6 Speed",
        "Manual 4 Speed",
        "Automatic",
        "Manual 4 Speed",
        "Manual 4 Speed",
        "Manual 4 Speed",
        "Automatic"
    )


    private var description = arrayOf(
        "Honda BeAT eSP ini merupakan skuter matik yang dikembangkan dengan konsep yang serba pas dan sesuai. Di mana Honda BeAT eSP ini memiliki ukuran desain yang lebih slim dan kompak, dengan bentuk wedge shape yang tampak lebih runcing sehingga memberikan kesan stylish. Selain itu, konsep stylish tersebut juga didukung dengan performa mesin yang cukup bertenaga di mana Honda BeAT eSP ini hadir dengan mengusung mesin SOHC berpendingin udara 4-langkah berkapasitas 110 cc yang siap melaju dengan kecepatan yang mumpuni. Selain itu, dengan diusungnya teknologi eSP ini akan menjadikan motor matik ini lebih irit bahan bakar dan tentunya lebih ramah lingkungan. Bahkan, Honda BeAT eSP ini pun juga bakal dilengkapi dengan fitur-fitur canggih yang akan menunjang keamanan serta kenyamanan bagi para pengemudinya setiap berkendara.",

        "Kini pabrikan asal Jepang tersebut dikabarkan juga akan segera merilis skutik matik dari jajaran keluarga skutik Beat juga, yaitu Honda Beat Street eSP.\n" +
                "\n" +
                "Skutik ini memang sengaja diproduksi oleh pihak Honda sebagai pesaing dari Yamaha X-Ride yang sebelumnya sudah dirilis terlebih dahulu dengan mengusung gaya desain adventure.\n" +
                "\n" +
                "Sehingga Honda Beat Street eSP ini tentu akan sangat cocok bagi para pengguna yang hobi menjelajah di berbagai medan jalan.\n" +
                "\n" +
                "Selain itu, dengan tampilan luarnya yang anti mainstream dibandingkan skutik lain sekelasnya, tentu Honda Beat Street eSP akan lebih memikat perhatian setiap calon penggunanya.",
        "Honda CBR150R adalah sebuah sepeda motor sport 4 tak 150cc yang merupakan bagian dari Seri Honda CBR keluaran A.P. Honda. Motor ini dirancang sebagai pengganti sepeda motor Honda NSR 150 2 tak ditujukan terutama untuk pasar Asia Tenggara. Motor ini sudah dijual di Thailand sejak tahun 2002 dan telah diekspor ke banyak negara Asia Tenggara, India, bahkan juga diekspor ke Afrika Selatan. Sepeda motor ini dimasukkan dalam kategori sepeda motor sport kelas pemula.",

        "Honda CBR250RR adalah sebuah sepeda motor sport bermesin 250 cc yang diproduksi oleh Astra Honda Motor, cabang Honda di Indonesia. Sepeda motor ini diperkenalkan pada bulan Juli 2016 di Jakarta.[5] Kegiatan produksi CBR250RR dimulai pada bulan November pada tahun yang sama.\n" +
                "\n" +
                "Sebelumnya, nama \"CBR250RR\" pernah digunakan oleh Honda untuk sebuah sepeda motor sport bermesin 4-silinder segaris yang diproduksi dari tahun 1990 sampai 1996.",

        "Honda Forza 2022 semakin mewah dengan tampilan Premium Big Scooter dengan mesin terbaru 250cc eSP+. Rasakan kenikmatan berkendara dengan Honda Forza 2022",

        "Genio menggendong mesin berkapasitas 110cc SOHC, dengan sistem pembakaran injeksi PGM-FI. Tenaga maksimal mesin ini mencapai 6,6 kW @ 7.500 rpm dan torsi puncak di 9,3 Nm @ 5.500 rpm. Kemampuan ini sanggup membuat Honda Genio lebih responsif saat berakselerasi. Mampu menempuh jarak 0-200 meter hanya dalam 12,4 detik.",


        "Honda ADV 150 2022, skutik penjelahan tangguh Honda yang didesain untuk menghadirkan pengalaman berkendara yang berbeda melalui desain yang futuristik dan",
        "Sepeda motor sport Honda CBX diproduksi oleh Honda dari tahun 1978 hingga 1982. Dengan mesin enam silinder segaris 1047cc yang menghasilkan 105 bhp, itu adalah andalan dari jajaran Honda. CBX diterima dengan baik oleh pers, tetapi terjual habis oleh saudaranya yang diperkenalkan pada akhir 1979\"\n",

        "Berkendara dengan gaya clasic dan bertenaga ala anak milenial ,Monkey minimalis desain yang sporty dan clasic menjadi daya tarik motor ini",

        "PCX Dilengkapi dengan fitur-fitur canggih yang merupakan inovasi terbaru dari Honda sehinga memberikan pengalaman berkendara yang istimewa untuk melengkapi gaya hidup anda yang selalu menjadi inspirasi"


    )


    val listData: ArrayList<Motor>
        get() {
            val list = arrayListOf<Motor>()
            for (position in nameData.indices) {
                val motor = Motor()
                motor.name = nameData[position]
                motor.series = series[position]
                motor.fuel = liters[position]
                motor.machine = machine[position]
                motor.coplingType = copling[position]
                motor.transmision = transmision[position]
                motor.description = description[position]
                motor.photo = photo[position]

                list.add(motor)
            }
            return list
        }
}