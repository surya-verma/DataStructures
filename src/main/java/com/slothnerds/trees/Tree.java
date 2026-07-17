package com.slothnerds.trees;

import java.util.ArrayList;
import java.util.List;

class Node {
    int data;
    List<Node> children;

    Node(int x) {
        data = x;
        children = new ArrayList<>();
    }
}

public class Tree {

    static void addChild(Node parent, Node child) {
        parent.children.add(child);
    }

    static void removeChild(Node parent, Node child) {
        parent.children.remove(child);
    }

    static void printLeafNodes(Node node) {
        if (node.children.isEmpty()) {
            System.out.println(node.data);
            return;
        }
        for (Node child : node.children) {
            printLeafNodes(child);
        }
    }

    static void printDegrees(Node node, Node parent) {
        int degree = node.children.size();
        if (parent != null)
            degree++;
        System.out.println(node.data + " -> " + degree);

        for (Node child : node.children)
            printDegrees(child, node);
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        Node child1 = new Node(2);
        Node child2 = new Node(3);
        Node child3 = new Node(4);
        Node child4 = new Node(5);

        addChild(root, child1);
        addChild(root, child2);
        addChild(child1, child3);
        addChild(child1, child4);

        System.out.println("Leaf nodes:");
        printLeafNodes(root);

        System.out.println("\nDegrees of nodes:");
        printDegrees(root, null);
    }
}
