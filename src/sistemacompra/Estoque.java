package sistemacompra;

import java.util.ArrayList;
import java.util.List;

public class Estoque {
    private final List<String> produtos = new ArrayList<>();

    public Estoque() {
        produtos.add("-iPhone 13");
        produtos.add("-iPhone 13 Pro");
        produtos.add("-iPhone 13 Pro Max");
        produtos.add("-iPhone 14 Pro");
        produtos.add("-iPhone 14 Pro Max");
        produtos.add("-iPhone 15 Pro");
        produtos.add("-iPhone 16 Pro");
        produtos.add("-iPhone 17");
        produtos.add("-iPhone 17 Pro Max");
    }

	public void exibirEstoque(){
        if (produtos.isEmpty()){
            System.out.println("\nNão temos produto em estoque no momento. Aguarde a reposição!");
        } else {
            System.out.println("\n----------PRODUTOS DISPONÍVEIS----------");
            System.out.println();
		    for (String p : produtos) {
		        System.out.println(p);
		    }
        }			
	}
}
