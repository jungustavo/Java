
public class FuncoesString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String original = "abcde FGHIJ ABC abc DEFG ";
		String s01 = original.toLowerCase(); // Minuscula
		String s02 = original.toUpperCase();// Maiuscula
		String s03 = original.trim(); // remover espaços vazios na String
		String s04 = original.substring(2);// retorna a string a partir da posicao x
		String s05 = original.substring(2, 9); // retrona a string a partir do intervalo entre x e y
		String s06 = original.replace('a', 'x'); // substitui valor 1 por valor 2
		String s07 = original.replace("abc", "xy");
		int i = original.indexOf("bc"); // retorna a primeira posicao do valor referenciado | BC = 1
		int j = original.lastIndexOf("bc"); // retorna a ultima posicao do valor referenciado BC = 17
		
		System.out.println("Original: -" + original + "-");
		System.out.println("toLowerCase: -" + s01 + "-");
		System.out.println("toUpperCase: -" + s02 + "-");
		System.out.println("trim: -" + s03 + "-");
		System.out.println("substring(2): -" + s04 + "-");
		System.out.println("substring(2, 9): -" + s05 + "-");
		System.out.println("replace('a', 'x'): -" + s06 + "-");
		System.out.println("replace('abc', 'xy'): -" + s07 + "-");
		System.out.println("Index of 'bc': " + i);
		System.out.println("Last index of 'bc': " + j);
		
	}

}
