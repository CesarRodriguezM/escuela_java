class EstructurasControl {
	
	public static void main (String[] argumentos){
		for (int i = 0; i < argumentos.length; i++){
			System.out.println("Arg " + argumentos[i]);
		}
		
		int i = 0;
		while(i < argumentos.length){
			System.out.println("Arg" + argumentos[i]);
		}do{
			System.out.println("Siempre se muestra");
			
		}while(false);
		
		int valor = 0;
		switch (valor) {
			
			case 0:
			System.out.println("Valor cero");
			break;
			
			case 1:
			System.out.println("Valor uno");
			break;
			
			case 2:
			System.out.println("Valor dos");
			break;
			
			default:
			System.out.println("Otro Valor");
			break;
			
			
			
		}
	
	}
	
}
