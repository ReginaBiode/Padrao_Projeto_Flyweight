/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.senai.arquitetura.vo;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author Regina Biode
 */
public class FillRetangulo implements Shape{
    

    private boolean fill;
    
    public FillRetangulo(boolean f) {
        this.fill=f;
        System.out.println("Criando Objeto Retângulo com preenchimento = "+f);
        //adding time delay
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    
    
    @Override
    public void draw(Graphics r, int x, int y, int width, int height, Color color) {
     
        r.setColor(color);
        r.drawRect(x, y, width, height);
        if(fill){
            r.fillRect(x, y, width, height);
        }
    }
    
}
