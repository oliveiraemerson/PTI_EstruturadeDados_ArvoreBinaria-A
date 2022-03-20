public class No {
	  private long id;
	  private No esquerdo;
	  private No direito;
	  private Object elemento;
	  
	  public No(long id, Object elemento, No esquerdo, No direito)
	  {
	    this.id = id;
	    this.esquerdo = esquerdo;
	    this.direito = direito;
	    this.elemento = elemento;	    
	  }
	  
	  public void setId(long id)
	  {
	    this.id = id;
	  }
	  
	  public long getId()
	  {
	    return this.id;
	  }

	  public void setEsq(No esquerdo)
	  {
	    this.esquerdo = esquerdo;
	  }
	  
	  public No getEsq()
	  {
	    return esquerdo;
	  }
	  
	  public void setDir(No direito)
	  {
	    this.direito = direito;
	  }
	  
	  public No getDir()
	  {
	    return direito;
	  }
	  
	  public void setElemento(Object elemento)
	  {
	    this.elemento = elemento;
	  }
	  
	  public Object getElemento()
	  {
	    return elemento;
	  }
}
