/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.edu.unidavi.gamepong;

import java.io.InputStream;
import java.util.Scanner;

/**
 *
 * @author Edgar
 */

public class TrataCliente implements Runnable {
 
   private final InputStream cliente;
   private final Servidor servidor;
 
   public TrataCliente(InputStream cliente, Servidor servidor) {
     this.cliente = cliente;
     this.servidor = servidor;
   }
 
   @Override
   public void run() {
     
     Scanner s = new Scanner(this.cliente);
     while (s.hasNextLine()) {
       servidor.distribuiMensagem(s.nextLine());
     }
     s.close();
   }
 }