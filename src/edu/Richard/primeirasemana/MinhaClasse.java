package edu.Richard.primeirasemana;
public class MinhaClasse {
    
public static void main (String [] args) {
    String primerioNome = "Richard";
    String segundoNome = "Silva";

    String nomeCompleto = nomeCompleto (primerioNome, segundoNome);

    System.out.println(nomeCompleto);

}

public static String nomeCompleto (String primeiroNome, String segundoNome){
    return "Resultado do método: " + primeiroNome.concat(" ").concat(segundoNome);
}

}
