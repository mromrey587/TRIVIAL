
package com.mycompany.pruebawhile;

import java.util.Scanner;


public class Pruebawhile {

    public static void main(String[] args) {
    final String amarillo="\u001B[33m";
        final String green = "\u001B[32m";
        final String red="\u001B[31m";
        final String BOLD = "\u001B[1m";
        final String purple="\u001B[35m";
        final String cian="\u001B[36m";
        final String white= "\u001B[37m";
        
        
        
        System.out.println("=============================================");
        System.out.println("=============================================");
        System.out.println("==                                         ==");
        System.out.println(purple+"==                                         ==");
        System.out.println(amarillo+"==              TRIVIAL "+green+"FUTBOL"+amarillo+"             ==");
        System.out.println(cian+"==                                         =="+white);
        System.out.println("==                                         ==");
        System.out.println("=============================================");
        System.out.println("=============================================");
        
        
        System.out.println("Introduce tu nombre: ");
        String nombre = new Scanner (System.in).nextLine();
        System.out.println("hola "+nombre+" Este es un trivial de tipo test con preguntas generales sobre futbol\n"
                + "-Introduce los numeros del 1 al 3 donde estaran las respuestas correspomndientes\n"
                + "-Cada respuesta bien sumará 100 puntos, pero las respuestas incorrectas restaran 25\n"
                + "-Al final del programa le pondrá su puntuación que si es perfecta tendrá sorpresa\n\n");
        
        String preguntas[]={"Quien gano el mundial en el 2018?","Quien a ganado el ultimo balon de oro?","Cuantos balones de oro tiene Messi?","Quien a ganado la ultima Champions?","Quien a ganado la Bundesliga el ultimo anio?","En que equipo juega Messi?","Quien es la persona que ha ganado mas mundiales?","Contra quien masrco Cristiano de chilena?","En que seleccion juega Lewandowski?","Quien de estas leyendas no es Brasilenio?","Cual es la seleccion con mas copas del mundo?","Quien fue la persona mas joven en ganar un mundial?" };
        String respuestas[]={"1-Francia\n2-Espania\n3-Belgica","1-Messi\n2-Mane\n3-Benzema","1-5\n2-6\n3-7","1-Liverpool\n2-Madrid\n3-Brcelona","1-Bayern de Munich\n2-Dortmund\n3-Leipzig","1-FC Barcelona\n2-Manchester City\n3-PSG","1-Pele\n2-Maradona\n3-Platini","1-FC Barcelona\n2-Napoles\n3-Juventus","1-Polonia\n2-España\n3-Eslovaquia","1-cafu\n2-Ronaldo\n3-Lampard","1-Alemania\n2-Brasil\n3-Italia","1-Mbappe\n2-Pele\n3-Zidane"};
        
        
        int buenas[]={1,3,3,2,1,3,1,3,1,3,2,2};
        int puntos=0;
        
        
        int random = (int) (Math.random() * ((preguntas.length-1)+1-0))+0;
        System.out.println(preguntas[random]);
        System.out.println(respuestas[random]);
        System.out.println(nombre+" Pon la respuesta:");
        int respuesta1=new Scanner(System.in).nextInt();
        
        if (respuesta1==buenas[random]){
            puntos=puntos+100;
            System.out.println("Es buena");
        System.out.println("Has ganado 100 puntos\n\n");}
        else
        {
            puntos=puntos-25;
            System.out.println("Es mala");
            System.out.println("Has perdido 25 puntos\n\n");}
        buenas[random]=0;
        
        
        int random2 = (int) (Math.random() * ((preguntas.length-1)+1-0))+0;
        
        if (buenas[random2]==0)
            random2++;
        else
        {System.out.println("");}
        System.out.println(preguntas[random2]);
        System.out.println(respuestas[random2]);
        System.out.println(nombre+" Pon la respuesta:");
        int respuesta2=new Scanner(System.in).nextInt();
        
        if (respuesta2==buenas[random2]){
            puntos=puntos+100;
            System.out.println("Es buena");
        System.out.println("Has ganado 100 puntos\n\n");}
        else
        {
            puntos=puntos-25;
            System.out.println("Es mala");
            System.out.println("Has perdido 25 puntos\n\n");}
       
        buenas[random2]=0;
        
        
        
        int random3 = (int) (Math.random() * ((preguntas.length-1)+1-0))+0;
        if (buenas[random3]==0)
            random3++;
        else
            if (buenas[random3]==0)
                random3++;
            else
                {System.out.println("");}
        System.out.println(preguntas[random3]);
        System.out.println(respuestas[random3]);
        System.out.println(nombre+" Pon la respuesta:");
        int respuesta3=new Scanner(System.in).nextInt();
        
        if (respuesta3==buenas[random3]){
            puntos=puntos+100;
            System.out.println("Es buena");
        System.out.println("Has ganado 100 puntos\n\n");}
        else
        {
            puntos=puntos-25;
            System.out.println("Es mala");
            System.out.println("Has perdido 25 puntos\n\n");}
        buenas[random3]=0;
        
        
        
        int random4 = (int) (Math.random() * ((preguntas.length-1)+1-0))+0;
        if (buenas[random4]==0)
            random4++;
        else
            if (buenas[random4]==0)
                random4++;
            else
                if (buenas[random4]==0)
                random4++;
                else
            {System.out.println("");}
        
        
        System.out.println(preguntas[random4]);
        System.out.println(respuestas[random4]);
        System.out.println(nombre+" Pon la respuesta:");
        int respuesta4=new Scanner(System.in).nextInt();
        
        if (respuesta4==buenas[random4]){
            puntos=puntos+100;
            System.out.println("Es buena");
        System.out.println("Has ganado 100 puntos\n\n");}
        else
        {
            puntos=puntos-25;
            System.out.println("Es mala");
            System.out.println("Has perdido 25 puntos\n\n");}
        buenas[random4]=0;
        
        
        
        int random5 = (int) (Math.random() * ((preguntas.length-1)+1-0))+0;
        if (buenas[random5]==0)
            random5++;
        else
            if (buenas[random5]==0)
                random5++;
            else
                if (buenas[random5]==0)
                    random5++;
                else
                    if (buenas[random5]==0)
                        random5++;
                    else
                        {System.out.println("");}
        System.out.println(preguntas[random5]);
        System.out.println(respuestas[random5]);
        System.out.println(nombre+" Pon la respuesta:");
        int respuesta5=new Scanner(System.in).nextInt();
        
        if (respuesta5==buenas[random5]){
            puntos=puntos+100;
            System.out.println("Es buena");
        System.out.println("Has ganado 100 puntos\n\n");}
        else
        {
            puntos=puntos-25;
            System.out.println("Es mala");
            System.out.println("Has perdido 25 puntos\n\n");}
        buenas[random5]=0;
        
        
        
        
        int random6 = (int) (Math.random() * ((preguntas.length-1)+1-0))+0;
        if (buenas[random6]==0)
            random6++;
        else
            if (buenas[random6]==0)
                random6++;
            else
                if (buenas[random6]==0)
                    random6++;
                else
                    if (buenas[random6]==0)
                        random6++;
                    else
                        if (buenas[random6]==0)
                        random6++;
                    else
                         System.out.println("");      
        System.out.println(preguntas[random6]);
        System.out.println(respuestas[random6]);
        System.out.println(nombre+" Pon la respuesta:");
        int respuesta6=new Scanner(System.in).nextInt();
        
        if (respuesta6==buenas[random6]){
           puntos=puntos+100;
            System.out.println("Es buena");
        System.out.println("Has ganado 100 puntos\n\n");}
        else
        {
            puntos=puntos-25;
            System.out.println("Es mala");
            System.out.println("Has perdido 25 puntos\n\n");}
        buenas[random6]=0;
        
        int random7 = (int) (Math.random() * ((preguntas.length-1)+1-0))+0;
        if (buenas[random7]==0)
            random7++;
        else
            if (buenas[random7]==0)
                random7++;
            else
                if (buenas[random7]==0)
                    random7++;
                else
                    if (buenas[random7]==0)
                        random7++;
                    else
                        if (buenas[random7]==0)
                        random7++;
                        else
                            if (buenas[random7]==0)
                            random7++;
                            else
                         System.out.println(""); 
        System.out.println(preguntas[random7]);
        System.out.println(respuestas[random7]);
        System.out.println(nombre+" Pon la respuesta:");
        int respuesta7=new Scanner(System.in).nextInt();
        
        if (respuesta7==buenas[random7]){
            puntos=puntos+100;
            System.out.println("Es buena");
        System.out.println("Has ganado 100 puntos\n\n");}
        else
        {
            puntos=puntos-25;
            System.out.println("Es mala");
            System.out.println("Has perdido 25 puntos\n\n");}
        buenas[random7]=0;
        
        
        
        int random8 = (int) (Math.random() * ((preguntas.length-1)+1-0))+0;
        if (buenas[random8]==0)
            random8++;
        else
            if (buenas[random8]==0)
                random8++;
            else
                if (buenas[random8]==0)
                    random8++;
                else
                    if (buenas[random8]==0)
                        random8++;
                    else
                        if (buenas[random8]==0)
                        random8++;
                        else
                            if (buenas[random8]==0)
                            random8++;
                            else
                                if (buenas[random8]==0)
                                random8++;
                                else
        System.out.println(preguntas[random8]);
        System.out.println(respuestas[random8]);
        System.out.println(nombre+" Pon la respuesta:");
        int respuesta8=new Scanner(System.in).nextInt();
        
        if (respuesta8==buenas[random8]){
            puntos=puntos+100;
            System.out.println("Es buena");
        System.out.println("Has ganado 100 puntos\n\n");}
        else
        {
            puntos=puntos-25;
            System.out.println("Es mala");
            System.out.println("Has perdido 25 puntos\n\n");}
        buenas[random8]=0;
        
        if (puntos==800)
            System.out.println(green+"Enhorabuena lo has hecho perfecto con "+puntos+" puntos");
        else
            if (puntos>=400)
                System.out.println(cian+"Esta bien has aprobado con "+puntos+" puntos");
            else
                if ((puntos>=0) &&(puntos<400))
                    System.out.println(amarillo+"Sigue intentandolo tienes "+puntos+" puntos");
                else
                    System.out.println(red+"Tu puntuacion es negativa, No te dediques a esto "+puntos+" puntos");
        
    }
    
}
      
        
    