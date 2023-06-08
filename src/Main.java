public class Main {
    public static void main(String[] args) {
        //Try to solve on paper the following boolean algebra operations:
        //[A]: 2 <= 2 && !true ---- Si 2<= 2 es verdadero, y !true es por logica false,
        // por logica la condicion es false
        System.out.println("Exercise A:");
        if (2 <= 2 && !true){
            System.out.println("true");
        }else{
            System.out.println("false");
        }

        //[B]: !false && 3 > 2 ----- !false es true y 3>2 es Verdadero, la condicion seria verdadera.
        System.out.println("Exercise B:");
        if (!false && 3 > 2){
            System.out.println("true");
        }else{
            System.out.println("false");
        }

        //[C]: considering that t=false and f=true: !(!t || f) ---- el operador logico "||" evalua como true
        //si uno de los operandos es true, pero gracias aloperador logico "!" se invierte el valor, por lo tanto
        //la condicion resulta false
        System.out.println("Exercise C:");
        boolean t = false;
        boolean f = true;
        if (!(!t || f)){
            System.out.println("true");
        }else{
            System.out.println("false");
        }

        //[D]: 6 > 6 ^ !(true && true) ---- primero !(true && true) resulta false, luego resta 6 ^ false
        //que se traduce a 6 ^ 0, y la respuesta seria 6, luego solo resta 6 > 6, que es false,
        //por lo tanto la condicion resulta false.
        System.out.println("Exercise D:");
        if (6 > 6 ^ !(true && true)){
            System.out.println("true");
        }else{
            System.out.println("false");
        }

        //Then compare your solutions with a Java program that tests the validity of your assumptions.
    }
}