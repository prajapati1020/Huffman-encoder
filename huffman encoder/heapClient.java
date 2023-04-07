package huff;

public class heapClient {
    public static void main(String[] args){
        heap he = new heap();
        he.add(10);
        he.display();
        he.add(20);
        he.display();
        he.add(300);
        he.display();
        he.add(40);
        he.display();
        he.add(6);
        he.display();
        he.add(9);
        he.display();
        System.out.println("Min heap created");

        System.out.println("removing elements from min heap");
        System.out.println(he.remove());
        he.display();
        System.out.println(he.remove());
        he.display();
        System.out.println(he.remove());
        he.display();
        System.out.println(he.remove());
        he.display();
        System.out.println(he.remove());
        he.display();
    }

}
