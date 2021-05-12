package cn.me.study.basicType1.linkList;

public class Main {

    public static void main(String[] args) {


        Node parent = new Node(0,null);

        Node current = parent;
        for(int i=1;i<=10;i++){
            current.setNext(new Node(i,null));
            current = current.getNext();
        }

        fun(parent);


    }

    public static void fun(Node parent){
        Node current = parent;
        while(current!=null){
            System.out.println(current.value);
            current = current.getNext();
        }
    }


}
