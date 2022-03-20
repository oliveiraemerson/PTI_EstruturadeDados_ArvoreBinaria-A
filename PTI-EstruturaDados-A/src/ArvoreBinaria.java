
public class ArvoreBinaria { private No raiz; Integer esquerda = 0;	  
	public void insert(long id, Object element)
    {	
	    No newNo = new No(id, element, null, null);
	    if (raiz == null) 
	    {
	      raiz = newNo;
	    } 
	    else 
        {	      
	    	No atual = raiz; No pai;
	    	while (true) 
	    	{
	    		pai = atual;
	        
	    		if (id < atual.getId()) 
	    		{
	    			atual = atual.getEsq();
	          
	    			if (atual == null) 
	    			{ 
	    				pai.setEsq(newNo);
	    				return;
	    			}
	    		} 
	    		else 
	    		{	          
	    			atual = atual.getDir();
	          
	    			if (atual == null) 
	    			{ 
	    				pai.setDir(newNo);
	    				return;
	    			}
	    		}
	    	}
        }
    }
	  
	private void preFixado(No atual)
	{
		if (atual != null) 
		{
			preFixado(atual.getDir());
			preFixado(atual.getEsq());
			if(atual.getEsq() != null)
			{	
				System.out.println("Id: "+atual.getId()+" Elemento: "+atual.getElemento()+" Esqueda");
				esquerda++;
			}
		}
	}	
	public void imprimeElementosArvore()
	{
		preFixado(raiz);
		System.out.println("Número de nós a esquerda: " + esquerda);
	} 
}
