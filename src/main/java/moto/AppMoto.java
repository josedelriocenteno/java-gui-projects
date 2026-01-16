/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package moto;

import moto.Moto;

/**
 *
 * @author macarena
 */
public class AppMoto {
    
    public static void main(String[] args) {
        
        //creamos la moto
        Moto miMoto=new Moto("1234ABC", "BMW", 2, "XXY", 120, 150, 15);
        //creamos la interfaz y la pasamos el objeto Moto creado
        GUIMoto gui=new GUIMoto(miMoto);
        gui.setVisible(true);
        
    }
    
}
