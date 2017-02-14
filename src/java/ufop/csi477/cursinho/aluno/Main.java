/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufop.csi477.cursinho.aluno;

import com.vaadin.annotations.VaadinServletConfiguration;
import com.vaadin.server.VaadinRequest;
import com.vaadin.server.VaadinServlet;
import com.vaadin.ui.UI;
import javax.servlet.annotation.WebServlet;

/**
 *
 * @author davidson
 */
public class Main extends UI {

    //Comentario do Daniel
    //Mas meu comentario eh melhor!
    //N sei usar git!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
    //Eu sou o Rei do Git - att, Bruno Lacerda
    
    @Override
    protected void init(VaadinRequest request) {
        
        
    }
    
    @WebServlet(urlPatterns = "/*", name = "MyUIServlet", asyncSupported = true)
    @VaadinServletConfiguration(ui = Main.class, productionMode = false)
    public static class MyUIServlet extends VaadinServlet {
    }
    
}
