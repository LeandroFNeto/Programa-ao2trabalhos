/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.scanprog2;

/**
 *
 * @author LeandroNeto
 */
public class ScanProg2 {

    public static void main(String[] args) {
         String caminho = "D:\\Users\\LeandroNeto\\Documents\\NetBeansProjects\\ScanProg2\\Arquivo.txt"; 
        LeitorArquivo leitor = new LeitorArquivo();
        String resultado = leitor.lerArquivo(caminho);
        System.out.println(resultado);
    }
}
