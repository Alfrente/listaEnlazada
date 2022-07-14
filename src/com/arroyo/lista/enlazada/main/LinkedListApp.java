package com.arroyo.lista.enlazada.main;

import com.arroyo.lista.enlazada.Node;
import com.arroyo.lista.enlazada.SimpleLinkedListt;

import java.util.LinkedList;
import java.util.List;

public class LinkedListApp {
    public static void main(String[] args) {
        SimpleLinkedListt list= new SimpleLinkedListt();
        list.push(31.22);
        list.push(215.22);
        list.push(122);

        list.printContent();

        Node nodo = list.insert(122, 75);

        if (nodo == null){
            System.out.println("No se puedo inserta");
        }else {
            System.out.println("Se inserto en el nodo");
        }

        System.out.println("Nuevo contenido");
        list.printContent();

        nodo = list.contains(122);
        if (nodo == null){
            System.out.println("No se encontro");
        }else {
            System.out.println("Se encontro");
        }

        System.out.println("Eliminacion de nod");
        while (!list.isEmpry()){
            nodo = list.pop();
            System.out.println("Nodo eliminado");
            nodo.showContent();
        }

        List<String> lsi =new LinkedList<>();
        list.printContent();

        list.push("cat");
        list.push("dop");
        list.printContent();

        list.delete("cat");
        System.out.println("Eliminacion de cat");
        list.printContent();
    }
}
