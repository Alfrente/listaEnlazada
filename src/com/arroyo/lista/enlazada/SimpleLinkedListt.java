package com.arroyo.lista.enlazada;

public class SimpleLinkedListt {
    private Node firt;

    public SimpleLinkedListt() {
        this.firt = null;
    }

    public SimpleLinkedListt(Node firt) {
        super();
    }

    public void push(Object obj) {
        Node newNode = new Node(obj);
        newNode.setNext(this.firt);
        this.firt = newNode;
    }

    public Node pop() {
        Node temp = this.firt;
        this.firt = this.firt.next();
        return temp;
    }

    public Node delete(Object val) {
        Node currentNode = this.firt;
        Node previousNode = this.firt;

        while (!currentNode.value().equals(val)) {
            if (currentNode.next() == null) {
                return null;
            } else {
                previousNode = currentNode;
                currentNode = currentNode.next();
            }
        }

        if (currentNode == this.firt) {
            this.firt = this.firt.next();
        } else {
            previousNode.setNext(currentNode.next());
        }

        return currentNode;
    }

    public boolean isEmpry() {
        return (this.firt == null);
    }

    public Node contains(Object val) {
        Node currentNode = this.firt;

        while (!currentNode.value().equals(val)) {
            if (currentNode.next() == null) {
                return null;
            } else {
                currentNode = currentNode.next();
            }
        }
        return currentNode;
    }

    public Node insert(Object value, Object newValue) {
        Node newNode = new Node(newValue);
        Node currentNode = this.firt;

        while (!currentNode.value().equals(value)) {
            if (currentNode.next() == null) {
                return null;
            } else {
                currentNode = currentNode.next();
            }
        }

        newNode.setNext(currentNode.next());
        currentNode.setNext(newNode);

        return newNode;
    }

    public void printContent() {
        Node currentNode = firt;

        System.out.println("Mostrar elementos de la lista enlazada");
        while (currentNode != null) {
            currentNode.showContent();
            currentNode = currentNode.next();
        }
    }

}
