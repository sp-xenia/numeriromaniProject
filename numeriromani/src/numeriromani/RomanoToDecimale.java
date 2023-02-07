package numeriromani;

public class RomanoToDecimale {
	
	public static int converti(String input) {
		String numeroRomano = input.toUpperCase();
		numeroRomano = numeroRomano.replaceAll("\\s", "");
		
        int conversione = 0;
        int successivo = 0;
        for (int i = numeroRomano.length()-1; i>=0 ; i--) {
            char lettera = numeroRomano.charAt(i);
            int decimale = LetteraToDecimale.getDecimale(lettera);
            conversione += getValore(decimale,successivo);
            successivo=decimale;
        }
        return conversione;
    }

    private static int getValore(int n, int successivo) {
        if (n >= successivo) {
            return n;
        } else {
            return -1*n;
        }
    }

    public static void main(String args[]) {
    	System.out.println(converti("Mm CM   LiII"));
    } 
}
