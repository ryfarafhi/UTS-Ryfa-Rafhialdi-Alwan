/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank;

import java.util.Scanner;

/**
 *
 * @author hp
 */
public class bank {
     int Saldo;
    Scanner masukan = new Scanner(System.in);

    public bank(int saldo){
        this.Saldo = saldo;
    }
    
    void getSaldo(){
        System.out.println("Saldo Anda Saat ini : Rp. " + Saldo);
    }
    
    void simpanUang(int simpanUang){
       simpanUang = masukan.nextInt();
       Saldo = simpanUang + Saldo;
       System.out.println("Saldo Anda Saat ini : Rp. " + Saldo); 
    }
    
    void ambilUang(int ambilUang){
       ambilUang = masukan.nextInt();
        if(Saldo <= ambilUang){
            System.out.println("Maaf Saldo Anda Tidak Mencukupi !!!");
        } else Saldo = Saldo - ambilUang;
            System.out.println("Saldo Anda Saat ini adalah Rp: " + Saldo);
    }
}
