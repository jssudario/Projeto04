import java.util.TreeMap;
import java.util.TreeSet;

public class App {
    public static void main(String[] args) {
        TreeSet<String> arvore = new TreeSet<>(); // não deixa repetir elemento
        arvore.add("Tonico");
        arvore.add("Fulano");
        arvore.add("Beltrano");
        arvore.add("Ciclano");
        

        System.out.println(arvore);
        for (String conteudo : arvore) {
            System.out.println(conteudo);
        }
        
        TreeMap<String, Integer> arvoreMap =  new TreeMap<>();

        arvoreMap.put("Tonico",10);
        arvoreMap.put("Fulano",30);
        arvoreMap.put("Beltrano",45);
        arvoreMap.put("Ciclano",5);
        

        System.out.println(arvoreMap);
        System.out.println(arvoreMap.get("Fulano"));

    }
}
