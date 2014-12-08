/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.senai.arquitetura.vo;

import java.util.HashMap;

/**
 *
 * @author Regina Biode
 */
public class ShapeFactory {
    
    private static final HashMap<ShapeType,Shape> shapes;
 
    static {
        shapes = new HashMap<>();
    }
    
    public static Shape getShape(ShapeType type) {
        Shape shapeImpl = shapes.get(type);
 
        if (shapeImpl == null) {
            if (type.equals(ShapeType. RET_FILL)) {
                shapeImpl = new FillRetangulo(true);
            } else if (type.equals(ShapeType.RET_NOFILL)) {
                shapeImpl = new FillRetangulo(false);
            } else if (type.equals(ShapeType.RET)) {
                shapeImpl = new Retangulo();
            }
            shapes.put(type, shapeImpl);
        }
        return shapeImpl;
    }    
    
    public static enum ShapeType{
        RET_FILL,RET_NOFILL,RET;
    }
}
