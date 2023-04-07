package huff;

public class HuffmannClient {
    public static void main(String[] args){
        String str="abbccda";
        HuffmanEncoder hf = new HuffmanEncoder(str);
        String codeString = hf.encoder(str);
        System.out.println(codeString);
        String output = hf.decoder(codeString);
        System.out.println(output);
    }
}
