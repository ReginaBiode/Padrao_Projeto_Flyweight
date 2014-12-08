/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import br.com.senai.arquitetura.vo.Shape;
import br.com.senai.arquitetura.vo.ShapeFactory;
import java.awt.Graphics;
import javax.swing.JPanel;
import static junit.framework.Assert.assertEquals;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


/**
 *
 * @author Regina Biode
 */
public class Teste{
    
    ShapeFactory fabrica;
    Graphics g;
    JPanel panel;
    
    public Teste() {
    }
    
    @Before
    public void setUp() {
        System.out.println("Iniciado teste");
        fabrica = new ShapeFactory();
        panel = new JPanel();   
        
    }
    
    @After
    public void tearDown() {
        //fabrica = null;
        //g = null;
        //panel = null;
        System.out.println("Fim do teste.");
    }
    
    @Test
    public void testFabrica(){
        Shape ret1 = fabrica.getShape(ShapeFactory.ShapeType.RET);
        Shape ret2 = fabrica.getShape(ShapeFactory.ShapeType.RET);
        assertEquals(ret1, ret2);
    }
}
