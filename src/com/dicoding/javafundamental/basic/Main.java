package com.dicoding.javafundamental.basic;

import com.dicoding.javafundamental.basic.Kendaraan.Kereta;
import com.dicoding.javafundamental.basic.Kendaraan.Mobil;
import com.dicoding.javafundamental.basic.Kendaraan.Motor;
import com.dicoding.javafundamental.basic.Musik.Gitar;
import org.apache.commons.lang3.time.DateUtils;

import java.util.Date;


public class Main {
    public static void main (String[] args) {
        System.out.println("Hello world!");
        Gitar.bunyi();
        Mobil.jumlahBan();
        Motor.jumlahBan();
        Kereta.jumlahBan();
        Date today = new Date();
        System.out.println("Hari ini = " + today);
        Date tomorrow = DateUtils.addDays(today,1);
        System.out.println("Besok = " + tomorrow);
    }
}
