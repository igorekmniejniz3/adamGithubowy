package com.company;

import java.time.LocalDateTime;
import java.util.Date;

public class Car<T extends Number & Comparable, T1 extends Number & Comparable, T2 extends Number & Comparable> implements Comparable<Car> {
    static int carLicznik = 1;
    int id;
    String marka;
    T1 masa;
    T2 dlugosc;
    T szerokosc;

    public Car(String marka, T1 masa, T2 dlugosc, T szerokosc) {
        this.id = carLicznik++;
        this.marka = marka;
        this.masa = masa;
        this.dlugosc = dlugosc;
        this.szerokosc = szerokosc;
    }

    @Override
    public int compareTo(Car car) {
        int hour = LocalDateTime.now().getHour();
        int minute = LocalDateTime.now().getMinute();
        System.out.println(hour+" : "+minute);
        if(hour<12){
            System.out.println("przed południem");
            if(this.masa.compareTo(car.masa) > 0) return 1;
            if(this.masa.compareTo(car.masa) < 0) return -1;
            if(this.masa.compareTo(car.masa) == 0) return 0;
        }else{
            System.out.println("po południu");
            if(this.masa.compareTo(car.masa) > 0) return 1;
            if(this.masa.compareTo(car.masa) < 0) return -1;
            if(this.masa == car.masa) {
                if(this.dlugosc.compareTo(car.dlugosc) > 0) return 1;
                if(this.dlugosc.compareTo(car.dlugosc) < 1) return -1;
                if(this.dlugosc == car.dlugosc){
                    if(this.szerokosc.compareTo(car.szerokosc) > 0) return 1;
                    if(this.szerokosc.compareTo(car.szerokosc) < 0) return -1;
                    if(this.szerokosc == car.szerokosc) return 0;
                }
            }
        }

        return 0;//-1  1  0

    }
}
