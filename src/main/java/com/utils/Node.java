package com.utils;

import java.util.ArrayList;
import java.util.List;

public class Node{

    private int value;
    private Node parentNode;
    private String name;
    private List<Node> childNodes;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Node getParentNode() {
        return parentNode;
    }

    public void setParentNode(Node parentNode) {
        this.parentNode = parentNode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Node> getChildNodes() {
        return childNodes;
    }

    public void setChildNodes(List<Node> childNodes) {
        this.childNodes = childNodes;
    }

    public Node(Node node, String name){
        this.name = name;
        this.parentNode = node;
        this.childNodes = new ArrayList<>();
        this.value = 0;

        if (this.parentNode != null){
            this.parentNode.childNodes.add(this);
        }
    }

    public int getNodesBelow100k(){
        int result = 0;
        int maxValue = 100000;
        for (Node node : childNodes){
            if (node.childNodes.size() == 0){
                if (node.value <= maxValue)
                    result += node.value;
            }
            else {
                int partResult = node.getNodesBelow100k();
                result += partResult;

                    if (node.value <= maxValue)
                        result += node.value;
            }
        }

        return result;
    }

    public void addAllNodeValues(){
        for (Node node : childNodes){
         if (node.childNodes.size() == 0){
             node.parentNode.value += node.value;
         }
         else {
             node.addAllNodeValues();
             node.parentNode.value += node.value;
         }
        }
    }
}
