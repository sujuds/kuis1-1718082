package com.example.silsilahkeluarga;

import java.util.ArrayList;

public class KeluargaData {
    private static String[] keluargaNama = {
            "I Ketut Mastra",
            "Anak Agung Istri Sayang",
            "Sujud Satwikayana",
            "Ayu Evita Satwikayani",
            "Komang Restu Satwikayana"
    };

    private static String[] keluargaKeterangan = {
            "Ayah",
            "Ibu",
            "Anak Pertama",
            "Anak Kedua",
            "Anak Ketiga"
    };

    private static int[] heroesImages = {
            R.drawable.mastra,
            R.drawable.sayang,
            R.drawable.sujud,
            R.drawable.ayu,
            R.drawable.restu
    };

    static ArrayList<Keluarga> getListData() {
        ArrayList<Keluarga> list = new ArrayList<>();
        for (int pos = 0; pos < keluargaNama.length; pos++){
            Keluarga keluarga = new Keluarga();
            keluarga.setNama(keluargaNama[pos]);
            keluarga.setKeterangan(keluargaKeterangan[pos]);
            keluarga.setFoto(heroesImages[pos]);
            list.add(keluarga);
        }
        return list;
    }
}
