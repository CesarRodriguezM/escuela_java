class Operadores{
	
	public static void main (String[] argumentos){ 
		/*
		//operador binario
		System.out.println("Has puesto " + argumentos[0]);
		
		if ( "aa".equals (argumentos[0]))
			System.out.println("Quieres dos AA");
			
		else
			System.out.println("Quieres otra cosa");
		
		
		//operador ternario
		
		System.out.println("Has puesto " + argumentos[0]);
		System.out.println(5!=5 ? "Pues si " : "Pues no");
		
		if ( "aa".equals (argumentos[0]))
			System.out.println("Quieres dos AA");
			
		else
			System.out.println("Quieres otra cosa");
		
		*/
		// operador ternario
		
		
		System.out.println("Has puesto " + argumentos[0]);
		System.out.println(5!=5 ? "Pues si " : "Pues no");
		
		if ( "aa".equals (argumentos[0]))
			System.out.println("Quieres dos AA");
			
		else
			System.out.println("Quieres otra cosa");
			System.out.println("Quieres dos " + ("aa".equals(argumentos[0]) ? "AA" : "Otra cosa" ));
			
		byte result = 113 & 199;
		System.out.println("AND binario = " + result);
		
	}
	
	
}
