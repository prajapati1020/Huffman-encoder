package trie1;

public class client {
    public static void main(String[] args){
        tr trie = new tr();
        trie.addWord("arts");
        trie.addWord("art");
        trie.addWord("bug");
        trie.addWord("boy");
        trie.addWord("sea");
        trie.addWord("seen");
        trie.addWord("see");
        trie.addWord("amit");

        trie.display();
        System.out.println("*************************");
System.out.println(trie.search("art"));
        System.out.println("*************************");
trie.remove("arts");
trie.display();
System.out.println("*************************");
trie.remove("art");
trie.display();

    }
}
