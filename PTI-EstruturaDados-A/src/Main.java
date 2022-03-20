class Main {
  public static void main(String[] args) {
	  ArvoreBinaria tree = new ArvoreBinaria(); // cria a árvore binária
      tree.insert(10, "A");
      tree.insert(5 , "B"); 
      tree.insert(9 , "C"); 
      tree.insert(2 , "D");
      tree.insert(7 , "E");
      tree.insert(12, "F"); 
      tree.insert(6 , "G");
      tree.insert(8 , "H");
      tree.insert(15, "F"); 
      tree.insert(4 , "G");
      tree.insert(1 , "H");
      tree.imprimeElementosArvore();
	  //System.out.println("Número do nós a esquerda "+ tree.totalEsquerda());
  }
}