class HolaMundo{
	public static void main(String[] args){
		
		System.out.println("HolaMundo!!");
		
		String nombre = "Cesar ";
		System.out.println("Hola " + nombre);
		
		System.out.println("Tipos de valores");
		byte  unByte = -128; //hasta 127
		System.out.println("Byte " + unByte);
		
		int numero = 1234567890;
		System.out.println("Entero " + numero);
		
		float decimalfloat = 1.234567f;
		System.out.println("decimalfloat " + decimalfloat);
		
		double decimaldouble = 1.2345678901515421544845485454894894915154478456165;
		System.out.println("decimaldouble " + decimaldouble);
		
		long entlargo = 1234567890123456789L; //hasta trillones
		System.out.println("enterolargo " + entlargo);
		
		char caracterASCI = 115;//'z';
		System.out.println("caracterASCI " + caracterASCI);
		
		{
			char[] texto = {'a' , 'b' , 'c'};
			
			for (int i = 0;i<texto.length; i++){
				System.out.println("caracter " + texto[1]);
			}
			
		
		}

		
	}
}