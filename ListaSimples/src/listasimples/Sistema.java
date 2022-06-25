/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listasimples;

import listasimples.CircularArray;
/**
 *
 * @author DELL
 */
public class Sistema {
    public static void main(String[] args) {
        CircularArray array = new CircularArray();

        array.adicionaElemento(10);
        array.adicionaElemento(20);

        array.removeElemento();

        System.out.println(array.array[0]);
        System.out.println(array.size());
    }
}
