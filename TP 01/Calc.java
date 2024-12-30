import java.io.IO;

void input( ){
    String input = IO.readln("introduire votre chaine : ");
    IO.println(input);
    int number1 = Integer.parseInt(IO.readln("Saisissez le premier chiffre : \n"));
    int number2 = Integer.parseInt(IO.readln("introduire le deuxième nombtre: \n"));
    IO.println("la somme est égale à : "+ (number1+number2));
    IO.println("le produit est égale à : "+ (number1*number2));
    IO.println("la différence est égale à : "+ (number1-number2));
    IO.println("la division est égale à : "+ (number1/number2));
    IO.println("le reste est égale à : "+ (number1 % number2));
}

void main(){
   input();
}
