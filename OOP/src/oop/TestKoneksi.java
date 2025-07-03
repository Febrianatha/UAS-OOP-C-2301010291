/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop;

import java.sql.Connection;
        
/**
 *
 * @author febib
 */
public class TestKoneksi {
    public static void main(String[] args) {
        Connection c = dbkoneksi.koneksi();
        if(c != null){
            System.out.println("Koneksi berhasil!");
        } else {
            System.out.println("Koneksi gagal!");
        }
    }
    
}
